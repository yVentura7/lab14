package com.example.lab14

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.glance.Button
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.GlanceTheme
import androidx.glance.action.actionStartActivity
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.background
import androidx.glance.layout.Alignment
import androidx.glance.layout.Column
import androidx.glance.layout.Row
import androidx.glance.layout.fillMaxSize
import androidx.glance.layout.padding
import androidx.glance.text.Text

class SimpleWidgetContent : GlanceAppWidget() {

    override suspend fun provideGlance(context: Context, id: GlanceId) {
        provideContent {
            GlanceTheme {
                MyContent(context)
            }
        }
    }

    @Composable
    private fun MyContent(context: Context) {
        Column(
            modifier = GlanceModifier.fillMaxSize()
                .background(GlanceTheme.colors.background),
            verticalAlignment = Alignment.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "¿A donde quieres dirigirte?", modifier = GlanceModifier.padding(12.dp))

            Row(horizontalAlignment = Alignment.CenterHorizontally) {
                // Botón para abrir la página principal
                Button(
                    text = "Página Principal",
                    onClick = actionStartActivity<MainActivity>()
                )
            }

            Row(horizontalAlignment = Alignment.CenterHorizontally) {
                // Botón para abrir YouTube
                Button(
                    text = "Ir a YouTube",
                    onClick = actionStartActivity<YouTubeRedirectActivity>()
                )

                // Botón para abrir el Calendario
                Button(
                    text = "Ir al Maps",
                    onClick = actionStartActivity<GoogleMapsRedirectActivity>()
                )
            }
        }
    }
}
