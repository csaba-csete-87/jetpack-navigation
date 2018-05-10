package com.smartcare.jetpack

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class MainFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        super.setTitle("Main Fragment", false)

        val view = inflater.inflate(R.layout.main_fragment, container, false)
        view.findViewById<Button>(R.id.helloButton).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_helloFragment)
        }
        view.findViewById<Button>(R.id.fooButton).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_fooFragment)
        }
        return view
    }
}
