package com.example.parrafos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var textViewLeft: TextView
    private lateinit var textViewRight: TextView
    private lateinit var buttonChangeText: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listaDichos = arrayOf("No existe una manera fácil. No importa cuán talentoso seas, tu talento te va a fallar si no lo desarrollas. Si no estudias, si no trabajas, si no te dedicas a ser mejor cada","La educación es el arma más poderosa que puedes usar para cambiar el mundo.","La inseguridad siempre está persiguiéndote y poniéndose en el camino de tus sueños","Las guerras seguirán mientras el color de la piel siga siendo más importante que el de los ojos."," Crea la más alta y más grandiosa visión para tu vida, porque te conviertes en lo que crees","El nacimiento y la muerte no son dos estados distintos, sino dos aspectos del mismo estado.","Puede ser que no tenga ni un peso en mi bolso, pero tengo una sonrisa en el rostro y eso vale más que todo el dinero del mundo.")


        textViewLeft = findViewById(R.id.textViewLeft)
        textViewRight = findViewById(R.id.textViewRight)
        buttonChangeText = findViewById(R.id.buttonChangeText)

        buttonChangeText.setOnClickListener {
            val random = Random.nextInt(2)
            println(listaDichos.size)
            println(Random.nextInt(listaDichos.size))
            if (random == 0) {
                textViewLeft.text = listaDichos[Random.nextInt(listaDichos.size)]
            } else {
                textViewRight.text = listaDichos[Random.nextInt(listaDichos.size)]
            }
        }
    }
}