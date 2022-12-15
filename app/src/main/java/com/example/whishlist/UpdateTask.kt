package com.example.whishlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Data
import kotlinx.android.synthetic.main.activity_update_task.*

class UpdateTask : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_task)
        val pos = intent.getIntExtra("id", -1)
        if(pos!= -1){
            var title = DataObject.getData(pos).title
            create_task.setText(title)

            deleteBtn.setOnClickListener{
                DataObject.deleteData(pos)
                myIntent()
            }

            updateBtn.setOnClickListener{
                DataObject.updateData(pos, create_task.text.toString())
                myIntent()
            }
        }
    }

    fun myIntent(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}