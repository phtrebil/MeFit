package br.com.pedro.mefit.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import br.com.pedro.mefit.Dao.ExercicioDao
import br.com.pedro.mefit.databinding.ActivityExercicioBinding
import br.com.pedro.mefit.ui.recyclerview.adapter.ExercicioAdapter

class ExercicioActivity : AppCompatActivity() {

    private val dao = ExercicioDao()
    private val adapter = ExercicioAdapter(dao.buscaTodos(), this)
    private val binding by lazy {
        ActivityExercicioBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        configuraRecyclerView()
        configuraFab()

    }

    override fun onResume() {
        super.onResume()
        adapter.atualiza(dao.buscaTodos())
    }

    private fun configuraFab() {
        binding.fab.setOnClickListener {
            vaiParaFormulárioAddExercicio()
        }
    }

    private fun vaiParaFormulárioAddExercicio() {
        val intent = Intent(this, AdicionaExercicioActivity::class.java)
        startActivity(intent)
    }

    private fun configuraRecyclerView() {
        val recyclerView = binding.rvExercicio
        recyclerView.adapter = adapter
        binding.rvExercicio.layoutManager = StaggeredGridLayoutManager(2,1)
        adapter.quandoClicaNoItem = {
            val intent = Intent(
                this,
                DetalheExercicioActivity::class.java)
                .apply {
                    putExtra("exercicio", it)
                }
            startActivity(intent)
        }

    }
}