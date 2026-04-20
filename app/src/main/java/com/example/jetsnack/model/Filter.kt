
package com.example.jetsnack.model

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Stable
import androidx.compose.runtime.mutableStateOf
import com.example.jetsnack.R

@Stable
class Filter(val name: String, enabled: Boolean = false, @DrawableRes val icon: Int? = null) {
    val enabled = mutableStateOf(enabled)
}

val filters = listOf(
    Filter(name = "Органика"),
    Filter(name = "Без сахара"),
    Filter(name = "Без лактозы"),
    Filter(name = "Сладкое"),
    Filter(name = "Пикантный"),
)
val priceFilters = listOf(
    Filter(name = "$"),
    Filter(name = "$$"),
    Filter(name = "$$$"),
    Filter(name = "$$$$"),
)
val sortFilters = listOf(
    Filter(name = "Популярное", icon = R.drawable.ic_android),
    Filter(name = "Рейтинг", icon = R.drawable.ic_star),
    Filter(name = "Алфавит", icon = R.drawable.ic_sort_by_alpha),
)

val categoryFilters = listOf(
    Filter(name = "Снэки"),
    Filter(name = "Фруктовые снэки"),
    Filter(name = "Десерты"),
    Filter(name = "Орехи"),
)
val lifeStyleFilters = listOf(
    Filter(name = "Органика"),
    Filter(name = "Без сахара"),
    Filter(name = "Без лактозы"),
    Filter(name = "Сладкое"),
    Filter(name = "Пикантный"),
)

var sortDefault = sortFilters.get(0).name
