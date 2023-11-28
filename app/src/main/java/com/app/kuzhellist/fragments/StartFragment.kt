package com.app.kuzhellist.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.kuzhellist.ModelOfAnimal
import com.app.kuzhellist.adapter.CustomAdapter
import com.app.kuzhellist.databinding.FragmentStartBinding


class StartFragment : Fragment() {
    private lateinit var binding: FragmentStartBinding
    private val list = mutableListOf(
        ModelOfAnimal(
            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Lion_waiting_in_Namibia.jpg/1200px-Lion_waiting_in_Namibia.jpg",
            "Lion",
            "Mammal",
            "The lion (Panthera leo) is a large cat of the genus Panthera native to Africa and India. It has a muscular, broad-chested body;"
        ), ModelOfAnimal(
            "https://i.natgeofe.com/n/b8a16028-034a-4cc3-8691-a10c86709b3c/snakes_19.jpg?w=1084.125&h=721.875",
            "Snake",
            "Reptile",
            "Snake, any of more than 3400 species of reptiles distinguished by their limbless condition and greatly elongated body and tail."
        ), ModelOfAnimal(
            "https://www.thesprucepets.com/thmb/y4YEErOurgco9QQO-zJ6Ld1yVkQ=/3000x0/filters:no_upscale():strip_icc()/english-dog-breeds-4788340-hero-14a64cf053ca40f78e5bd078b052d97f.jpg",
            "Dog",
            "Mammal",
            "A dog is a domestic mammal of the family Canidae and the order Carnivora. Its scientific name is Canis lupus familiaris. "
        )
    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentStartBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclers.setHasFixedSize(true)
        binding.recyclers.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclers.adapter = CustomAdapter(
            requireActivity(), list
        ) {
            val action = StartFragmentDirections.actionStartFragmentToDetailFragment2(list[it])
            findNavController().navigate(action)
        }
    }
}