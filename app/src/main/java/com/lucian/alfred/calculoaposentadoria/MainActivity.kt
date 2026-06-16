package com.lucian.alfred.calculoaposentadoria

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        val spn_sexo = findViewById<Spinner>(R.id.spn_sexo)
        val txt_idade = findViewById<EditText>(R.id.txt_idade)
        val btn_calcular = findViewById<Button>(R.id.btn_calcular)
        val txt_resultado = findViewById<TextView>(R.id.txt_resultado)
        val card_resultado = findViewById<com.google.android.material.card.MaterialCardView>(R.id.card_resultado)
        spn_sexo.adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, listOf("masculino", "femenino"))

        btn_calcular.setOnClickListener {
            val sexo = spn_sexo.selectedItem as String
            val idade = txt_idade.text.toString().toIntOrNull()

            if (idade == null){
                txt_resultado.text = "Por favor, digite uma idade válida."
                card_resultado.visibility = android.view.View.VISIBLE
                return@setOnClickListener
            }
            var resultado = 0
            if (sexo.equals("masculino", ignoreCase = true)){
                resultado = 65 - idade
            }else{
                resultado = 60 - idade;
            }

            if(resultado <= 0){
                txt_resultado.text ="Parabéns! Você já pode se aposentar!"
            }
            else{
                txt_resultado.text = "Faltam $resultado anos para você se aposentar."
            }

            card_resultado.visibility = android.view.View.VISIBLE
        }
    }
}