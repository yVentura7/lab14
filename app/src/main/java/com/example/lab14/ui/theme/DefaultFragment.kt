package com.example.lab14.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.lab14.R

class DefaultFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_default, container, false)
        val textView: TextView = view.findViewById(R.id.textView)

        textView.text = "Bienvenido a la aplicación"
        return view
    }
}
