package com.example.mycertificate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycertificate.ui.theme.MyCertificateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyCertificateTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                Box(modifier = Modifier.fillMaxSize().padding(innerPadding)){
                    Greeting(
                        //Aquí se modifica para el teléfono
                        name = "Stephania Ordaz",
                        )}
                }
            }
        }
    }
}

//Nos permite invocar las funciones visuales
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val namecourse = "Drivers Training"
    val hours = "2"
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        )
        {
            Image(
                painter = painterResource(R.drawable.formula_1_logo_png_seeklogo_330361),
                contentDescription = null,
                modifier.size(50.dp, 50.dp),
                alpha = 0.8F
            )
            Text(
                "Formula 1 Academy",
                fontSize = 22.sp,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
                modifier = Modifier.size(180.dp, 70.dp),
            )
            Image(
                painter = painterResource(R.drawable.formula_1_logo_png_seeklogo_330361),
                contentDescription = null,
                modifier.size(50.dp, 50.dp),
                alpha = 0.8F
            )

        }
        Spacer(modifier = Modifier.weight(1f))
        //Column para no encimar
        Column(
            modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
        )
        {
            Text(
                //Lo primero inicia con minúsculas y lo segundo con mayúsculas
                "This certificate is presented to:",
                fontSize = 15.sp,
                fontWeight = FontWeight.Light,
                textAlign = TextAlign.Center,
                modifier = modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(1.dp))
            Image(
                painter = painterResource(R.drawable.redbull),
                contentDescription = null,
                modifier = modifier.fillMaxWidth(),
                alpha = 0.1F
            )
            Spacer(modifier = Modifier.height(1.dp))
            Text(
                //Lo primero inicia con minúsculas y lo segundo con mayúsculas
                "$name",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(1.dp))
            //Por default encima los textos
            Text(
                "has successfully completed a $hours hours course on $namecourse",
                fontSize = 15.sp,
                fontWeight = FontWeight.Light,
                textAlign = TextAlign.Center,
                modifier = modifier.fillMaxWidth()
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        Row(
            modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround

        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.checo),
                    contentDescription = null,
                    modifier = Modifier.size(50.dp)
                )
                Text(
                    "Sergio Pérez",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Light,
                    textAlign = TextAlign.Center
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.maxverstappen),
                    contentDescription = null,
                    modifier = Modifier.size(50.dp)
                )
                Text(
                    "Max Verstappen",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Light,
                    textAlign = TextAlign.Center
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyCertificateTheme {
        //Aquí se modifica el nombre en la computadora
        Greeting("Stephania Ordaz")
    }
}