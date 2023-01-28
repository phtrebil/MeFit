package br.com.pedro.mefit.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Exercicio(

    val nome: String,
    val imagem: String? = null,
    val descricao: String

): Parcelable {

}