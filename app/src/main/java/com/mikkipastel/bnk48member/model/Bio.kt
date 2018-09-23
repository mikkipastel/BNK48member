package com.mikkipastel.bnk48member.model

import com.google.gson.annotations.SerializedName

data class Bio(@SerializedName("food_allergies") val foodAllergies: FoodAllergies,
               @SerializedName("dislike_foods") val dislikeFoods: dislikeFoods,
               @SerializedName("favourite_games") val favouriteGames: FavouriteGames,
               val likes: Likes,
               val dislikes: Dislikes,
               val hobbies: Hobbies,
               @SerializedName("favourite_school_subjects") val favouriteSchoolSubjects: FavouriteSchoolSubjects,
               @SerializedName("dislike_school_subjects") val dislikeSchoolSubjects: DislikeSchoolSubjects)
