package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val TAG="多人运动"
    val ANOTHER="测试推送"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e(TAG,"合作开发测试")
        Log.d(ANOTHER,"测试多人")//我准备把这一行干掉
        Log.e(TAG,"我是王兮 我又写了垃圾代码")
        Log.e(TAG,"我是王兮 我想搞事情")
    }




}