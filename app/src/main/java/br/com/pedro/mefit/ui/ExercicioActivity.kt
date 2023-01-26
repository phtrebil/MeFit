package br.com.pedro.mefit.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.pedro.mefit.R
import br.com.pedro.mefit.model.Exercicio
import br.com.pedro.mefit.ui.recyclerview.adapter.ExercicioAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ExercicioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercicio)

        val recyclerView = findViewById<RecyclerView>(R.id.rv_exercicio)
        val fab = findViewById<FloatingActionButton>(R.id.fab)

        recyclerView.adapter = ExercicioAdapter(context = this, exercicios = listOf(
            Exercicio("PushUp",
                "imagem pushup",
                "Fique em posição de prancha, com braços alinhados aos ombros, desça até encostar no chão retorne para posição inicial"
            ),
            Exercicio("PushUp",
                "imagem pushup",
                "Fique em posição de prancha, com braços alinhados aos ombros, desça até encostar no chão retorne para posição inicial"
            ),
            Exercicio("PushUp",
                "imagem pushup",
                "Fique em posição de prancha, com braços alinhados aos ombros, desça até encostar no chão retorne para posição inicial"
            ),
        ))
        recyclerView.layoutManager = LinearLayoutManager(this)

        fab.setOnClickListener {
            val intent = Intent(this, AdicionaExercicioActivity::class.java)
            startActivity(intent)
        }

    }
}