package com.awesome.core_navigation

import android.content.Context
import android.content.Intent
import android.widget.Toast

object ActivityHelper {
    fun openActivity(context : Context, fullClassName : String){
        try {
            val intent = Intent()
            intent.setClassName(context.packageName, fullClassName)
            context.startActivity(intent)
        } catch (e : Exception) {
            Toast.makeText(context, "Page Not Found", Toast.LENGTH_SHORT).show()
        }
    }
}