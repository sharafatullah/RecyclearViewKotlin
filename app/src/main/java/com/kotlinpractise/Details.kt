package com.kotlinpractise

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_details.*

class Details : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        if(intent.extras != null){
            val bundle:Bundle = intent.getBundleExtra("bundle")
            var data:Models = bundle.getSerializable("data") as Models

            img_details.setBackgroundResource(data.drawable)
        }
    }
}
