package com.example.taskmanager.Composables

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.R
import com.example.taskmanager.ui.theme.*

@Preview(showBackground = true)
@Composable
fun StatisticsIndicator() {
    Column(
        modifier = Modifier
            .height(120.dp)
            .padding(start = 20.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        IndicatorItems(text = "Started Well", color = SecondaryColor)
        IndicatorItems(text = "On Course", color = PrimaryColor)
        IndicatorItems(text = "Past Deadline", color = Red)
        IndicatorItems(text = "Finished On Time", color = PrimaryColor)

    }


}

@Composable
fun IndicatorItems(
    color: Color,
    text: String
) {
    Row() {
        Icon(
            painter = painterResource(id = R.drawable.ic_circle),
            contentDescription = "",
            tint = color,
            modifier = Modifier.size(20.dp)
        )
        Spacer(modifier = Modifier.width(12.dp))

        Text(
            text = text,
            fontSize = 12.sp,
            color = Color(0xFF818181),
            fontFamily = Poppins,
            fontWeight = FontWeight.Normal
        )

    }
}


@Composable
fun StatsProgressBarDesign(
    percent: Float,
    bgColor1: Color,
    bgColor2: Color,
) {
    Box(
        modifier = Modifier.size(120.dp),
        contentAlignment = Alignment.Center
    ) {


        Canvas(
            modifier = Modifier
                .size(100.dp)
                .padding(6.dp)
        ) {
            drawCircle(
                androidx.compose.ui.graphics.SolidColor(SolidColor),
                size.width / 2,
                style = Stroke(26f)

            )


            val value = (percent / 100) * 360

            drawArc(
                brush = Brush.linearGradient(
                    colors = listOf(
                        bgColor2, bgColor1
                    )
                ),
                startAngle = -90f,
                sweepAngle = value,
                useCenter = false,
                style = Stroke(26f, cap = StrokeCap.Round)
            )

        }

        Text(
            text = "${percent.toInt()}%\n Done",
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
            fontFamily = Poppins,
            textAlign = TextAlign.Center
        )

    }
}