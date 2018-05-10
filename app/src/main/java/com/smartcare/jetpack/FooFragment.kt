package com.smartcare.jetpack


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


/**
 * A simple [Fragment] subclass.
 *
 */
class FooFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        super.setTitle("Foo Fragment", true)

        val view = inflater.inflate(R.layout.fragment_foo, container, false)
        view.findViewById<Button>(R.id.barButton).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fooFragment_to_barFragment)
        }
        return view
    }


}
