import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory

class MainActivity(val baseUrl: String) {

    fun listAllUsers() {
        val retrofitClient = Retrofit
            .Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(JacksonConverterFactory.create())
            .build()

        val service = retrofitClient.create(GetUsersInterface::class.java)

        val call = service.getUsers()
        val response = call.execute()

        val users = response.body()

        users?.forEach {
            println(it)
        }
    }
}