package com.mrayhanap.simpleviewmodel.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.mrayhanap.simpleviewmodel.R
import com.mrayhanap.simpleviewmodel.databinding.FragmentCounterBinding
import com.mrayhanap.simpleviewmodel.viewmodel.CounterViewModel

class CounterFragment : Fragment() {

        private lateinit var viewModel: CounterViewModel
        private lateinit var binding: FragmentCounterBinding

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            binding = DataBindingUtil.inflate(inflater, R.layout.fragment_counter, container, false)
            viewModel = ViewModelProvider(this).get(CounterViewModel::class.java)
            binding.counterViewModel = viewModel
            binding.lifecycleOwner = this
            return binding.root
        }
}