package com.example.apitutorial

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.apitutorial.model.Photo
import com.example.apitutorial.recyclerView.PhotoGridRecyclerViwAdapter
import com.example.apitutorial.utils.Constans.TAG
import kotlinx.android.synthetic.main.activity_photo_collection.*

class PhotoCollectionActivity : AppCompatActivity(){

    // 데이터
    var photoList = ArrayList<Photo>()

    //어답터
    private lateinit var photoGridRecyclerViewAdapter: PhotoGridRecyclerViwAdapter


    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo_collection)

        Log.d(TAG, "포토콜렉트엑티비티 called")
        
        val bundle = intent.getBundleExtra("array_bundle")
        val serachterm = intent.getStringExtra("search_term")
        
        photoList =  bundle?.getSerializable("photo_array_list") as ArrayList<Photo>

        Log.d(TAG, "onCreate: searchterm = $serachterm, photoList.count() : ${photoList.count()}")

        this.photoGridRecyclerViewAdapter = PhotoGridRecyclerViwAdapter()

        this.photoGridRecyclerViewAdapter.submitList(photoList)

        my_photo_recycler_view.layoutManager = GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false)
        my_photo_recycler_view.adapter = this.photoGridRecyclerViewAdapter
    }
}