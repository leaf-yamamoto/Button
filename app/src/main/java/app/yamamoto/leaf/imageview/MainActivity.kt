package app.yamamoto.leaf.imageview

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyCharacterMap.load
import android.widget.ImageView
import java.lang.System.load

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.setImageResource(R.drawable.night)

        val url ="https://www.google.com/url?sa=i&url=https%3A%2F%2Fgeographical.co.uk%2Fnature%2Fgeophoto%2Fitem%2F3068-photographing-the-night-sky&psig=AOvVaw0NYVzZ5gWCEFCf-ZpNmdQW&ust=1621164873560000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCOjy9f_Ly_ACFQAAAAAdAAAAABAD"
        val imageView = findViewById<ImageView>(R.id.imageView)
        ImageView.load(url)
    }
}