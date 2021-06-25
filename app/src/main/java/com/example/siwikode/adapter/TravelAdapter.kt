package com.example.siwikode.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.siwikode.R
import com.example.siwikode.model.Travel

class TravelAdapter(
    private val listTravel: ArrayList<Travel>,
):RecyclerView.Adapter<TravelAdapter.TravelViewHolder>() {

    private lateinit var  onItemClickCallBack: OnItemClickCallBack

    fun setOnItemClickCallBack(onItemClickCallBack: OnItemClickCallBack){
        this.onItemClickCallBack = onItemClickCallBack
    }

    interface OnItemClickCallBack {
        fun onItemClicked(data: Travel)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TravelViewHolder {
        val view: View = LayoutInflater
            .from(parent.context).inflate(R.layout.item_travel, parent, false)

        return TravelViewHolder(view)
    }


    inner class TravelViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var tvTitle: TextView = itemView.findViewById(R.id.tv_title)
        var tvRate: TextView = itemView.findViewById(R.id.tv_rate)
        var tvType: TextView = itemView.findViewById(R.id.tv_type)
        var imgTravel: ImageView = itemView.findViewById(R.id.img_travel)
    }


    override fun onBindViewHolder(holder: TravelViewHolder, position: Int){

        with(listTravel[position]){
            holder.tvTitle.text = travelTitle
            holder.tvRate.text = travelRate
            holder.tvType.text = travelType

            Glide.with(holder.imgTravel)
                .load(imgUrls1)
                .centerCrop()
                .placeholder(R.drawable.ic_baseline_image_24)
                .into(holder.imgTravel)

            holder.itemView.setOnClickListener {
                onItemClickCallBack.onItemClicked(listTravel[holder.adapterPosition])
            }
        }
    }


    override fun getItemCount(): Int = listTravel.size
}