package utils.views

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.AppBarDefaults
import androidx.compose.material.DropdownMenu
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Money
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import model.MenuItem
import theme.ColorPrimary

@Composable
fun Toolbar(
    backgroundColor: Color = ColorPrimary,
    elevation: Dp = AppBarDefaults.TopAppBarElevation,
    title: String,
    navigationIcon: ImageVector? = null,
    navigation: () -> Unit = {},
    leftIcon: ImageVector? = null,
    onLeftIconPressed: () -> Unit = {},
    contentColor: Color = Color.White,
    dropDownMenu: Boolean = false,
    dropDownIcon: ImageVector? = null,
    dropDownItems: List<MenuItem> = listOf()
) {
    TopAppBar(
        backgroundColor = backgroundColor,
        elevation = elevation,
        contentPadding = PaddingValues(
            start = 0.dp,
            end = 0.dp
        )
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            navigationIcon?.let {
                Icon(
                    imageVector = navigationIcon,
                    contentDescription = null,
                    modifier = Modifier
                        .padding(8.dp)
                        .size(40.dp)
                        .clickable { navigation() }
                        .padding(8.dp),
                    tint = contentColor
                )
            }
            Text(
                text = title,
                modifier = Modifier.weight(1.0f).padding(
                    horizontal = if (navigationIcon != null) {
                        8.dp
                    } else {
                        16.dp
                    }
                ),
                style = TextStyle(
                    color = contentColor,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp
                )
            )
            leftIcon?.let {
                Icon(
                    imageVector = leftIcon,
                    contentDescription = null,
                    modifier = Modifier
                        .padding(8.dp)
                        .size(40.dp)
                        .clickable { onLeftIconPressed() }
                        .padding(8.dp),
                    tint = contentColor
                )
            }
            if (dropDownMenu) {
                var expanded by remember { mutableStateOf(false) }
                Column {
                    Icon(
                        imageVector = dropDownIcon ?: Icons.Filled.MoreVert,
                        contentDescription = null,
                        modifier = Modifier
                            .padding(8.dp)
                            .size(40.dp)
                            .clickable { expanded = true }
                            .padding(8.dp),
                        tint = contentColor
                    )
                    DropdownMenu(
                        expanded = expanded,
                        onDismissRequest = {
                            expanded = false
                        }
                    ) {
                        dropDownItems.forEach {
                            DropdownMenuItem(
                                it.icon,
                                it.name,
                                onItemClicked = {
                                    expanded = false
                                    it.onItemClicked()
                                }

                            )
                        }
                    }
                }
            }
        }
    }
}