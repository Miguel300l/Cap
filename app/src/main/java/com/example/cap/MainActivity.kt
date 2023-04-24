package com.example.cap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var logo : ImageView
    lateinit var btn_notificacion: ImageView
    lateinit var avatar: ImageView


    var onLine = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        initListener()
    }

    private fun initViews() {
        logo = findViewById(R.id.logo)
        btn_notificacion = findViewById(R.id.btn_notificacion)
        avatar = findViewById(R.id.avatar)
    }

    private fun initListener() {
        btn_notificacion.setOnClickListener {
            Snackbar.make(btn_notificacion, "Notificaciones", Snackbar.LENGTH_SHORT).show()
        }

        avatar.setOnClickListener {
            Snackbar.make(avatar, "Ajustes", Snackbar.LENGTH_SHORT).show()
        }
    }
}