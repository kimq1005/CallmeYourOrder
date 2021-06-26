package com.example.apitutorial.recyclerView

import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.apitutorial.App
import com.example.apitutorial.R
import com.example.apitutorial.model.Photo
import com.example.apitutorial.utils.Constans.TAG
import kotlinx.android.synthetic.main.layout_photo_item.view.*

class PhotoItemViewHolder(itemView:View) :RecyclerView.ViewHolder(itemView){

    private val photoImageView = itemView.photo_image
    private val photoCreatedAtText = itemView.created_at_text
    private val photoLikesCounText = itemView.likes_count_text
    //데이터와 뷰를 묶는다.
    fun bindWithView(photoItem: Photo){
        Log.d(TAG, "바인드위드뷰 콜드 ")

        photoCreatedAtText.text = photoItem.createdAt

        photoLikesCounText.text = photoItem.likesCount.toString()

        Glide.with(App.instance)
                .load(photoItem.thumbnail)
                .placeholder(R.drawable.ic_baseline_photo_24)
                .into(photoImageView)

    }



}