package com.example.test.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.share.Greeting
import android.widget.TextView
import com.spacex.SpaceXPlatform

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {

    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    findViewById<TextView>(R.id.text_view).apply {
      text = Greeting().greeting(SpaceXPlatform())
    }
  }
}
