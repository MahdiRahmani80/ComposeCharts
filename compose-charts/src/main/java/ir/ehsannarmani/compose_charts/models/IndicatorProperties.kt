package ir.ehsannarmani.compose_charts.models

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

data class IndicatorProperties(
    val enabled:Boolean = true,
    val textStyle: TextStyle = TextStyle.Default.copy(fontSize = 12.sp),
    val count: Int = 4,
    val contentBuilder: (Double) -> String = {
        "%.1f".format(it)
    },
)
