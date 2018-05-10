package com.smartcare.jetpack


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


/**
 * A simple [Fragment] subclass.
 *
 */
class HelloFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        super.setTitle("Hello Fragment", true)

        return inflater.inflate(R.layout.fragment_hello, container, false)
    }


}
