package com.example.ordermain_1.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ordermain_1.Item.GridItem
import com.example.ordermain_1.R
import kotlinx.android.synthetic.main.item_layout_grid.view.*

class GridRecyclerViewAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var gridItemList : List<GridItem>?=null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return GridItemViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.item_layout_grid,parent,false)
        )

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        gridItemList?.let{
            (holder as GridItemViewHolder).bind(it[position])
        }

    }

    override fun getItemCount(): Int {
        return gridItemList?.size ?: 0

    }

    fun submitList(list:List<GridItem>?){
        gridItemList = list
        notifyDataSetChanged()
    }



    class GridItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(gridItem: GridItem){
            itemView.iv_grid_image.setImageResource(gridItem.image)
            itemView.tv_grid_title.text = gridItem.title
        }
    }
}