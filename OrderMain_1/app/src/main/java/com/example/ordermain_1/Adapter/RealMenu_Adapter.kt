package com.example.ordermain_1.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ordermain_1.R
import com.example.ordermain_1.Item.RealMenuItem
import kotlinx.android.synthetic.main.item_layout_realmenu.view.*


class RealMenu_Adapter:RecyclerView.Adapter<RealMenu_Adapter.RealMenuViewHolder>() {

    private var realmenuItemList : List<RealMenuItem>?=null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RealMenuViewHolder {
        return RealMenuViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.item_layout_realmenu,parent,false)
        )

    }

    override fun onBindViewHolder(holder: RealMenuViewHolder, position: Int) {
        realmenuItemList?.let{
            holder.bind(it[position])
        }

    }

    override fun getItemCount(): Int {
        return realmenuItemList?.size ?:0
    }

    class RealMenuViewHolder(itemView:View) :RecyclerView.ViewHolder(itemView){

        private val menuImg : ImageView = itemView.real_menu_img


        fun bind(realmeunuitem: RealMenuItem){

           Glide.with(itemView).load(realmeunuitem.realmenuimg).into(menuImg)
            itemView.real_menuname_txt.text = realmeunuitem.realmenuname
            itemView.real_menuinformation_txt.text = realmeunuitem.realmenuinformation
            itemView.real_menuprice_txt.text = realmeunuitem.realmenuprice

        }




    }


    fun submitList(list:List<RealMenuItem>?){
       realmenuItemList = list
        notifyDataSetChanged()
    }
}