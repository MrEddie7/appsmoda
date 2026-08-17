package com.example.appmoda.data.model

enum class FashionCategory(val displayName: String) {
    ROUPAS("Roupas"),
    ARMADURAS("Armaduras"),
    ACESSORIOS_CIVIS("Acessórios Civis"),
    ACESSORIOS_MILITARES("Acessórios Militares")
}

data class FashionItem(
    val id: String,
    val nome: String,
    val decada: String,
    val anoInicio: Int,
    val anoFim: Int,
    val categoria: FashionCategory,
    val descricao: String,
    val detalhes: String,
    val imageUrl: String,
    val paisOrigem: String
)
