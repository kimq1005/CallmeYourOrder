package com.example.ordermain_1.PageDR

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.example.ordermain_1.Adapter.MenuInformationRecyclerViewAdapter
import com.example.ordermain_1.Adapter.RealMenu_Adapter
import com.example.ordermain_1.Adapter.ViewPagerAdapter
import com.example.ordermain_1.Item.fakeBannerItemList
import com.example.ordermain_1.Item.fakeMenuinformation
import com.example.ordermain_1.Item.fakeRealMenu
import com.example.ordermain_1.MainActivityViewModel
import com.example.ordermain_1.R
import kotlinx.android.synthetic.main.activity_menu_page_ui.*

class MenuPageUI : AppCompatActivity(), View.OnClickListener {

            private lateinit var viewPagerAdapter : ViewPagerAdapter
            private lateinit var menuInformationRecyclerViewAdapter : MenuInformationRecyclerViewAdapter
            private lateinit var realmenuAdapter: RealMenu_Adapter
            private lateinit var viewModel : MainActivityViewModel


            override fun onCreate(savedInstanceState: Bundle?) {

                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_menu_page_ui)

                viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
                viewModel.setBannerItems(fakeBannerItemList)
//                viewModel.setGridItems(fakeGridItemList)
                viewModel.setmenuinformationItems(fakeMenuinformation)
                viewModel.setrealmenuItems(fakeRealMenu)

                iv_hamburger.setOnClickListener(this)
                initViewPager2()
                subscribeObservers()


    }




    private fun initViewPager2() {
        viewPager2.apply {
            viewPagerAdapter = ViewPagerAdapter(this@MenuPageUI)
            adapter = viewPagerAdapter
            registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback(){
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    tv_page_number.text = "${position+1}"
                }
            })
        }



        shopinformation.apply {
            menuInformationRecyclerViewAdapter = MenuInformationRecyclerViewAdapter()
            layoutManager = LinearLayoutManager(this@MenuPageUI, LinearLayoutManager.VERTICAL, false)
            adapter = menuInformationRecyclerViewAdapter
        }

        realmenurecyclerView.apply{
            realmenuAdapter = RealMenu_Adapter()
            layoutManager = LinearLayoutManager(this@MenuPageUI, LinearLayoutManager.VERTICAL, false)
            adapter =  realmenuAdapter
        }



    }


    private fun subscribeObservers() {
        viewModel.bannerItemList.observe(this, Observer { bannerItemList ->
            viewPagerAdapter.submitList(bannerItemList)
        })


        viewModel.menuinformationitemList.observe(this, { menuinformationitemList ->
            menuInformationRecyclerViewAdapter.submitList(menuinformationitemList)
        })

        viewModel.realmenuList.observe(this, { realmenuList ->
            realmenuAdapter.submitList(realmenuList)
        })


    }


    override fun onClick(v: View?) {

        v?.let {
            when (it.id) {
                R.id.iv_hamburger -> {

                }
            }
        }

    }
}