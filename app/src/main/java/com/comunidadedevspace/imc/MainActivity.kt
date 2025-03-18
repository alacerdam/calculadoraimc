package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //  Recuperar os componentes EdixText
        // Criar uma variavel e associar o componente de UI <EditText>
        // Recuperar o botão da tela
        // Colocar acao do botao setOnClickListener
        // Recuperar texto editado no edt eso

        val edtPeso = findViewById<TextInputEditText>(R.id.editText_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.editText_altura)

        val btn_calcular = findViewById<Button>(R.id.btn_calcular)

        btn_calcular.setOnClickListener {
            val peso = edtPeso.text
            val altura = edtAltura.text
            println("Ana acao do botao"   +  altura)
        }
    }
}