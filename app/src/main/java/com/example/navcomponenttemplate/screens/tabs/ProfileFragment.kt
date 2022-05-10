package com.example.navcomponenttemplate.screens.tabs

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.example.navcomponenttemplate.R
import com.example.navcomponenttemplate.databinding.FragmentProfileBinding
import com.example.navcomponenttemplate.utils.findTopNavController
import com.example.navcomponenttemplate.utils.prefs

class ProfileFragment: Fragment(R.layout.fragment_profile) {

    private lateinit var binding: FragmentProfileBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProfileBinding.bind(view)
        binding.imgvExit.setOnClickListener {
            prefs.isSignedIn = false
            prefs.login = null
            prefs.password = null
            findTopNavController().navigate(R.id.signInFragment, null, navOptions {
                popUpTo(R.id.tabsFragment){
                    inclusive = true
                }
            })
        }

    }
}