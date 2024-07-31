package com.example.hw38

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hw38.databinding.FragmentSubcategoryListBinding

class SubcategoryListFragment : Fragment() {

    private var _binding: FragmentSubcategoryListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSubcategoryListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val subcategoryList = listOf(
            Subcategory("X5", "Description of X5", R.drawable.x5_image),
            Subcategory("X6", "Description of X6", R.drawable.x6_image)
        )

        val adapter = SubcategoryAdapter(subcategoryList)

        binding.recyclerViewSubcategory.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerViewSubcategory.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
