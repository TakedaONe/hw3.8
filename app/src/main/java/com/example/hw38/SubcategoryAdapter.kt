package com.example.hw38

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hw38.databinding.ItemSubcategoryBinding

class SubcategoryAdapter(
    private val subcategoryList: List<Subcategory>
) : RecyclerView.Adapter<SubcategoryAdapter.SubcategoryViewHolder>() {

    inner class SubcategoryViewHolder(val binding: ItemSubcategoryBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubcategoryViewHolder {
        val binding = ItemSubcategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SubcategoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SubcategoryViewHolder, position: Int) {
        val subcategory = subcategoryList[position]
        holder.binding.carName.text = subcategory.name
        holder.binding.carDescription.text = subcategory.description
        holder.binding.carImage.setImageResource(subcategory.imageResId)
    }

    override fun getItemCount() = subcategoryList.size
}
