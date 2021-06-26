package com.example.ordermain_1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ordermain_1.Item.BannerItem
import com.example.ordermain_1.Item.GridItem
import com.example.ordermain_1.Item.Menu_informationItem
import com.example.ordermain_1.Item.RealMenuItem

class MainActivityViewModel : ViewModel() {
    private val _bannerItemList: MutableLiveData<List<BannerItem>> = MutableLiveData()
    private val _gridItemList: MutableLiveData<List<GridItem>> = MutableLiveData()
    private val _menuinformationList : MutableLiveData<List<Menu_informationItem>> = MutableLiveData()
    private val _realmenuList : MutableLiveData<List<RealMenuItem>> = MutableLiveData()


    private val _currentPosition: MutableLiveData<Int> = MutableLiveData()



    val bannerItemList: LiveData<List<BannerItem>> get() = _bannerItemList
    val gridItemList : LiveData<List<GridItem>> get() = _gridItemList
    val menuinformationitemList : LiveData<List<Menu_informationItem>> get() = _menuinformationList
    val realmenuList : LiveData<List<RealMenuItem>> get() = _realmenuList


    init{
        _currentPosition.value=0
    }


    fun setBannerItems(list: List<BannerItem>){
        _bannerItemList.value = list
    }

    fun setGridItems(list:List<GridItem>){
        _gridItemList.value = list
    }

    fun setmenuinformationItems(list:List<Menu_informationItem>){
        _menuinformationList.value = list
    }

    fun setrealmenuItems(list:List<RealMenuItem>){
        _realmenuList.value = list
    }


}