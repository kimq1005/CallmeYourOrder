package com.example.ordermain_1.PageDR

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.ordermain_1.Item.RealMenuItem
import com.example.ordermain_1.R
import kotlinx.android.synthetic.main.activity_go_order_page.*

class GoOrderPage : AppCompatActivity() {

//    lateinit var datas : RealMenuItem

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_go_order_page)

//        datas = intent.getSerializableExtra("data") as RealMenuItem
//
//        Glide
//            .with(this)
//            .load(datas.realmenuimg)
//            .into(img_profile)
//        tv_name.text = datas.realmenuname

    }
}