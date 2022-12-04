package ru.vadanilevich.notesappmvvm.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import ru.vadanilevich.notesappmvvm.navigation.NavRoute
import ru.vadanilevich.notesappmvvm.ui.theme.NotesAppMVVMTheme

@Composable
fun StartScreen(navController: NavController){
Scaffold(modifier = Modifier.fillMaxSize()) {
    Column(modifier = Modifier.fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center) {
Text(text = "What will we use?")
        Button(onClick = {
            navController.navigate(route = NavRoute.Main.route)
        },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green,
                contentColor = Color.Black),
        modifier = Modifier
            .width(200.dp)
            .padding(vertical = 8.dp)) {
Text(text = "Room database")
        }
        Button(onClick = {
            navController.navigate(route = NavRoute.Main.route)
        },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black,
            contentColor = Color.White),
            modifier = Modifier
                .width(200.dp)
                .padding(vertical = 8.dp)) {
            Text(text = "Firebase database")
        }
    }
}
}

@Preview(showBackground = true)
@Composable
fun previewStartScreen() {
    NotesAppMVVMTheme {
StartScreen(navController = rememberNavController())
    }
}