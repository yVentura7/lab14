package com.example.lab14.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.lab14.R

class WorkFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_work, container, false)
        val textView: TextView = view.findViewById(R.id.textView)

        textView.text = "1. Tarea uno\n2. Tarea dos\n3. Tarea tres\n4. Tarea cuatro\n5. Tarea cinco\n6. Tarea seis\n7. Tarea siete"
        return view
    }
}
