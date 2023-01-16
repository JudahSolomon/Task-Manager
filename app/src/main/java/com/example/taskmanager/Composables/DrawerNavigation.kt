package com.example.taskmanager.Composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.R
import com.example.taskmanager.ui.theme.LightGrey


@Preview(showBackground = true)
@Composable
fun DrawerNavigationUI() {

    LazyColumn{
        item {
            DrawerNavigation()
        }
    }

}

    @Preview(showBackground = true)
@Composable
fun DrawerNavigation() {



    Column(modifier = Modifier.fillMaxSize()) {

        Image(
            painter = painterResource(id = R.drawable.task_image),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
                .height(200.dp)
        )

        // first item

        DrawNavItems(
            leadingIcon = painterResource(id = R.drawable.add),
            text = "Add Task ",
            detailText = "Add new tasks ",

            )
        Divider()

        // first item

        DrawNavItems(
            leadingIcon = painterResource(id = R.drawable.search_icon),
            text = "Search ",
            detailText = "tasks you've created so far",

            )
        Divider()

        // second item

        DrawNavItems(
            leadingIcon = painterResource(id = R.drawable.history),
            text = "History",
            detailText = "check you task history",

            )
        Divider()

        // third item

        DrawNavItems(
            leadingIcon = painterResource(id = R.drawable.policy),
            text = "Policy",
            detailText = "Read Private Policy",

            )
        Divider()

        // third item

        DrawNavItems(
            leadingIcon = painterResource(id = R.drawable.heart),
            text = "Share",
            detailText = "Share this APp with your friends",

            )
        Divider()

        DrawNavItems(
            leadingIcon = painterResource(id = R.drawable.trash),
            text = "Delete",
            detailText = "Delete Task",

            )
        Divider()

    }

}

@Composable
fun DrawNavItems(

    leadingIcon: Painter,
    text: String,
    detailText: String,
    modifier: Modifier = Modifier

) {

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(10.dp)
            .padding(top = 10.dp, end = 20.dp),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.Top
    ) {

        Icon(
            painter = leadingIcon,
            contentDescription = "",
            tint = if (isSystemInDarkTheme())
                White else LightGrey,
            modifier = modifier
                .padding(top = 10.dp)
                .size(20.dp)
                .weight(1f)

        )
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = modifier

                .weight(5f)) {


            Text(
                text = text,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Black,
                modifier = modifier



            )
            Text(
                text = detailText,
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal,
                color = LightGrey,
                modifier = modifier
                    .padding(start = 50.dp)
                    .width(300.dp)


            )
        }

        Spacer(modifier = modifier.width(70.dp))

        Icon(
            Icons.Default.ArrowForward, contentDescription = null,
            tint = if (isSystemInDarkTheme())
                White else LightGrey,
            modifier = modifier
                .size(20.dp)
                .padding(top = 10.dp)



        )


    }
}