package com.example.finalandroidproject
import retrofit2.Retrofit
import retrofit2.http.GET

// Déclarez une interface pour décrire les appels de l'API
interface beerAPIInterface {
    @GET("/")
    fun getDrinks(): List<Drinks>

    class Drinks// Constructeur principal
        (var name: String) {
    }

}

// Créez une instance de Retrofit en spécifiant l'URL de base de l'API
val retrofit = Retrofit.Builder()
    .baseUrl("https://api.openbrewerydb.org/breweries")
    .build()

// Créez une instance de l'interface définie ci-dessus en utilisant Retrofit
val api = retrofit.create(beerAPIInterface::class.java)
val repo = api.getDrinks()

// Appelez l'API en utilisant le code suivant :
fun loadUsers(): List<beerAPIInterface.Drinks> {
    return api.getDrinks()
}
