package com.ltts.recyclerviewproj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myrv = findViewById<RecyclerView>(R.id.recyclerView)
        myrv.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)

        var myDataList= ArrayList<Data>()
        myDataList.add(Data("Mohnish","MK@GMAIL.com","990044"))
        myDataList.add(Data("Khera","MKffd@GMAIL.com","78044"))
        myDataList.add(Data("Harry","fdfK@GMAIL.com","881044"))

        myrv.adapter=MyAdapter(myDataList)

    }
}