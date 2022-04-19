package com.example.listviewsample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lvMenu = findViewById<ListView>(R.id.lvMenu)
        var menuList = mutableListOf(" から 揚げ 定食", "ハンバーグ 定食", "生姜 焼き 定食", "ステーキ 定食", "野菜 炒め 定食", "とん かつ 定食", "ミンチ かつ 定食", "チキン カツ 定食", "コロッケ 定食", "回鍋肉 定食", "麻婆豆腐 定食", "青 椒 肉 絲 定食", "焼き魚 定食", "焼肉 定食")
        val adapter = ArrayAdapter(this@MainActivity,android.R.layout.simple_list_item_1,menuList)
        lvMenu.adapter = adapter

        lvMenu.onItemClickListener = ListItemClickListener()

    }

    private inner class ListItemClickListener : AdapterView.OnItemClickListener{
        override fun onItemClick(parent: AdapterView<*>, view: View, position:Int, id:Long){
            val dialogFragment = OrderConfirmDialogFragment()
                dialogFragment.show(supportFragmentManager,"OrderConfirmDialogFragment")

        }
    }
}