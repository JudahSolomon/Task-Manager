package com.example.taskmanager.Composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.PrimaryTextColor
import com.example.taskmanager.R
import com.example.taskmanager.ui.theme.SubTextColor

@Preview(showBackground = true)
@Composable
fun HeaderSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp)
            .padding(top = 20.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(modifier = Modifier.weight(1f)) {


            Text(
                text = "Hello, KELVIN",
                fontFamily = MaterialTheme.typography.body1.fontFamily,
                fontSize = 18.sp,
                color = PrimaryTextColor,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Let's schedule your today's task",
                fontFamily = MaterialTheme.typography.body1.fontFamily,
                fontSize = 14.sp,
                color = SubTextColor,
                fontWeight = FontWeight.Medium
            )
        }

        Image(
            painter = painterResource(id = R.drawable.profile_picture),
            contentDescription = "logo image",
            modifier = Modifier
                .size(44.dp)
                .clip(RoundedCornerShape(20.dp))

        )

    }
}