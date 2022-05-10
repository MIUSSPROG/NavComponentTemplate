package com.example.navcomponenttemplate.screens.tabs

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navcomponenttemplate.R
import com.example.navcomponenttemplate.databinding.FragmentDashboardBinding

class DashboardFragment: Fragment(R.layout.fragment_dashboard) {

    private lateinit var binding: FragmentDashboardBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentDashboardBinding.bind(view)
        binding.btnGoToDetail.setOnClickListener {
            findNavController().navigate(DashboardFragmentDirections.actionDashboardFragmentToDetailFragment())
        }
    }
}