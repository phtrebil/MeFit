package br.com.pedro.mefit.ui.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.pedro.mefit.R
import br.com.pedro.mefit.databinding.ItemExercicioBinding
import br.com.pedro.mefit.model.Exercicio
import coil.load

class ExercicioAdapter(

    exercicios: List<Exercicio>,
    private val context : Context,
    var quandoClicaNoItem: (exercicio: Exercicio) -> Unit = {}

): RecyclerView.Adapter<ExercicioAdapter.ExercicioViewHolder>() {

    private val exercicios = exercicios.toMutableList()

    inner class ExercicioViewHolder(private val binding : ItemExercicioBinding) :
        RecyclerView.ViewHolder(binding.root) {

        private lateinit var exercicio: Exercicio

        init {
            itemView.setOnClickListener {
                if(::exercicio.isInitialized){
                    quandoClicaNoItem(exercicio)
                }
            }
        }

        fun vincula(exercicio: Exercicio) {
            this.exercicio = exercicio
            binding.nomeExercicio.text = exercicio.nome
            binding.descricaoExercicio.text = exercicio.descricao
            binding.imageView.load(exercicio.imagem){
                fallback(R.drawable.erro)
                error(R.drawable.erro)
            }


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExercicioViewHolder {
        val inflater = LayoutInflater.from(context)
        return ExercicioViewHolder(ItemExercicioBinding.inflate(inflater, parent, false))

    }

    override fun onBindViewHolder(holder: ExercicioViewHolder, position: Int) {
        val exercicio = exercicios[position]
        holder.vincula(exercicio)
    }

    override fun getItemCount(): Int = exercicios.size

    fun atualiza(exercicios: List<Exercicio>){
        this.exercicios.clear()
        this.exercicios.addAll(exercicios)
        notifyDataSetChanged()
    }

}
