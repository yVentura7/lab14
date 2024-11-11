package com.example.lab14

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.lab14.ui.DefaultFragment
import com.example.lab14.ui.WorkFragment
import com.example.lab14.ui.StudyFragment
import com.example.lab14.ui.ProblemsFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Verifica el "destination" para cargar el fragmento adecuado
        val destination = intent.getStringExtra("destination")
        val fragment: Fragment = when (destination) {
            "work" -> WorkFragment()      // Fragmento con la lista de tareas
            "study" -> StudyFragment()    // Fragmento con el texto de estudio
            "problems" -> ProblemsFragment()  // Fragmento con el problema matemático
            else -> DefaultFragment()     // Fragmento por defecto
        }

        // Cargar el fragmento en el contenedor
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}
