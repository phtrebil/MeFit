package br.com.pedro.mefit.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.pedro.mefit.databinding.ActivityDetalheExercicioBinding
import br.com.pedro.mefit.model.Exercicio
import coil.load

class DetalheExercicioActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityDetalheExercicioBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        intent.getParcelableExtra<Exercicio>("exercicio")?.let{ exercicioCarregado ->
            preencheCampos(exercicioCarregado)
        } ?: finish()
    }

    private fun preencheCampos(exercicioCarregado: Exercicio) {
        with(binding) {
            activityDetalhesExercicioImagem.load(exercicioCarregado.imagem)
            activityDetalhesExercicioNome.text = exercicioCarregado.nome
            activityDetalhesExercicioDescricao.text = exercicioCarregado.descricao

        }

        }
    }
