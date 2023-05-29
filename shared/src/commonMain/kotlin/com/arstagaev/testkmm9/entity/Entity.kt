package com.arstagaev.testkmm9.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RocketLaunch(
    @SerialName("flight_number")
    val flightNumber: Int,
    @SerialName("name")
    val missionName: String? = null,
    @SerialName("date_utc")
    val launchDateUTC: String? = null,
    @SerialName("details")
    val details: String? = null,
    @SerialName("success")
    val launchSuccess: Long? = null,
    @SerialName("links")
    val links: Links? = null
)

@Serializable
data class Links(
    @SerialName("patch")
    val patch: Patch?,
    @SerialName("article")
    val article: String?
)

@Serializable
data class Patch(
    @SerialName("small")
    val small: String?,
    @SerialName("large")
    val large: String?
)