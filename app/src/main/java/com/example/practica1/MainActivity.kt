package com.example.practica1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practica1.ui.theme.Practica1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Practica1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        texto = "Adrian Rios Ramos",
                        texto2 = "22130518",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(texto: String, texto2: String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(48.dp)
    ) {
        Text(
            text = texto,
            modifier = modifier,
            lineHeight = 600.sp,
            fontSize = 35.sp,
            textAlign = TextAlign.Center,
            color = Color.Red

        )

    }

    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(168.dp)
    ) {
        Text(
            text = texto2,
            modifier = modifier,
            fontSize = 15.sp,
            lineHeight = 450.sp,
            textAlign = TextAlign.Center,
            color = Color.Blue
        )

    }



}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Practica1Theme {
        Greeting("Android", texto2 = "Hola")
    }
}