package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.Composables.*
import com.example.taskmanager.ui.theme.*
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = BackgroundColor, modifier = Modifier.fillMaxSize()
                ) {
//                    window.statusBarColor =
//                        ContextCompat.getColor
//                    (this,R.color.background)

                    val systemUiController = rememberSystemUiController()
                    SideEffect {
//                        systemUiController.setStatusBarColor(
//                            color = PrimaryColor,
//                            darkIcons = false
//                        )

                        systemUiController.setStatusBarColor(color = PrimaryColor)
                    }

                    LazyColumn() {
                        item {
                            TaskPreview1()

                            Divider(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(2.dp)
                                    .padding(horizontal = 40.dp)
                                    .background(SubTextColor)
                            )

                            TaskPreview2()

                            Divider(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(2.dp)
                                    .padding(horizontal = 40.dp)
                                    .background(Color.Black)
                            )

                            TaskPreview3()
                        }
                    }
                }
            }
        }
    }
}

//TaskPreview1
@Preview(showBackground = true)
@Composable
fun TaskPreview1() {
    TaskManagerTheme {
        Column(
            Modifier
                .fillMaxSize()
                .background(BackgroundColor)
        ) {
            HeaderSection()
            TaskCard(
                60f, "4/6 ",
                bgcClor2 = AquaSplash2,
                bgColor1 = AquaSplash1
            )

            DurationSection("10:00 PM - 12:00 PM", "12/02/2022")


            Text(
                text = "Statistics",
                fontSize = 16.sp,
                color = PrimaryTextColor,
                fontFamily = Poppins,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(30.dp)

            )

            Column {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 30.dp)
                ) {
                    StatsProgressBarDesign(
                        percent = 80f,
                        bgColor1 = SecondaryColor,
                        bgColor2 = PrimaryColor
                    )

                    StatisticsIndicator()
                }

                PerformanceFeedback(
                    title = "Performance",
                    description = "You Started well today\n" +
                            " but you got lazy along the way\n" +
                            " Remember consistency is the Key"
                )
            }
        }

    }
}

//TaskPreview2
@Preview(showBackground = true)
@Composable
fun TaskPreview2() {
    TaskManagerTheme {
        Column(
            Modifier
                .fillMaxSize()
                .background(BackgroundColor)
        ) {

            TaskCard(
                30f, "2/6 ",
                bgcClor2 = Red1,
                bgColor1 = Red2
            )

            DurationSection("10:00 PM - 12:00 PM", "16/02/2022")


            Text(
                text = "Statistics",
                fontSize = 16.sp,
                color = PrimaryTextColor,
                fontFamily = Poppins,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(30.dp)

            )

            Column {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 30.dp)
                ) {
                    StatsProgressBarDesign(
                        percent = 60f,
                        bgColor1 = Red2,
                        bgColor2 = Red1
                    )

                    StatisticsIndicator()
                }

                PerformanceFeedback(
                    title = "Performance",
                    description = "You Started well today\n" +
                            " but you got lazy along the way\n" +
                            " Remember consistency is the Key"
                )
            }
        }

    }
}
//TaskPreview3----------------------------

@Preview(showBackground = true)
@Composable
fun TaskPreview3() {
    TaskManagerTheme {
        Column(
            Modifier
                .fillMaxSize()
                .background(BackgroundColor)
        ) {

            TaskCard(
                900f, "5/6 ",
                bgcClor2 = Green2,
                bgColor1 = Green1
            )

            DurationSection("10:00 PM - 12:00 PM", "19/02/2022")


            Text(
                text = "Statistics",
                fontSize = 16.sp,
                color = PrimaryTextColor,
                fontFamily = Poppins,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(30.dp)

            )

            Column {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 30.dp)
                ) {
                    StatsProgressBarDesign(
                        percent = 80f,
                        bgColor1 = Green1,
                        bgColor2 = Green2
                    )

                    StatisticsIndicator()
                }

                PerformanceFeedback(
                    title = "Performance",
                    description = "Great,you Started well today\n" +
                            " and you managed to keep up the pace\n" +
                            " Great Work"
                )
            }
        }

    }
}











