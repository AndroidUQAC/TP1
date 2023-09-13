import com.fasterxml.jackson.annotation.JsonProperty

data class UsersDataClass(
    @JsonProperty("name") val name: String,
    @JsonProperty("email") val email: String,
    @JsonProperty("password") val password: String,
    @JsonProperty("_id") val id: Int
) {
    override fun toString(): String {
        return "User : ${this.id} | name : ${this.name} | email : ${this.email} | password : ${this.password}"
    }
}
