package com.okanaydin.hipoandroidinterviewexercise.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.okanaydin.hipoandroidinterviewexercise.R
import com.okanaydin.hipoandroidinterviewexercise.model.Photo
import kotlinx.android.synthetic.main.row_recent_photo.view.*

class RecentViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(
        R.layout.row_recent_photo,
        parent,
        false
    )
) {

    fun bind(recentPhotoModel: Photo) {

        Glide
            .with(itemView.context)
            .load(recentPhotoModel.getPhotoUrl())
            .into(itemView.row_recent_img)

    }

}