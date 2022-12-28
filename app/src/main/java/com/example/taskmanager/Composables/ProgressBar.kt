package com.example.taskmanager.Composables

import android.widget.ProgressBar
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.Poppins
import com.example.taskmanager.ui.theme.PrimaryColor
import com.example.taskmanager.ui.theme.SecondaryColor
import com.example.taskmanager.ui.theme.SolidColor
@Composable
fun ProgressBarDesign(percent:Float){
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
                SolidColor(SolidColor),
                size.width / 2,
                style = Stroke(26f)

            )


            val value = (percent / 100) * 360

            drawArc(
                brush = Brush.linearGradient(
                    colors = listOf(
                        SecondaryColor, PrimaryColor
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
