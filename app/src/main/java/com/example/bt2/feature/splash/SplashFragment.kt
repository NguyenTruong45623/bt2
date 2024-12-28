package com.example.bt2.feature.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.commit
import com.example.bt2.R
import com.example.bt2.databinding.FragmentSplashBinding
import com.example.bt2.feature.welcome.WelcomeFragment

class SplashFragment : Fragment() {


    private lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSplashBinding.inflate(inflater, container, false)

        Handler(Looper.getMainLooper()).postDelayed({
            parentFragmentManager.commit {
                replace(R.id.fragment_container, WelcomeFragment())
            }

        }, 5000)

        return binding.root
    }
}