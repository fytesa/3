
package com.example.jetsnack.model

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Immutable
import com.example.jetsnack.R
import kotlin.random.Random

@Immutable
data class Snack(
    val id: Long,
    val name: String,
    @DrawableRes
    val imageRes: Int,
    val price: Long,
    val tagline: String = "",
    val tags: Set<String> = emptySet(),
)

/**
 * Static data
 */

val snacks = listOf(
    Snack(
        id = 1L,
        name = "Капкейк",
        tagline = "A tag line",
        imageRes = R.drawable.cupcake,
        price = 299,
    ),
    Snack(
        id = Random.nextLong(),
        name = "Донат",
        tagline = "A tag line",
        imageRes = R.drawable.donut,
        price = 299,
    ),
    Snack(
        id = Random.nextLong(),
        name = "Эклер",
        tagline = "A tag line",
        imageRes = R.drawable.eclair,
        price = 299,
    ),
    Snack(
        id = Random.nextLong(),
        name = "Фройя",
        tagline = "A tag line",
        imageRes = R.drawable.froyo,
        price = 299,
    ),
    Snack(
        id = Random.nextLong(),
        name = "Имбирный пряник",
        tagline = "A tag line",
        imageRes = R.drawable.gingerbread,
        price = 499,
    ),
    Snack(
        id = Random.nextLong(),
        name = "Соты",
        tagline = "A tag line",
        imageRes = R.drawable.honeycomb,
        price = 299,
    ),
    Snack(
        id = Random.nextLong(),
        name = "Мороженое сендвич",
        tagline = "A tag line",
        imageRes = R.drawable.ice_cream_sandwich,
        price = 1299,
    ),
    Snack(
        id = Random.nextLong(),
        name = "Бобы",
        tagline = "A tag line",
        imageRes = R.drawable.jelly_bean,
        price = 299,
    ),
    Snack(
        id = Random.nextLong(),
        name = "Киткат",
        tagline = "A tag line",
        imageRes = R.drawable.kitkat,
        price = 549,
    ),
    Snack(
        id = Random.nextLong(),
        name = "Лолипоп",
        tagline = "A tag line",
        imageRes = R.drawable.lollipop,
        price = 299,
    ),
    Snack(
        id = Random.nextLong(),
        name = "Маршмеллоу",
        tagline = "A tag line",
        imageRes = R.drawable.marshmallow,
        price = 299,
    ),
    Snack(
        id = Random.nextLong(),
        name = "Нуга",
        tagline = "A tag line",
        imageRes = R.drawable.nougat,
        price = 299,
    ),
    Snack(
        id = Random.nextLong(),
        name = "Орео",
        tagline = "A tag line",
        imageRes = R.drawable.oreo,
        price = 299,
    ),
    Snack(
        id = Random.nextLong(),
        name = "Пирог",
        tagline = "A tag line",
        imageRes = R.drawable.pie,
        price = 299,
    ),
    Snack(
        id = Random.nextLong(),
        name = "Чипсы",
        imageRes = R.drawable.chips,
        price = 299,
    ),
    Snack(
        id = Random.nextLong(),
        name = "Крендельки",
        imageRes = R.drawable.pretzels,
        price = 299,
    ),
    Snack(
        id = Random.nextLong(),
        name = "Смузи",
        imageRes = R.drawable.smoothies,
        price = 299,
    ),
    Snack(
        id = Random.nextLong(),
        name = "Попкорн",
        imageRes = R.drawable.popcorn,
        price = 299,
    ),
    Snack(
        id = Random.nextLong(),
        name = "Миндаль",
        imageRes = R.drawable.almonds,
        price = 299,
    ),
    Snack(
        id = Random.nextLong(),
        name = "Сыр",
        imageRes = R.drawable.cheese,
        price = 299,
    ),
    Snack(
        id = Random.nextLong(),
        name = "Яблоки",
        tagline = "A tag line",
        imageRes = R.drawable.apples,
        price = 299,
    ),
    Snack(
        id = Random.nextLong(),
        name = "Яблочное пюре",
        tagline = "A tag line",
        imageRes = R.drawable.apple_sauce,
        price = 299,
    ),
    Snack(
        id = Random.nextLong(),
        name = "Чипсы из яблока",
        tagline = "A tag line",
        imageRes = R.drawable.apple_chips,
        price = 299,
    ),
    Snack(
        id = Random.nextLong(),
        name = "Яблочный сок",
        tagline = "A tag line",
        imageRes = R.drawable.apple_juice,
        price = 299,
    ),
    Snack(
        id = Random.nextLong(),
        name = "Яблочный пирог",
        tagline = "A tag line",
        imageRes = R.drawable.apple_pie,
        price = 299,
    ),
    Snack(
        id = Random.nextLong(),
        name = "Виноград",
        tagline = "A tag line",
        imageRes = R.drawable.grapes,
        price = 299,
    ),
    Snack(
        id = Random.nextLong(),
        name = "Киви",
        tagline = "A tag line",
        imageRes = R.drawable.kiwi,
        price = 299,
    ),
    Snack(
        id = Random.nextLong(),
        name = "Манго",
        tagline = "A tag line",
        imageRes = R.drawable.mango,
        price = 299,
    ),
)
