package com.example.apitutorial.recyclerView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.apitutorial.App
import com.example.apitutorial.R
import com.example.apitutorial.model.Photo

class PhotoGridRecyclerViwAdapter:RecyclerView.Adapter<PhotoItemViewHolder>(){

    private var photoList = ArrayList<Photo>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoItemViewHolder {
        val photoItemViewHolder = PhotoItemViewHolder(LayoutInflater
                                    .from(parent.context)
                                    .inflate(R.layout.layout_photo_item,parent,false))

        return photoItemViewHolder
    }

    override fun getItemCount(): Int {
        return this.photoList.size

    }

    override fun onBindViewHolder(holder: PhotoItemViewHolder, position: Int) {
        holder.bindWithView(this.photoList[position])
    }

    //외부에서 어답터에 배열을 넣어준다.
    fun submitList(photoList: ArrayList<Photo>){
        this.photoList = photoList
    }



}