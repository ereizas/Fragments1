package edu.temple.fragments1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colorFragment = ColorFragment()
        supportFragmentManager.beginTransaction().add(R.id.fragmentContainerView2, colorFragment).commit()
    }
}