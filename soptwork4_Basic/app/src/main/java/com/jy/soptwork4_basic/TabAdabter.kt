package com.jy.soptwork4_basic

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by jean1 on 2017-11-11.
 */
class TabAdabter(fm: FragmentManager?) : FragmentPagerAdapter(fm) {

    var tabCount: Int = 0
    var firstTab: FirstFragment? = null
    var secondTab: SecondFragment? = null
    var thirdTab: ThirdFragment? = null
    var fourthTab: FourthFragment? = null
    var fifthTab: FifthFragment? = null

    constructor(fm: FragmentManager?, tabCount: Int) : this(fm) {
        this.tabCount = tabCount
        this.firstTab = FirstFragment()
        this.secondTab = SecondFragment()
        this.thirdTab = ThirdFragment()
        this.fourthTab = FourthFragment()
        this.fifthTab = FifthFragment()
    }

    override fun getItem(position: Int): Fragment? {
        when (position) {
            0 -> return firstTab
            1 -> return secondTab
            2 -> return thirdTab
            3 -> return fourthTab
            4 -> return fifthTab

        }
        return null
    }

    override fun getCount(): Int = tabCount
}