package com.example.quadranty

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.quadranty.ui.theme.QuadrantyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    QuadrantView()
                }
            }
        }
    }
}

@Composable
fun QuadrantView(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f) // Takes 50% of the screen height
        ) {
            Column(
                modifier = Modifier
                    .background(color = Color(0xFFEADDFF))
                    .weight(1f) // Each column within the row gets 50% of the row's width
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "Text composable")
                Text(text = "Displays text and follows the recommended Material Design guidelines.")
            }
            Column(
                modifier = Modifier
                    .background(color = Color(0xFFD0BCFF))
                    .weight(1f)
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "Image composable")
                Text(text = "Creates a composable that lays out and draws a given Painter class object.")
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f) // Takes the remaining 50% of the screen height
        ) {
            Column(
                modifier = Modifier
                    .background(color = Color(0xFFB69DF8))
                    .weight(1f)
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "Row composable")
                Text(text = "A layout composable that places its children in a horizontal sequence.")
            }
            Column(
                modifier = Modifier
                    .background(color = Color(0xFFF6EDFF))
                    .weight(1f)
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "Column composable")
                Text(text = "A layout composable that places its children in a vertical sequence.")
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuadrantyTheme {
       QuadrantView()
    }
}