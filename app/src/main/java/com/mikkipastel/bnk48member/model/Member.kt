package com.mikkipastel.bnk48member.model

import com.google.gson.annotations.SerializedName

data class Member(val id: Int,
                  val slug: String,
                  @SerializedName("first_name") val firstName: FirstName,
                  @SerializedName("last_name") val lastName: LastName,
                  val nickname: Nickname,
                  val generation: Int,
                  @SerializedName("birth_date") val birthDate: Long,
                  val height: Int,
                  val province: String,
                  val bio: Bio,
                  @SerializedName("blood_group") val bloodGroup: Int,
                  val instagram: String,
                  @SerializedName("avatar_image") val avatarImage: String,
                  @SerializedName("profile_image") val profileImage: String,
                  @SerializedName("avatar_image_2x") val avatarImage2x: String,
                  @SerializedName("profile_image_2x") val profileImage2x: String )