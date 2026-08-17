package com.example.appmoda.viewmodel

import androidx.lifecycle.ViewModel
import com.example.appmoda.data.model.FashionCategory
import com.example.appmoda.data.model.FashionItem
import com.example.appmoda.data.repository.FashionRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

data class GalleryState(
    val allItems: List<FashionItem> = emptyList(),
    val filteredItems: List<FashionItem> = emptyList(),
    val decadas: List<String> = emptyList(),
    val selectedDecada: String? = null,
    val selectedCategoria: FashionCategory? = null,
    val searchQuery: String = ""
)

class GalleryViewModel : ViewModel() {

    private val _galleryState = MutableStateFlow(GalleryState())
    val galleryState: StateFlow<GalleryState> = _galleryState

    init {
        val items = FashionRepository.getAllItems()
        _galleryState.value = GalleryState(
            allItems = items,
            filteredItems = items,
            decadas = FashionRepository.getDecadas()
        )
    }

    fun selectDecada(decada: String?) {
        _galleryState.value = _galleryState.value.copy(selectedDecada = decada)
        applyFilters()
    }

    fun selectCategoria(categoria: FashionCategory?) {
        _galleryState.value = _galleryState.value.copy(selectedCategoria = categoria)
        applyFilters()
    }

    fun search(query: String) {
        _galleryState.value = _galleryState.value.copy(searchQuery = query)
        applyFilters()
    }

    private fun applyFilters() {
        val state = _galleryState.value
        var items = state.allItems

        state.selectedDecada?.let { decada ->
            items = items.filter { it.decada == decada }
        }

        state.selectedCategoria?.let { categoria ->
            items = items.filter { it.categoria == categoria }
        }

        if (state.searchQuery.isNotBlank()) {
            items = items.filter {
                it.nome.contains(state.searchQuery, ignoreCase = true) ||
                it.descricao.contains(state.searchQuery, ignoreCase = true) ||
                it.paisOrigem.contains(state.searchQuery, ignoreCase = true)
            }
        }

        _galleryState.value = state.copy(filteredItems = items)
    }

    fun getItemById(id: String): FashionItem? =
        FashionRepository.getItemById(id)
}
