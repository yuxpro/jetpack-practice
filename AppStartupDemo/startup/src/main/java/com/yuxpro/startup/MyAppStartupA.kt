package com.yuxpro.startup

import android.content.Context
import androidx.startup.Initializer

class MyAppStartupA : Initializer<MyAppStartupA.WorkA> {

    class WorkA {
        fun init() {
            //初始化工作
        }
    }

    override fun create(context: Context): WorkA {
        val workA = WorkA()
        workA.init()
        return workA
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf(MyAppStartupB::class.java)
    }
}