package com.example.birthdaycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.birthdaycard.ui.theme.BirthdayCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    GreetingText(message = "happy birthday sky", from = "from sk")
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String,from: String,modifier: Modifier=Modifier){
    Text(
        text = message,
        fontSize = 100.sp,
        lineHeight = 116.sp
    )
    Text(
        text = from,
        fontSize = 36.sp,

    )

    /*
    * Row(
    content = {
        Text("Some text")
        Text("Some more text")
        Text("Last text")
    }
) is equal to
* Row {
    Text("Some text")
    Text("Some more text")
    Text("Last text")
}
*
* this is called the trailing lambda syntax in which a
* function parameter of a function which is the parameter to the
* main function is directly give in the curly braces
    * */
}




@Preview(showBackground = true,name="preview")
@Composable
fun BirthdayCardPreview() {
    BirthdayCardTheme {
        GreetingText(message = "Happy birthday sky",from="from sk")
    }
}