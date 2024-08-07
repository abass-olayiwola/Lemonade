package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                LemonadeTheme {
                    Surface(modifier = Modifier.fillMaxSize()) {
                    LemonPreview()
                }

            }
        }
    }
}

@Composable
fun LemonTypePage(modifier: Modifier = Modifier) {
    var step by remember { mutableIntStateOf(1) }

    when (step) {
        1 -> {
            Column(
                modifier = modifier,
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            )

            {
                Image(
                    painter = painterResource(R.drawable.lemon_tree),
                    contentDescription = stringResource(R.string.lemon_tree),
                    modifier = Modifier
                        .wrapContentSize()
                        .clickable { step = 2 }
                )

            Spacer(modifier = Modifier.height(24.dp))
            Text(text = stringResource(R.string.select_lemon))
        }
    }
        2 -> {
            Column(modifier = modifier,
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center )

            {

                Image(
                    painter = painterResource(R.drawable.lemon_squeeze),
                    contentDescription = stringResource(R.string.lemon),
                    modifier = Modifier
                        .wrapContentSize()
                        .clickable { step = 3 }
                )

                Spacer(modifier = Modifier.height(24.dp))
                Text(text = stringResource(R.string.keep_tapping))
            }
        }
        3 -> {
            Column(modifier = modifier,
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center )

            {

                Image(
                    painter = painterResource(R.drawable.lemon_squeeze),
                    contentDescription = stringResource(R.string.lemon),
                    modifier = Modifier
                        .wrapContentSize()
                        .clickable { step = 4 }
                )

                Spacer(modifier = Modifier.height(24.dp))
                Text(text = stringResource(R.string.keep_tapping))
            }
        }
        4 -> {
            Column(modifier = modifier,
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center )

            {

                Image(
                    painter = painterResource(R.drawable.lemon_drink),
                    contentDescription = stringResource(R.string.lemonade),
                    modifier = Modifier
                        .wrapContentSize()
                        .clickable { step = 5 }
                )

                Spacer(modifier = Modifier.height(24.dp))
                Text(text = stringResource(R.string.tap_lemonade))
            }
        }
        5 -> {
            Column(modifier = modifier,
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center )

            {

                Image(
                    painter = painterResource(R.drawable.lemon_restart),
                    contentDescription = stringResource(R.string.empty_glass),
                    modifier = Modifier
                        .wrapContentSize()
                        .clickable { step = 1 }
                )

                Spacer(modifier = Modifier.height(24.dp))
                Text(text = stringResource(R.string.tap_empty))
            }
        }



    }
}

@Preview(showBackground = true)
@Composable
fun LemonPreview() {
    LemonadeTheme {
        LemonTypePage()
    }
}