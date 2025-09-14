package com.app.customadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
class MainActivity2 : AppCompatActivity() {

    private var currentImage = 0
    private lateinit var image: ImageView

    // All images from drawable
    private val images = arrayOf(
        R.drawable.a2,
        R.drawable.a45,
        R.drawable.a2,
        R.drawable.a39 
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        image = findViewById(R.id.imageView)

        val next = findViewById<ImageButton>(R.id.btnNext)
        val prev = findViewById<ImageButton>(R.id.btnPrev)

        image.setImageResource(images[currentImage])

        next.setOnClickListener {
            currentImage = (currentImage + 1) % images.size
            image.setImageResource(images[currentImage])
        }

        prev.setOnClickListener {
            currentImage = if (currentImage - 1 < 0) images.size - 1 else currentImage - 1
            image.setImageResource(images[currentImage])
        }
    }
}
