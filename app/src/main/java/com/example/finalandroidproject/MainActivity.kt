package com.example.finalandroidproject

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initialize an array of beer names
        val beerNames = arrayOf("Pale Ale", "IPA", "Stout", "Lager", "Pilsner")

        // find the list view on the layout and set the adapter for it
        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, beerNames)
    }
}

/*
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FinalAndroidProjectTheme {
        Greeting("Android")
    }
}*/