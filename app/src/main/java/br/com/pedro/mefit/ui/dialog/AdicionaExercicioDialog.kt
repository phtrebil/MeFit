package br.com.pedro.mefit.ui.dialog

import android.content.Context
import android.os.Build.VERSION.SDK_INT
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import br.com.pedro.mefit.databinding.AdicionaImagemBinding
import coil.ImageLoader
import coil.decode.GifDecoder
import coil.decode.ImageDecoderDecoder
import coil.load

class AdicionaExercicioDialog (val context: Context){


    fun mostra(passandoURL: (imagem: String) -> Unit) {
        val binding = AdicionaImagemBinding
            .inflate(LayoutInflater.from(context))
        binding.formularioImagemBotaoCarregar
            .setOnClickListener {
            val url = binding.URLText.text.toString()
            binding.formularioImagemImageview.load(url)

        }

        AlertDialog.Builder(context)
            .setView(binding.root)
            .setPositiveButton("Confirma") { _, _ ->
                val url = binding.URLText.text.toString()
                passandoURL(url)
            }
            .setNegativeButton("Cancelar") { _, _ ->
            }.show()
    }
}