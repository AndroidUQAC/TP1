import retrofit2.Call
import retrofit2.http.GET

interface GetUsersInterface {
    @GET("users")
    fun getUsers(): Call<List<UsersDataClass>>
}