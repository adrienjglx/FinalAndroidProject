package com.example.finalandroidproject
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl("https://api.openbrewerydb.org/breweries/")
    .build()

// Déclarez une interface pour décrire les appels de l'API
interface beerAPIInterface {
    @GET("/")
    fun getDrinks(): Call<List<Drinks>>
}


object beerAPI {
    val retrofitService: beerAPIInterface by lazy {
        retrofit.create(beerAPIInterface::class.java)
    }
}
// Créez une instance de Retrofit en spécifiant l'URL de base de l'API


/* Créez une instance de l'interface définie ci-dessus en utilisant Retrofit
val api = retrofit.create(beerAPIInterface::class.java)
val repo = api.getDrinks()

*/

