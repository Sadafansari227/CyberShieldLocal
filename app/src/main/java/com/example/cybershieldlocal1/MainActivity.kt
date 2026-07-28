package com.example.cybershieldlocal1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cybershieldlocal1.ui.theme.CyberShieldLocal1Theme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            CyberShieldLocal1Theme {
                HomeScreen()
            }
        }
    }
}

@Composable
fun HomeScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "🛡️ CyberShield Local",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Stay Safe from Cyber Frauds",
            fontSize = 18.sp
        )

        Spacer(modifier = Modifier.height(40.dp))

        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Check SMS")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Check Link")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Report Scam")
        }

    }

}