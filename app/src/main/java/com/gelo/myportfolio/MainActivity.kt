package com.gelo.myportfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import com.gelo.myportfolio.fragment.DashBoardProfile

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addFragment(DashBoardProfile(), false, "queue_generator")

    }

    fun addFragment(
        fragment: Fragment?,
        addToBackStack: Boolean,
        tag: String?
    ) {
        val manager = supportFragmentManager
        val ft = manager.beginTransaction()
        if (addToBackStack) {
            ft.addToBackStack(tag)
        }
        ft.replace(R.id.fragment_container, fragment!!, tag)
        ft.commitAllowingStateLoss()
    }

}