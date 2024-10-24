package hu.klm60o.spiritrally.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import hu.klm60o.spiritrally.assets.QrCode
import hu.klm60o.spiritrally.data.UserViewModel
import hu.klm60o.spiritrally.screens.ui.theme.SpiritRallyTheme

@Composable
fun NewsScreenComposable(navController: NavController, viewModel: UserViewModel) {
    val navController = navController
    val viewModel = viewModel
    Scaffold(
        bottomBar = { MyBottomAppbarComposable(navController) }
    ) {
        innerPadding ->
        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .padding(innerPadding)
        ) {
            Text("Ez itt a hírek képernyő")
        }

    }
    /*Surface {
        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxHeight()
                .padding(20.dp)) {
            Text(text = "Ez itt a hírek képernyő", fontSize = 25.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp, 20.dp, 0.dp, 0.dp),
                textAlign = TextAlign.Center
            )
        }
        MyBottomAppbarComposable()
    }*/
}

@Preview(showBackground = true)
@Composable
fun NewsPreview() {
    hu.klm60o.spiritrally.ui.theme.ui.theme.SpiritRallyTheme {
        NewsScreenComposable(
            navController = rememberNavController(),
            viewModel =  UserViewModel()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun NewsPreviewDark() {
    hu.klm60o.spiritrally.ui.theme.SpiritRallyTheme(darkTheme = true) {
        NewsScreenComposable(
            navController = rememberNavController(),
            viewModel =  UserViewModel()
        )
    }
}

