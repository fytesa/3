package com.example.jetsnack.model

import androidx.compose.runtime.Immutable
import com.example.jetsnack.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

/**
 * A fake repo for searching.
 */
object SearchRepo {
    fun getCategories(): List<SearchCategoryCollection> = searchCategoryCollections
    fun getSuggestions(): List<SearchSuggestionGroup> = searchSuggestions

    suspend fun search(query: String): List<Snack> = withContext(Dispatchers.Default) {
        delay(200L) // simulate an I/O delay
        snacks.filter { it.name.contains(query, ignoreCase = true) }
    }
}

@Immutable
data class SearchCategoryCollection(val id: Long, val name: String, val categories: List<SearchCategory>)

@Immutable
data class SearchCategory(val name: String, val imageRes: Int)

@Immutable
data class SearchSuggestionGroup(val id: Long, val name: String, val suggestions: List<String>)

/**
 * Static data
 */

private val searchCategoryCollections = listOf(
    SearchCategoryCollection(
        id = 0L,
        name = "Категории",
        categories = listOf(
            SearchCategory(
                name = "Снэки",
                imageRes = R.drawable.chips,
            ),
            SearchCategory(
                name = "Фруктовые снэки",
                imageRes = R.drawable.fruit,
            ),
            SearchCategory(
                name = "Десерты",
                imageRes = R.drawable.desserts,
            ),
            SearchCategory(
                name = "Орехи",
                imageRes = R.drawable.nuts,
            ),
        ),
    ),
    SearchCategoryCollection(
        id = 1L,
        name = "Образ жизни",
        categories = listOf(
            SearchCategory(
                name = "Органика",
                imageRes = R.drawable.organic,
            ),
            SearchCategory(
                name = "Без сахара",
                imageRes = R.drawable.gluten_free,
            ),
            SearchCategory(
                name = "Разнообразное",
                imageRes = R.drawable.paleo,
            ),
            SearchCategory(
                name = "Для веганов",
                imageRes = R.drawable.vegan,
            ),
            SearchCategory(
                name = "Вегетарианцам",
                imageRes = R.drawable.organic,
            ),
            SearchCategory(
                name = "Кому за 30",
                imageRes = R.drawable.paleo,
            ),
        ),
    ),
)

private val searchSuggestions = listOf(
    SearchSuggestionGroup(
        id = 0L,
        name = "Недавнее в поиске",
        suggestions = listOf(
            "Сыр",
            "Яблочное пюре",
        ),
    ),
    SearchSuggestionGroup(
        id = 1L,
        name = "Популярное в поиске",
        suggestions = listOf(
            "Органика",
            "Без сахара",
        ),
    ),
)
