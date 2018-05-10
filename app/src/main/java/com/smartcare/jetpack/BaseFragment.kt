package com.smartcare.jetpack

import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

open class BaseFragment : Fragment() {

    fun setTitle(title: String, isDisplayHomeAsUpEnabled: Boolean) {
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(isDisplayHomeAsUpEnabled)
        (activity as AppCompatActivity).supportActionBar?.title = title
    }
}