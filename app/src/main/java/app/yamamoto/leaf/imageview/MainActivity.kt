package app.yamamoto.leaf.imageview

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import coil.api.load


import java.lang.System.load


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val url = "https://pics.prcm.jp/bd2976c507fa3/84500725/jpeg/84500725.jpeg"
        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.load(url)

    }
}