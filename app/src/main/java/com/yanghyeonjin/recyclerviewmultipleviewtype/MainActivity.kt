package com.yanghyeonjin.recyclerviewmultipleviewtype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yanghyeonjin.recyclerviewmultipleviewtype.adapter.BuddyAdapter
import com.yanghyeonjin.recyclerviewmultipleviewtype.data.BuddyData
import com.yanghyeonjin.recyclerviewmultipleviewtype.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // data
        val buddyList = BuddyData().loadBuddyList()
        binding.recyclerView.apply {
            adapter = BuddyAdapter(this@MainActivity, buddyList)
            setHasFixedSize(true)
        }
    }
}