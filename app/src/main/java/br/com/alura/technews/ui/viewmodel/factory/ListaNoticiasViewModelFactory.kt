package br.com.alura.technews.ui.viewmodel.factory

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.com.alura.technews.repository.NoticiaRepository
import br.com.alura.technews.ui.viewmodel.ListaNoticiasViewModel

class ListaNoticiasViewModelFactory(
    private val repository: NoticiaRepository, application: Application
) : ViewModelProvider.AndroidViewModelFactory(application) {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ListaNoticiasViewModel(repository) as T
    }
}