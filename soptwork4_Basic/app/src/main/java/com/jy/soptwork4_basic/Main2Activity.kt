package com.jy.soptwork4_basic

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*

/**
 * Created by jean1 on 2017-11-22.
 */
class Main2Activity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        main2_tab.addTab(main2_tab.newTab().setText("JiYoon"))
        main2_tab.addTab(main2_tab.newTab().setText("HyeWon"))
        main2_tab.addTab(main2_tab.newTab().setText("Heeseung"))
        main2_tab.addTab(main2_tab.newTab().setText("SuYeon"))
        main2_tab.addTab(main2_tab.newTab().setText("HyungIn"))


        var tabAdapter = TabAdabter(supportFragmentManager, main2_tab.tabCount)

        main2_viewpager.adapter = tabAdapter
        //움직임 주기 위해서
        main2_viewpager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(main2_tab))

        //리스너 달기
        main2_tab.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                main2_viewpager.currentItem=tab!!.position
            }





        })

    }

}