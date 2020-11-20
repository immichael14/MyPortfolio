package com.gelo.myportfolio

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.gelo.myportfolio.fragment.DashBoardProfile

class FlashScreenActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.layout_flash_screen)

        Handler().postDelayed({
            runOnUiThread {
                val intent = Intent(this@FlashScreenActivity, MainActivity::class.java)
                startActivity(intent)
                finish()}
        }, 5000)
    }


}