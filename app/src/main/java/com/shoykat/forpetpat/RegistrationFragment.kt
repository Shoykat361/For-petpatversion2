package com.shoykat.forpetpat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.shoykat.forpetpat.Adapter.RegistrationFromAdapter
import com.shoykat.forpetpat.databinding.FragmentRegistrationBinding

class RegistrationFragment : Fragment() {
    private lateinit var binding: FragmentRegistrationBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegistrationBinding.inflate(inflater, container, false)
        val registrationFromAdapter = RegistrationFromAdapter()
        binding.registrationRv.layoutManager= LinearLayoutManager(requireActivity())
        binding.registrationRv.adapter=registrationFromAdapter
        return binding.root
    }
}