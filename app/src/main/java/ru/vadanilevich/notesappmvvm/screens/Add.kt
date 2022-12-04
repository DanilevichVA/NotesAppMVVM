package ru.vadanilevich.notesappmvvm.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import ru.vadanilevich.notesappmvvm.navigation.NavRoute

@Composable
fun AddScreen(navController: NavController){
    var title by remember { mutableStateOf("") }
    var subtitle by remember { mutableStateOf("") }
    Scaffold(
        modifier = Modifier.fillMaxSize()

    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
                    Text(
                        textAlign = TextAlign.Center,
                        text = "Add new note",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier.padding(vertical = 12.dp)
                    )
            OutlinedTextField(
                value = title ,
                onValueChange = {title = it },
            label = { Text(text = "Note title")})

            OutlinedTextField(
                value = subtitle ,
                onValueChange = {subtitle = it },
                label = { Text(text = "Note subtitle")})
            Button(modifier = Modifier.padding(vertical = 16.dp),
                onClick = { navController.navigate(NavRoute.Main.route)}) {
                Text(text = "Add note")
            }

                }
            }
}