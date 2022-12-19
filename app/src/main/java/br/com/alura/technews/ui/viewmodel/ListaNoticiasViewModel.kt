package br.com.alura.technews.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import br.com.alura.technews.model.Noticia
import br.com.alura.technews.repository.NoticiaRepository

class ListaNoticiasViewModel(
    private val repository: NoticiaRepository
) : ViewModel() {

    init {
        Log.i("ViewModel", "criando viewmodel")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("ViewModel", "destruindo viewModel")
    }

    fun buscaTodos(quandoSucesso: (noticiasNovas: List<Noticia>) -> Unit, quandoFalha: (erro: String?) -> Unit){
        Log.i("ViewModel", "buscaTodos")
        repository.buscaTodos(quandoSucesso, quandoFalha)
    }
}