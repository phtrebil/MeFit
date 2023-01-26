package br.com.pedro.mefit.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import br.com.pedro.mefit.R

class AdicionaExercicioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adiciona_exercicio)

        val botaoSalvar = findViewById<Button>(R.id.button)
        botaoSalvar.setOnClickListener {
            val campoNome = findViewById<EditText>(R.id.nome_add_exercicio)
            val nome = campoNome.text.toString()
            val campoDescricao = findViewById<EditText>(R.id.descricao_add_exercicio)
            val descricao = campoDescricao.text.toString()
            Log.i("FormularioProduto", "onCreate: $nome")
        }
    }
}