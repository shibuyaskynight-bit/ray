package tw.edu.pu.csim.tcyang.rollthedice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import tw.edu.pu.csim.tcyang.rollthedice.R.drawable
import tw.edu.pu.csim.tcyang.rollthedice.ui.theme.RollthediceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RollthediceTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Dice(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Dice(modifier: Modifier = Modifier, name: String) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text("請點擊圖片隨機丟骰子\n作者 : 謝秉育")

        Image(
            painter = painterResource(id = drawable.dice0).
            contentDescription = "Dice"
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RollthediceTheme {
        Dice(name = "Android")
    }
}