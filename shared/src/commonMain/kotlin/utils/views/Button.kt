package utils.views

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import theme.ColorPrimary
import theme.spacing_1
import theme.spacing_2
import theme.spacing_7
import theme.view_6

@Composable
fun PrimaryButton(
    modifier: Modifier = Modifier,
    iconVector: ImageVector? = null,
    iconPainter: Painter? = null,
    buttonText: String,
    onClick: () -> Unit = {},
    enabled: Boolean = true,
    backgroundColor: Color = ColorPrimary,
    fontColor: Color = Color.White,
) {
    Button(
        onClick = onClick,
        enabled = enabled,
        modifier = modifier
            .fillMaxWidth(),
        shape = MaterialTheme.shapes.medium,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = backgroundColor,
            contentColor = fontColor
        )
    ) {
        PrimaryButtonContent(
            iconVector = iconVector,
            iconPainter = iconPainter,
            buttonText = buttonText,
            fontColor = fontColor
        )
    }
}

@Composable
fun PrimaryButtonContent(
    iconVector: ImageVector?,
    iconPainter: Painter?,
    buttonText: String,
    fontColor: Color = Color.White
) {
    Row(
        modifier = Modifier
            .padding(vertical = spacing_2)
            .fillMaxWidth()
    ) {
        if (iconVector != null) {
            Icon(
                imageVector = iconVector,
                modifier = Modifier
                    .padding(start = spacing_1)
                    .size(view_6),
                contentDescription = "button_icon",
                tint = fontColor
            )
        }
        if (iconPainter != null) {
            Icon(
                painter = iconPainter,
                modifier = Modifier
                    .padding(start = spacing_1)
                    .size(view_6),
                contentDescription = "button_icon",
                tint = fontColor
            )
        }
        Text(
            text = buttonText.uppercase(),
            color = fontColor,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.body1,
            fontWeight = FontWeight.Medium,
            overflow = TextOverflow.Ellipsis,
            maxLines = 1,
            modifier = Modifier
                .weight(1f)
                .padding(
                    start = spacing_1,
                    end = if (iconVector != null || iconPainter != null) {
                        spacing_7
                    } else {
                        spacing_1
                    }
                )
        )
    }
}