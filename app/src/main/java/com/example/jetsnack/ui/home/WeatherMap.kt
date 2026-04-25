package com.example.jetsnack.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import org.osmdroid.tileprovider.tilesource.TileSourceFactory
import org.osmdroid.util.GeoPoint
import androidx.compose.runtime.*
import kotlinx.coroutines.launch
import org.osmdroid.views.MapView
import org.osmdroid.views.overlay.Marker

@Composable
fun WeatherMapScreen() {
    val scope = rememberCoroutineScope()
    // Состояние для хранения температуры
    var weatherInfo by remember { mutableStateOf("Загрузка...") }
    val apiKey = "c1ea2a62da058a6e2984652266cc8b4a"

    // Координаты СФУ
    val lat = 55.9943
    val lon = 92.7975

    // Запрос данных при запуске
    LaunchedEffect(Unit) {
        try {
            val service = WeatherApiService.create()
            val response = service.getCurrentWeather(lat, lon, apiKey)
            weatherInfo = "${response.cityName}: ${response.main.temp}°C, ${response.weatherDescription[0].info}"
        } catch (e: Exception) {
            weatherInfo = "Ошибка загрузки погоды"
        }
    }

    Box(modifier = Modifier.fillMaxSize()) {
        // Карта OSM (оставляем как была в предыдущем сообщении)
        AndroidView(
            modifier = Modifier.fillMaxSize(),
            factory = { context ->
                org.osmdroid.config.Configuration.getInstance().userAgentValue = context.packageName
                org.osmdroid.views.MapView(context).apply {
                    setTileSource(org.osmdroid.tileprovider.tilesource.TileSourceFactory.MAPNIK)
                    setMultiTouchControls(true)
                    controller.setZoom(15.0)
                    controller.setCenter(org.osmdroid.util.GeoPoint(lat, lon))

                    // 1. Маркер целевой точки (СФУ)
                    val marker = org.osmdroid.views.overlay.Marker(this)
                    marker.position = org.osmdroid.util.GeoPoint(lat, lon)
                    marker.title = "Целевая точка"
                    overlays.add(marker)

                    // 2. Слой твоей текущей геопозиции (Пункт 3 твоего вопроса)
                    val locationOverlay = org.osmdroid.views.overlay.mylocation.MyLocationNewOverlay(
                        org.osmdroid.views.overlay.mylocation.GpsMyLocationProvider(context), 
                        this
                    )
                    locationOverlay.enableMyLocation() // Включает отображение синей точки
                    overlays.add(locationOverlay)
                }
            }
        )

        // Панель с реальными данными (Пункт 2 задания выполнен!)
        Column(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(16.dp)
                .background(Color.White.copy(alpha = 0.9f), MaterialTheme.shapes.medium)
                .padding(16.dp)
        ) {
            Text(
                text = "Текущая погода", 
                style = MaterialTheme.typography.titleSmall,
                color = Color.Black // Сделали черным
            )
            Text(
                text = weatherInfo, 
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Black // Сделали черным
            )
        }
    }
}