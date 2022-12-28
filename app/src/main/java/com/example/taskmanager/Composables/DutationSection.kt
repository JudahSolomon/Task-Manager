package com.example.taskmanager.Composables

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.R
import com.example.taskmanager.ui.theme.*


@Composable
fun DurationSection(
    time:String,
    date:String
){
    Column(
        modifier = Modifier.padding(30.dp)
    ) {
        Text(
            text = "Duration",
            fontSize = 16.sp,
            color = PrimaryTextColor,
            fontFamily = Poppins,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = date,
            fontSize = 12.sp,
            color = Color(0xFF818181),
            fontWeight = FontWeight.Medium,
            fontFamily = Poppins,
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 6.dp),
        )
        {
            Icon(
                painter = painterResource(id = R.drawable.ic_clock),
                contentDescription = "",
                modifier = Modifier
                    .size(16.dp)
                    .padding(end = 6.dp),
                tint = ClockIcon
            )

            Text(
                text = time,
                fontSize = 12.sp,
                color = Color(0xFF818181),
                fontWeight = FontWeight.Medium,
                fontFamily = Poppins,

                )
            Spacer(modifier = Modifier.width(80.dp))

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .background(BackgroundColor1)
                    .border(
                        width = 0.dp,
                        color = Color.Transparent,
                        shape = RoundedCornerShape(20.dp),
                    )
                    .padding(vertical = 5.dp, horizontal = 15.dp)
            ) {
                Text(
                    text = "On Going",
                    fontSize = 10.sp,
                    fontFamily = Poppins,
                    color = Color(0xFF7885B9)
                )

            }

        }







    }
}
