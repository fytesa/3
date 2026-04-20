package com.example.jetsnack

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.example.jetsnack.ui.MainActivity
import org.junit.Rule
import org.junit.Test

class AppTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun app_launches() {
        // Check app launches at the correct destination
        composeTestRule.onNodeWithText("На главный экран").assertIsDisplayed()
        composeTestRule.onNodeWithText("По десерту?").assertIsDisplayed()
    }

    @Test
    fun app_canNavigateToAllScreens() {
        // Check app launches at HOME
        composeTestRule.onNodeWithText("На главный экран").assertIsDisplayed()
        composeTestRule.onNodeWithText("По десерту?").assertIsDisplayed()

        // Navigate to Search
        composeTestRule.onNodeWithText("Поиск").performClick().assertIsDisplayed()
        composeTestRule.onNodeWithText("Категории").assertIsDisplayed()

        // Navigate to Cart
        composeTestRule.onNodeWithText("Корзина").performClick().assertIsDisplayed()
        composeTestRule.onNodeWithText("Заказ (3)").assertIsDisplayed()

        // Navigate to Profile
        composeTestRule.onNodeWithText("Профиль").performClick().assertIsDisplayed()
        composeTestRule.onNodeWithText("На данный момент раздел в разработке...").assertIsDisplayed()
    }

    @Test
    fun app_canNavigateToDetailPage() {
        composeTestRule.onNodeWithText("Чипсы").performClick()
        composeTestRule.onNodeWithText("Прекрасно сделано", substring = true).assertIsDisplayed()
    }
}
