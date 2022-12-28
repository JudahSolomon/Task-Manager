package com.example.taskmanager.Composables

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.BackgroundColor
import com.example.taskmanager.ui.theme.Poppins
import com.example.taskmanager.ui.theme.SecondaryColor


@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun CustomDialog(showDialogBox: Boolean) {

    val showDialog = remember {
        mutableSetOf(false)
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Add New Task for Today",
            fontFamily = Poppins,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(bottom = 20.dp)
        )

        AddTaskTextField(
            "Add Task",
            modifier = Modifier
                .padding(bottom = 20.dp)
        )
        AddTaskTextField(
            "Start Time",
            modifier = Modifier
                .padding(bottom = 20.dp)
        )


        AddTaskTextField(
            "Finish Time",
            modifier = Modifier
                .padding(bottom = 20.dp)
        )
        Row(horizontalArrangement = Arrangement.SpaceBetween) {
            DialogButton(
                text = "Cancel",
                modifier = Modifier.weight(1f)
            )
            DialogButton(
                text = "Okay",
                modifier = Modifier.weight(1f)

            )
        }


    }

}

@Composable
fun AddTaskTextField(
    text: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value = "",
            onValueChange = {},
            label = {
                Text(
                    text = text,
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center,
                    fontFamily = Poppins,
                )
            },
            singleLine = true,

            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = BackgroundColor,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            trailingIcon = {
                // add a task trailing icon here
            },
            shape = RoundedCornerShape(20.dp),
            modifier = modifier
                .height(56.dp)
                .fillMaxWidth()
                .padding(end = 20.dp)
        )

    }
}

@Composable
fun DialogButton(
    text: String,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = {
//                            onConfirm()
        },
        colors = ButtonDefaults.buttonColors(
            backgroundColor = SecondaryColor,
            contentColor = Color.White
        ),
        modifier = Modifier,
        shape = CircleShape
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.h6,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            fontFamily = Poppins,
        )
    }
}