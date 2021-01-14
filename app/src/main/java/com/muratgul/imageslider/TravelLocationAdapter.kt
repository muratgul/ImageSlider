package com.muratgul.imageslider

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.flaviofaria.kenburnsview.KenBurnsView
import com.squareup.picasso.Picasso

class TravelLocationAdapter : RecyclerView.Adapter<TravelLocationAdapter.TravelLocationViewHolder>() {

    private var travelLocations = emptyList<TravelLocation>()

    class TravelLocationViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val kbvLocation = itemView.findViewById<KenBurnsView>(R.id.kbvLocation)
        val textTitle = itemView.findViewById<TextView>(R.id.textTitle)
        val textLocation = itemView.findViewById<TextView>(R.id.textLocation)
        val textStarRating = itemView.findViewById<TextView>(R.id.textStarRating)

        fun setLocationData(travelLocation: TravelLocation){
            Picasso.get().load(travelLocation.imageUrl).into(kbvLocation)
            textTitle.setText(travelLocation.title)
            textLocation.setText(travelLocation.location)
            textStarRating.setText(travelLocation.starRating.toString())
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TravelLocationViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_contanier_location, parent, false)
        return TravelLocationViewHolder(view)
    }

    override fun onBindViewHolder(holder: TravelLocationViewHolder, position: Int) {
        holder.setLocationData(travelLocations[position])
    }

    override fun getItemCount(): Int {
        return travelLocations.size
    }

    fun setData(newList: List<TravelLocation>) {
        travelLocations = newList
        notifyDataSetChanged()
    }

}