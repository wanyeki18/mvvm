package com.wanyeki.mvvm_morning.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.wanyeki.mvvm_morning.navigation.ROUTE_ABOUT


@Composable
fun HomeScreen(navController: NavHostController) {
    Column (horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
             modifier = Modifier
                 .fillMaxSize()
                 .background(Color.Black)
    ){
       Text(text = "This is HomePage",
            color = Color.Magenta,
            fontFamily = FontFamily.Cursive,
            fontSize = 30.sp
       )
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
                   navController.navigate(ROUTE_ABOUT)

        },
            modifier = Modifier.fillMaxWidth()) {

            Text(text = "About")
        }
    }

}

@Preview
@Composable
private fun Homeprev() {
    HomeScreen(navController = rememberNavController())

}