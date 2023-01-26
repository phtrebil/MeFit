package br.com.pedro.mefit.ui.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.pedro.mefit.R
import br.com.pedro.mefit.model.Exercicio

class ExercicioAdapter(
    private val exercicios: List<Exercicio>,
    private val context : Context
): RecyclerView.Adapter<ExercicioAdapter.ExercicioViewHolder>() {
    class ExercicioViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun vincula(exercicio: Exercicio) {
            val imagem = itemView.findViewById<ImageView>(R.id.imageView)
            val nome = itemView.findViewById<TextView>(R.id.nome_exercicio)
            nome.text = exercicio.nome
            val descricao = itemView.findViewById<TextView>(R.id.descricao_exercicio)
            descricao.text = exercicio.descricao
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExercicioViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_exercicio, parent, false)
        return ExercicioViewHolder(view)

    }

    override fun onBindViewHolder(holder: ExercicioViewHolder, position: Int) {
        val exercicio = exercicios[position]
        holder.vincula(exercicio)
    }

    override fun getItemCount(): Int = exercicios.size


}