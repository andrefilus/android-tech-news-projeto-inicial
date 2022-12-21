package br.com.alura.technews.ui.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.alura.technews.model.Noticia
import br.com.alura.technews.repository.NoticiaRepository
import br.com.alura.technews.repository.Resource

class ListaNoticiasViewModel(
    private val repository: NoticiaRepository
) : ViewModel() {

//    private val liveData = MutableLiveData<List<Noticia>>()

    init {
        Log.i("ViewModel", "criando viewmodel")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("ViewModel", "destruindo viewModel")
    }

    //    fun buscaTodos(quandoSucesso: (noticiasNovas: List<Noticia>) -> Unit, quandoFalha: (erro: String?) -> Unit){
    fun buscaTodos(): LiveData<Resource<List<Noticia>?>> {
        Log.i("ViewModel", "buscaTodos")

        return repository.buscaTodos()
//            quandoSucesso = {
//                liveData.value = it
//            }, quandoFalha = {})
//        return liveData
    }
}