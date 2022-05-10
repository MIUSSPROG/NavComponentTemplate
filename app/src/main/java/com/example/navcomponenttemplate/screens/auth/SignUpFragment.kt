package com.example.navcomponenttemplate.screens.auth

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navcomponenttemplate.R
import com.example.navcomponenttemplate.databinding.FragmentSignUpBinding
import com.example.navcomponenttemplate.utils.prefs

class SignUpFragment: Fragment(R.layout.fragment_sign_up) {

    private lateinit var binding: FragmentSignUpBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentSignUpBinding.bind(view)
        binding.btnReg.setOnClickListener {
            prefs.isSignedIn = true
            prefs.login = binding.etLoginSignUp.text.toString()
            prefs.password = binding.etPasswordSignUp.text.toString()
            findNavController().popBackStack()
        }
    }
}