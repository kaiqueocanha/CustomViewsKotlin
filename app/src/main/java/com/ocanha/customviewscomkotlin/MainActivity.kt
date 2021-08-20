package com.ocanha.customviewscomkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ocanha.customviewscomkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(this.binding.root)

        this.binding.followersIndicator.setCounter("1999")
        this.binding.followersIndicator.setIndicator("Seguindo")

        this.binding.profileImage.setOnClickListener {
            this.binding.profileImage.setVisualized(
                !this.binding.profileImage.isVisualized()
            )
        }

    }
}