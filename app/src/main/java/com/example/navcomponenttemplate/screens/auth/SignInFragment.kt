package com.example.navcomponenttemplate.screens.auth

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navcomponenttemplate.R
import com.example.navcomponenttemplate.databinding.FragmentSignInBinding
import com.example.navcomponenttemplate.utils.prefs

class SignInFragment: Fragment(R.layout.fragment_sign_in) {

    private lateinit var binding: FragmentSignInBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentSignInBinding.bind(view)
        binding.btnSignUp.setOnClickListener {
            findNavController().navigate(
                SignInFragmentDirections.actionSignInFragmentToSignUpFragment())
        }

        binding.btnSignIn.setOnClickListener {
            binding.apply {
                if (etLoginSignIn.text.toString() == prefs.login && etPasswordSignIn.text.toString() == prefs.password) {
                    findNavController().navigate(SignInFragmentDirections.actionSignInFragmentToTabsFragment())
                }
            }
        }
    }
}