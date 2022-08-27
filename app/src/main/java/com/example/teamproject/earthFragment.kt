package com.example.teamproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.teamproject.databinding.FragmentEarthBinding

class earthFragment : Fragment() {
    var _binding: FragmentEarthBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentEarthBinding.inflate(inflater, container, false)

        return binding.root
    }
}