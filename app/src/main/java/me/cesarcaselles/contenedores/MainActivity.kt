package me.cesarcaselles.contenedores

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import me.cesarcaselles.contenedores.ui.theme.ContenedoresTheme
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ContentScreen()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ContentScreen() {
    Column(modifier = Modifier
        .background(Color.Magenta)
        .padding(18.dp)
        .fillMaxSize(),
        verticalArrangement =  Arrangement.SpaceBetween,
        horizontalAlignment =  Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .background(Color.Blue)
                .padding(18.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(
                text = "Inicio",
                modifier = Modifier
                    .background(Color.Red)
                    .padding(8.dp)
            )
            Text(
                text = "Perfil",
                modifier = Modifier
                    .background(Color.Green)
                    .padding(8.dp)
            )
            Text(
                text = "Configuración",
                modifier = Modifier
                    .background(Color.Yellow)
                    .padding(8.dp)
            )
        }
        Text(
            text = "Titulo",
            modifier = Modifier
                .background(Color.Yellow)
                .padding(8.dp)
        )
        Text(
            text = "Descripción",
            modifier = Modifier
                .background(Color.Yellow)
                .padding(8.dp)
        )
        Text(
            text = "Otro elemento",
            modifier = Modifier
                .background(Color.Yellow)
                .padding(8.dp)
        )
    }
}