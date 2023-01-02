package com.example.finalandroidproject

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val beerNames = beerAPI.retrofitService.getDrinks()

        // initialize an array of beer names
        beerNames.enqueue(object : Callback<List<Drinks>> {
            override fun onResponse(call: Call<List<Drinks>>, response: Response<List<Drinks>>) {
                response.body()?.forEach { Log.d("name:", it.toString()) }
            }


            override fun onFailure(call: Call<List<Drinks>>, t: Throwable) {
                Log.i(MainActivity::class.simpleName, "on FAILURE!!!!")
            }

        })
        //println(beerNames)
        // find the list view on the layout and set the adapter for it
        //val listView = findViewById<ListView>(R.id.listView)
        //listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, beerNames)
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