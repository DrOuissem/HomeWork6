package com.example.homework6

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyPageAdapter(fragmentActivity:FragmentActivity):FragmentStateAdapter(fragmentActivity) {
    /*override fun getItemCount(): Int {
        return 4
    }*/
    override fun getItemCount()=4

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->Home()
            1->AboutMe()
            2->Work()
            3->Contact()
            else ->Fragment()
        }

    }

}