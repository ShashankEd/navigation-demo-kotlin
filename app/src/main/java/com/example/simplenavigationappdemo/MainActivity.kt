package com.example.simplenavigationappdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.simplenavigationappdemo.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        //as we'll use navigation component to load the fragments, so commenting the below code
//        if (savedInstanceState == null) {
//            supportFragmentManager.beginTransaction()
//                .replace(R.id.container, MainFragment.newInstance())
//                .commitNow()
//        }


    }
}