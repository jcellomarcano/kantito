package jcellomarcano.com.kantotry.Models

class userModel : ArrayList<ProfileItem>()

data class ProfileItem(
    val img: String,
    val name: String,
    val user_name: String
)