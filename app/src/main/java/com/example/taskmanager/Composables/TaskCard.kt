package com.example.taskmanager.Composables

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.R
import com.example.taskmanager.ui.theme.*

@Composable
fun TaskCard(
    percentage: Float,
    completed: String,
    bgColor1:Color,
    bgcClor2:Color,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 22.dp)
            .padding(top = 40.dp),
        elevation = 6.dp,
        shape = RoundedCornerShape(20.dp)
    ) {

        Row(
            modifier = Modifier.padding(20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {


                Text(
                    text = "Daily Task",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    color = SubTextColor
                )
                Row(modifier = Modifier.padding(top = 6.dp)) {

                    Icon(
                        painter = painterResource(id = R.drawable.ic_tick_circle),
                        contentDescription = null,
                        tint = PrimaryColor
                    )



                    Text(text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = PrimaryColor,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Medium,
                                fontFamily = Poppins
                            )
                        )
                        {
                            append(completed)
                        }

                        withStyle(
                            style = SpanStyle(
                                color = Color.Black,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                        {
                            append("Task")
                        }
                    }
                    )
                }

                Text(
                    text = "Almost finished, \nkeep it up",
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Normal,
                    fontFamily = Poppins,
                    color = DarkTextColor,
                    modifier = Modifier.padding(top = 6.dp)

                )

               ClickButton(text = "Edit Task")

            }




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


                    val value = (percentage / 100) * 360

                    drawArc(
                        brush = Brush.linearGradient(
                            colors = listOf(
                                bgcClor2, bgColor1
                            )
                        ),
                        startAngle = -90f,
                        sweepAngle = value,
                        useCenter = false,
                        style = Stroke(26f, cap = StrokeCap.Round)
                    )

                }

                Text(
                    text = "${percentage.toInt()}%\n Done",
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    fontFamily = Poppins,
                    textAlign = TextAlign.Center
                )

            }
        }


    }
}

@Composable
fun ClickButton(
    text: String,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = {
//                            onConfirm()
        },
        colors = ButtonDefaults.buttonColors(
            backgroundColor = PrimaryColor,
            contentColor = Color.White
        ),
        modifier = Modifier,
        shape = CircleShape
    ) {
        Row (horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.size(width = 100.dp, height = 25.dp)){
            Icon(
                painter = painterResource(id = R.drawable.pen),
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.size(20.dp)
                    .padding(end =  3.dp)
            )
            Text(
                text = text,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Center,
                fontFamily = Poppins,
            )
        }
    }
}
