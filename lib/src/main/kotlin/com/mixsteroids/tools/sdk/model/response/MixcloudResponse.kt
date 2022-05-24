package com.mixsteroids.tools.sdk.model.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
abstract class MixcloudBaseDTO (
    var key: String? = null,
    var url: String? = null,
    var name: String? = null,
    var type: String? = null,
    var slug: String? = null,
)

@Serializable
data class MixcloudPictureDTO(
    @SerialName("small")
    var small: String?,

    @SerialName("thumbnail")
    var thumbnail: String?,

    @SerialName("medium_mobile")
    var medium_mobile: String?,

    @SerialName("medium")
    var medium: String?,

    @SerialName("large")
    var large: String?,

    @SerialName("320wx320h")
    var `320wx320h`: String?,

    @SerialName("extra_large")
    var extra_large: String?,

    @SerialName("640wx640h")
    var `640wx640h`: String?,

    @SerialName("768wx768h")
    var `768wx768h`: String?,

    @SerialName("1024wx1024h")
    var `1024wx1024h`: String?,
)

@Serializable
data class MixcloudCoverPicturesDTO(
    @SerialName("835wx120h")
    var `835wx120h`: String?,

    @SerialName("1113wx160h")
    var `1113wx160h`: String?,

    @SerialName("1670wx240h")
    var `1670wx240h`: String?,
)

@Serializable
data class MixcloudConnectionDTO(
    var feed: String?,
    var comments: String?,
    var followers: String?,
    var favorites: String?,
    var following: String?,
    var cloudcasts: String?,
    var listens: String?,
    var listeners: String?,
    var similar: String?,
    var popular: String?,
    var latest: String?,
)

@Serializable
data class MixcloudMetadataDTO(
    var connections: MixcloudConnectionDTO?
)

@Serializable
data class MixcloudOwnerDTO(
    var key: String?,
    var url: String?,
    var name: String?,
    var username: String?,
    var pictures: MixcloudPictureDTO?,
    var type: String?,
)

@Serializable
data class MixcloudUserDTO(
    var username: String?,
    var pictures: MixcloudPictureDTO?,
    var biog: String?,
    var created_time: String?,
    var updated_time: String?,
    var follower_count: Int?,
    var following_count: Int?,
    var cloudcast_count: Int?,
    var favorite_count: Int?,
    var listen_count: Int?,
    var is_pro: Boolean?,
    var is_premium: Boolean?,
    var city: String?,
    var country: String?,
    var coverPictures: MixcloudCoverPicturesDTO?,
    var picture_primary_color: String?,
    var metadata: MixcloudMetadataDTO?,
): MixcloudBaseDTO()

@Serializable
data class MixcloudPlaylistDTO(
    var key: String?,
    var url: String?,
    var name: String?,
    var slug: String?,
    var type: String?,
    var owner: MixcloudOwnerDTO?,
)

@Serializable
data class MixcloudCloudcastDTO(
    var pictures: MixcloudPictureDTO?,
    var tags: Set<MixcloudBaseDTO>?,
    var created_time: String?,
    var updated_time: String?,
    var play_count: Int?,
    var favorite_count: Int?,
    var comment_count: Int?,
    var listener_count: Int?,
    var repost_count: Int?,
    var user: MixcloudOwnerDTO?,
    var is_exclusive: Boolean?,
    var audio_length: Int?,
    var description: String?,
    var sections: ArrayList<String>?,
): MixcloudBaseDTO()

@Serializable
data class MixcloudPagingDTO(
    var next: String?,
    var previous: String?,
)

@Serializable
data class MixcloudCommentDTO(
    var user: MixcloudOwnerDTO?,
    var submit_date: String?,
    var comment: String?,
): MixcloudBaseDTO()

@Serializable
data class MixcloudFeedDTO(
    var title: String?,
    var from: MixcloudOwnerDTO?,
    var created_time: String?,
    var cloudcasts: ArrayList<MixcloudCloudcastDTO>?,
): MixcloudBaseDTO()

@Serializable
sealed class MixcloudSearchListDTO {
    abstract val name: String?
    abstract val paging: MixcloudPagingDTO?

    @Serializable
    data class Owner(
        override val name: String? = null,
        override val paging: MixcloudPagingDTO? = null,
        val data: List<MixcloudOwnerDTO>? = emptyList(),
    ): MixcloudSearchListDTO()

    @Serializable
    data class Cloudcasts(
        override val name: String? = null,
        override val paging: MixcloudPagingDTO? = null,
        val data: List<MixcloudCloudcastDTO>? = emptyList(),
    ): MixcloudSearchListDTO()

    @Serializable
    data class Playlists(
        override val name: String? = null,
        override val paging: MixcloudPagingDTO? = null,
        val data: List<MixcloudPlaylistDTO>? = emptyList(),
    ): MixcloudSearchListDTO()

    @Serializable
    data class Followers(
        override val name: String? = null,
        override val paging: MixcloudPagingDTO? = null,
        val data: List<MixcloudOwnerDTO>? = emptyList(),
    ): MixcloudSearchListDTO()

    @Serializable
    data class Following(
        override val name: String? = null,
        override val paging: MixcloudPagingDTO? = null,
        val data: List<MixcloudOwnerDTO>? = emptyList(),
    ): MixcloudSearchListDTO()
}
