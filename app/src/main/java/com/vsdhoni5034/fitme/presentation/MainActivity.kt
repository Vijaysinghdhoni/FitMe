package com.vsdhoni5034.fitme.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.vsdhoni5034.fitme.presentation.theme.FitMeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FitMeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                }
            }
        }
    }
}


//** App flow will look something like this **//

// whenever user installs the app for the first time it will ask for user data like his goal
// means want to lose weight or gain etc and then ask users activity level and then personal info
//like weight , height , age etc then it will show user the goaled calories of a day and
// from which source to take how much calorie like protein , carbs or fats
// and then whenever user takes any meal like break fast , lunch snack etc they can add it
//and then the app will find how much calories user has eaten and how much left from his Goal
//user can also add his own recipes and may search from api and then adds it all will add in Room
//we can also give the water drunk by user and how much left to drunk

//** Home Screen will look something like this **//

// here firstly in a circular progress bar left calories will be shown
//then left calories from carbs , fat and protein
// then water reminder
// lazy column with meals taken

//** todo in this app **//

// we may use the meals db api to show the list of recipes and from that we search in other api
//learn about clean arch and use it in this app and coroutines also
//we will create a learning app in which user can track there daily calories by adding meals what user has taken user can also search anu dish from api and add it to its meals
//user can add the meals as there fav also in Room database
//make a gameyfied ui using compose and may learn canva and use it


//** weekend one **//

// * Determine core features you want in your app like :
// Add, edit, and delete recipes , Calculate and display calories for each recipe
// Design the User Flow
// Design how the app will look like
// * set up project structure using clean architecture and add dependency
// determine how you will use recipe api


//** weekend two **//

//* implement core features like : Calorie Calculation , Add/Edit and search Recipe and Recipe List & Details


//** weekend three **//

//* make ui using compose and before that learn best practises of compose