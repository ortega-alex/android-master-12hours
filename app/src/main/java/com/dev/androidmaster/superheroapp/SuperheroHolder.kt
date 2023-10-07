package com.dev.androidmaster.superheroapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.dev.androidmaster.databinding.ItemSuperheroBinding
import com.squareup.picasso.Picasso

class SuperheroHolder(view:View):RecyclerView.ViewHolder(view) {

    private val binding = ItemSuperheroBinding.bind(view)

    fun bind(superheroItemResponse: SuperheroItemResponse,  onItemSelected: (String) -> Unit) {
        binding.tvSuperheroName.text = superheroItemResponse.name
        Picasso.get().load(superheroItemResponse.supeheroImage.url).into(binding.ivSuperhero)
        binding.root.setOnClickListener { onItemSelected(superheroItemResponse.superheroId) }
    }
}