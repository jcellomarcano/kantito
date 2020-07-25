package jcellomarcano.com.kantotry.Models

class mediaModel : ArrayList<mediaModelItem>()

data class mediaModelItem(
    val description: String,
    val preview_img: String,
    val profile: userModel,
    val record_video: String
)

