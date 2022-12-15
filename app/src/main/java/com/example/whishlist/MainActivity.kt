package com.example.whishlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addBtn.setOnClickListener{
            val intent = Intent(this,CreateTask::class.java)
            startActivity(intent)
        }
        deleteAll.setOnClickListener{
            DataObject.deleteAll()
            setRecycler()
        }
        setRecycler()
    }

    fun setRecycler(){
        rv.adapter=Adapter(DataObject.getAllData())

    }
}