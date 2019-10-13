package com.example.image_opener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    val images= intArrayOf(R.drawable.nitai,R.drawable.k1,R.drawable.harakrishna1,R.drawable.harakrishna2,R.drawable.harakrishna3,R.drawable.harakrishna10,R.drawable.harakrishna11,R.drawable.harakrishna12,R.drawable.harakrishna13,R.drawable.harakrishna14,R.drawable.harakrishna9)
    var index=0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    }

    fun change(view: View)
    {
        var image=findViewById<ImageView>(R.id.imageView)
        image.setImageResource(images[index])
        index++
        if(index==images.size)
        {
            index=0
        }
    }
}
