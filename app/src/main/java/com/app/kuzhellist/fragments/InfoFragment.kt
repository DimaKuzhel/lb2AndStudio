package com.app.kuzhellist.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.kuzhellist.ModelOfAnimal
import com.app.kuzhellist.databinding.FragmentInfoBinding
import com.bumptech.glide.Glide


class InfoFragment : Fragment() {
    private lateinit var binding: FragmentInfoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dataModel: ModelOfAnimal? = arguments?.getParcelable("animal")
        binding = FragmentInfoBinding.inflate(inflater, container, false)
        binding.textViewForDetail.text= dataModel?.details
        binding.textViewForName.text= dataModel?.name
        Glide.with(requireContext())
            .load(dataModel?.image)
            .circleCrop()
            .into(binding.imageForDetail)
        return binding.root
    }
}