package tech.devscast.devsquotes.presentation.screen.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import tech.devscast.devsquotes.R
import tech.devscast.devsquotes.app.navigation.Screen
import tech.devscast.devsquotes.presentation.theme.FavoriteBotBlack

@Composable
fun TopPageBar(modifier: Modifier = Modifier, onSettingClick: () -> Unit) {
    TopAppBar(
        modifier = modifier.height(70.dp),
        backgroundColor = MaterialTheme.colors.surface,
        elevation = 0.dp
    ) {
        Row(
            modifier = Modifier
                .padding(start = 16.dp, end = 5.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            TopTitle()
            SettingButton(onClick = onSettingClick)
        }
    }
}

@Composable
fun TopTitle() {
    Column {
        Text(
            text = stringResource(id = R.string.app_name),
            style = TextStyle(
                color = FavoriteBotBlack,
                fontWeight = FontWeight.Medium,
                fontSize = 24.sp
            )
        )
        Text(
            text = stringResource(id = R.string.home_sub_title),
            style = TextStyle(
                fontWeight = FontWeight.Normal,
                fontStyle = FontStyle.Italic,
                fontSize = 14.sp
            )
        )
    }
}

@Composable
fun SettingButton(onClick: () -> Unit) {
    Icon(
        imageVector = Icons.Default.Settings,
        contentDescription = "settings",
        modifier = Modifier
            .clickable(
                onClick = onClick,
                interactionSource = MutableInteractionSource(),
                indication = null
            )
            .size(30.dp)
    )
}
