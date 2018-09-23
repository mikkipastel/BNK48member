package com.mikkipastel.bnk48member.model

import com.google.gson.annotations.SerializedName

data class Bio(@SerializedName("food_allergies") val foodAllergies: foodAllergies,
               @SerializedName("dislike_foods") val dislikeFoods: dislikeFoods,
               @SerializedName("favourite_games") val favouriteGames: favouriteGames,
               val likes: likes,
               val dislikes: dislikes,
               val hobbies: hobbies,
               @SerializedName("favourite_school_subjects") val favouriteSchoolSubjects: favouriteSchoolSubjects,
               @SerializedName("dislike_school_subjects") val dislikeSchoolSubjects: dislikeSchoolSubjects)
