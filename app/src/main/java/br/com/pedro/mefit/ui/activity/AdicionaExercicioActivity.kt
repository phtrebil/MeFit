package br.com.pedro.mefit.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.pedro.mefit.Dao.ExercicioDao
import br.com.pedro.mefit.R
import br.com.pedro.mefit.databinding.ActivityAdicionaExercicioBinding
import br.com.pedro.mefit.model.Exercicio
import br.com.pedro.mefit.ui.dialog.AdicionaExercicioDialog
import coil.load

class AdicionaExercicioActivity : AppCompatActivity() {

    private var url: String? = null
    private val binding by lazy {
        ActivityAdicionaExercicioBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        configuraBotaoSalvar()


        binding.imagemAddExercicio.setOnClickListener {

            AdicionaExercicioDialog(this).mostra{
                imagem ->
                url = imagem
                binding.imagemAddExercicio.load(
                    url
                )
            }
        }

    }

    private fun configuraBotaoSalvar() {
        binding.button.setOnClickListener {
            criaProduto()
            finish()
        }
    }

    private fun criaProduto() {
        val descricao = binding.descricaoAddExercicio.text.toString()
        val nome = binding.nomeAddExercicio.text.toString()
        val dao = ExercicioDao()
        val novoExercicio = Exercicio(
            nome,
            url,
            descricao
        )
        dao.adiciona(novoExercicio)
    }
}