package com.example.taskmanager.Composables

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.Poppins
import com.example.taskmanager.ui.theme.PrimaryTextColor
import com.example.taskmanager.ui.theme.SubTextColor

@Composable
fun PerformanceFeedback(
    title: String,
    description: String
) {


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp, start = 30.dp, bottom =20.dp),
        verticalArrangement = Arrangement.Center
    ) {

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = title,
            fontSize = 18.sp,
            color = PrimaryTextColor,
            fontFamily = Poppins,
            fontWeight = FontWeight.Black
        )
        Text(
            text = description,
            fontSize = 14.sp,
            color = SubTextColor,
            fontFamily = Poppins,
            fontWeight = FontWeight.Medium
        )

    }
}