package com.example.whishlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_create_task.*

class CreateTask : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_task)
        saveBtn.setOnClickListener{
            if(create_task.text.toString().trim { it<=' ' }.isNotEmpty()){
                var title = create_task.getText().toString()
                DataObject.setData(title)
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}