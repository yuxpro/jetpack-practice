package com.yuxpro.startup

import android.content.Context
import androidx.startup.Initializer

class MyAppStartupB : Initializer<MyAppStartupB.WorkB> {

    class WorkB {
        fun init() {
            //初始化工作
        }
    }

    override fun create(context: Context): WorkB {
        val workA = WorkB()
        workA.init()
        return workA
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf(MyAppStartupC::class.java)
    }
}