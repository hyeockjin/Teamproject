package com.example.teamproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.teamproject.databinding.FragmentMissionBinding

class missionFragment : Fragment() {
    var _binding: FragmentMissionBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentMissionBinding.inflate(inflater, container, false)

        return binding.root
    }
}