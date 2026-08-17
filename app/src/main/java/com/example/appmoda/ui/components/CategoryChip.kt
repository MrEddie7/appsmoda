package com.example.appmoda.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Checkroom
import androidx.compose.material.icons.filled.Shield
import androidx.compose.material.icons.filled.Watch
import androidx.compose.material.icons.filled.Flight
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appmoda.data.model.FashionCategory
import com.example.appmoda.data.model.FashionItem

@Composable
fun CategoryChip(
    label: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    FilterChip(
        selected = isSelected,
        onClick = onClick,
        label = {
            Text(
                text = label,
                fontSize = 13.sp,
                fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal
            )
        },
        colors = FilterChipDefaults.filterChipColors(
            selectedContainerColor = Color(0xFFE94560),
            selectedLabelColor = Color.White,
            containerColor = Color(0xFF2A2A4A),
            labelColor = Color(0xFFBBBBBB)
        )
    )
}

@Composable
fun DecadeChip(
    label: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    FilterChip(
        selected = isSelected,
        onClick = onClick,
        label = {
            Text(
                text = label,
                fontSize = 13.sp,
                fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal
            )
        },
        colors = FilterChipDefaults.filterChipColors(
            selectedContainerColor = Color(0xFF533483),
            selectedLabelColor = Color.White,
            containerColor = Color(0xFF2A2A4A),
            labelColor = Color(0xFFBBBBBB)
        )
    )
}

fun getCategoryIcon(category: FashionCategory): ImageVector {
    return when (category) {
        FashionCategory.ROUPAS -> Icons.Default.Checkroom
        FashionCategory.ARMADURAS -> Icons.Default.Shield
        FashionCategory.ACESSORIOS_CIVIS -> Icons.Default.Watch
        FashionCategory.ACESSORIOS_MILITARES -> Icons.Default.Flight
    }
}

fun getCategoryColor(category: FashionCategory): Color {
    return when (category) {
        FashionCategory.ROUPAS -> Color(0xFFE94560)
        FashionCategory.ARMADURAS -> Color(0xFF533483)
        FashionCategory.ACESSORIOS_CIVIS -> Color(0xFF0F3460)
        FashionCategory.ACESSORIOS_MILITARES -> Color(0xFF1A5632)
    }
}
