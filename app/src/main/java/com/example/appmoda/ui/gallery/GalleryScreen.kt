package com.example.appmoda.ui.gallery

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Logout
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appmoda.data.model.FashionCategory
import com.example.appmoda.ui.components.CategoryChip
import com.example.appmoda.ui.components.DecadeChip
import com.example.appmoda.ui.components.FashionCard
import com.example.appmoda.viewmodel.GalleryState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GalleryScreen(
    galleryState: GalleryState,
    onSelectDecada: (String?) -> Unit,
    onSelectCategoria: (FashionCategory?) -> Unit,
    onSearch: (String) -> Unit,
    onItemClick: (String) -> Unit,
    onLogout: () -> Unit
) {
    var searchQuery by remember { mutableStateOf("") }
    var searchExpanded by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            text = "AModa",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFE94560)
                        )
                        Text(
                            text = "Evolucao da Moda",
                            fontSize = 11.sp,
                            color = Color(0xFF888888)
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { searchExpanded = !searchExpanded }) {
                        Icon(
                            Icons.Default.Search,
                            contentDescription = "Buscar",
                            tint = Color.White
                        )
                    }
                    IconButton(onClick = onLogout) {
                        Icon(
                            Icons.Default.Logout,
                            contentDescription = "Sair",
                            tint = Color(0xFFE94560)
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF1A1A2E)
                )
            )
        },
        containerColor = Color(0xFF121223)
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            if (searchExpanded) {
                OutlinedTextField(
                    value = searchQuery,
                    onValueChange = {
                        searchQuery = it
                        onSearch(it)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    placeholder = {
                        Text("Buscar pecas de moda...", color = Color(0xFF666666))
                    },
                    leadingIcon = {
                        Icon(Icons.Default.Search, null, tint = Color(0xFF888888))
                    },
                    shape = RoundedCornerShape(12.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFFE94560),
                        unfocusedBorderColor = Color(0xFF333333),
                        focusedTextColor = Color.White,
                        unfocusedTextColor = Color.White,
                        cursorColor = Color(0xFFE94560)
                    ),
                    singleLine = true
                )
            }

            // Filtro por decada
            LazyRow(
                modifier = Modifier.padding(vertical = 8.dp),
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                item {
                    DecadeChip(
                        label = "Todas",
                        isSelected = galleryState.selectedDecada == null,
                        onClick = { onSelectDecada(null) }
                    )
                }
                items(galleryState.decadas) { decada ->
                    DecadeChip(
                        label = decada,
                        isSelected = galleryState.selectedDecada == decada,
                        onClick = { onSelectDecada(decada) }
                    )
                }
            }

            // Filtro por categoria
            LazyRow(
                modifier = Modifier.padding(bottom = 8.dp),
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                item {
                    CategoryChip(
                        label = "Todas",
                        isSelected = galleryState.selectedCategoria == null,
                        onClick = { onSelectCategoria(null) }
                    )
                }
                items(FashionCategory.entries) { categoria ->
                    CategoryChip(
                        label = categoria.displayName,
                        isSelected = galleryState.selectedCategoria == categoria,
                        onClick = { onSelectCategoria(categoria) }
                    )
                }
            }

            // Contador de resultados
            Text(
                text = "${galleryState.filteredItems.size} pecas encontradas",
                fontSize = 12.sp,
                color = Color(0xFF666666),
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp)
            )

            // Lista de pecas
            if (galleryState.filteredItems.isEmpty()) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(32.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Nenhuma peca encontrada\ncom os filtros selecionados",
                        color = Color(0xFF666666),
                        fontSize = 16.sp
                    )
                }
            } else {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items(galleryState.filteredItems) { item ->
                        FashionCard(
                            item = item,
                            onClick = { onItemClick(item.id) }
                        )
                    }
                }
            }
        }
    }
}
