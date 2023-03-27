/**
 * Kinde Management API
 *
 * Provides endpoints to manage your Kinde Businesses
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: support@kinde.com
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package au.kinde.sdk.api.model


import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param id 
 * @param providedId 
 * @param name 
 * @param givenName 
 * @param familyName 
 * @param updatedAt 
 */

data class UserProfileV2 (

    @SerializedName("id")
    val id: kotlin.String? = null,

    @SerializedName("provided_id")
    val providedId: kotlin.String? = null,

    @SerializedName("name")
    val name: kotlin.String? = null,

    @SerializedName("given_name")
    val givenName: kotlin.String? = null,

    @SerializedName("family_name")
    val familyName: kotlin.String? = null,

    @SerializedName("updated_at")
    val updatedAt: kotlin.String? = null

)
