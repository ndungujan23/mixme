package com.mixsteroids.tools.sdk.model.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HearthisCategoryDTO(
    @SerialName("id")
    var id: String?,

    @SerialName("name")
    var name: String?,

    @SerialName("url")
    var url: String?,

    @SerialName("api_url")
    var api_url: String?,
)

@Serializable
data class HearthisPlaylistDTO(
    @SerialName("id")
    var id: String?,

    @SerialName("user_id")
    var user_id: String?,

    @SerialName("permalink")
    var permalink: String?,

    @SerialName("title")
    var title: String?,

    @SerialName("description")
    var description: String?,

    @SerialName("privat")
    var privat: String?,

    @SerialName("uri")
    var uri: String?,

    @SerialName("permalink_url")
    var permalink_url: String?,

    @SerialName("thumb")
    var thumb: String?,

    @SerialName("artwork_url")
    var artwork_url: String?,

    @SerialName("track_count")
    var track_count: Int?,

    @SerialName("user")
    var user: HearthisUserDTO?,
)

@Serializable
data class HearthisUserDTO(
    @SerialName("id")
    var id: String?,

    @SerialName("permalink")
    var permalink: String?,

    @SerialName("username")
    var username: String?,

    @SerialName("caption")
    var caption: String?,

    @SerialName("uri")
    var uri: String?,

    @SerialName("permalink_url")
    var permalink_url: String?,

    @SerialName("thumb_url")
    var thumb_url: String?,

    @SerialName("avatar_url")
    var avatar_url: String?,

    @SerialName("720p_url")
    var `720p_url`: String?,

    @SerialName("background_url")
    var background_url: String?,

    @SerialName("description")
    var description: String?,

    @SerialName("geo")
    var geo: String?,

    @SerialName("track_count")
    var track_count: String?,

    @SerialName("playlist_count")
    var playlist_count: String?,

    @SerialName("likes_count")
    var likes_count: String?,

    @SerialName("followers_count")
    var followers_count: String?,

    @SerialName("following_count")
    var following_count: String?,

    @SerialName("following")
    var following: Boolean?,

    @SerialName("premium")
    var premium: Boolean?,

    @SerialName("allow_push")
    var allow_push: Int?,
)

@Serializable
data class HearthisTrackDTO(
    @SerialName("id")
    var id: String?,

    @SerialName("private")
    var private: String?,

    @SerialName("created_at")
    var created_at: String?,

    @SerialName("release_date")
    var release_date: String?,

    @SerialName("release_timestamp")
    var release_timestamp: String?,

    @SerialName("user_id")
    var user_id: String?,

    @SerialName("duration")
    var duration: String?,

    @SerialName("permalink")
    var permalink: String?,

    @SerialName("description")
    var description: String?,

    @SerialName("geo")
    var geo: String?,

    @SerialName("tags")
    var tags: String?,

    @SerialName("taged_artists")
    var taged_artists: String?,

    @SerialName("bpm")
    var bpm: String?,

    @SerialName("key")
    var key: String?,

    @SerialName("license")
    var license: String?,

    @SerialName("version")
    var version: String?,

    @SerialName("type")
    var type: String?,

    @SerialName("downloadable")
    var downloadable: String?,

    @SerialName("genre")
    var genre: String?,

    @SerialName("genre_slush")
    var genre_slush: String?,

    @SerialName("title")
    var title: String?,

    @SerialName("uri")
    var uri: String?,

    @SerialName("permalink_url")
    var permalink_url: String?,

    @SerialName("thumb")
    var thumb: String?,

    @SerialName("artwork_url")
    var artwork_url: String?,

    @SerialName("artwork_url_retina")
    var artwork_url_retina: String?,

    @SerialName("background_url")
    var background_url: String?,

    @SerialName("waveform_data")
    var waveform_data: String?,

    @SerialName("waveform_url")
    var waveform_url: String?,

    @SerialName("user")
    var user: HearthisUserDTO?,

    @SerialName("stream_url")
    var stream_url: String?,

    @SerialName("preview_url")
    var preview_url: String?,

    @SerialName("download_url")
    var download_url: String?,

    @SerialName("download_filename")
    var download_filename: String?,

    @SerialName("playback_count")
    var playback_count: String?,

    @SerialName("download_count")
    var download_count: String?,

    @SerialName("favoritings_count")
    var favoritings_count: String?,

    @SerialName("reshares_count")
    var reshares_count: String?,

    @SerialName("comment_count")
    var comment_count: String?,

    @SerialName("played")
    var played: Boolean?,

    @SerialName("favorited")
    var favorited: Boolean?,

    @SerialName("liked")
    var liked: Boolean?,

    @SerialName("reshared")
    var reshared: Boolean?,
)

@Serializable
data class HearthisCategoryTrackUserDTO(

    @SerialName("id") var id: String? = null,
    @SerialName("permalink") var permalink: String? = null,
    @SerialName("username") var username: String? = null,
    @SerialName("caption") var caption: String? = null,
    @SerialName("uri") var uri: String? = null,
    @SerialName("permalink_url") var permalinkUrl: String? = null,
    @SerialName("avatar_url") var avatarUrl: String? = null

)

@Serializable
data class HearthisCategoryTrackDTO(

    @SerialName("id") var id: String? = null,
    @SerialName("private") var private: String? = null,
    @SerialName("created_at") var createdAt: String? = null,
    @SerialName("release_date") var releaseDate: String? = null,
    @SerialName("release_timestamp") var releaseTimestamp: Int? = null,
    @SerialName("user_id") var userId: String? = null,
    @SerialName("duration") var duration: String? = null,
    @SerialName("permalink") var permalink: String? = null,
    @SerialName("description") var description: String? = null,
    @SerialName("geo") var geo: String? = null,
    @SerialName("tags") var tags: String? = null,
    @SerialName("taged_artists") var tagedArtists: String? = null,
    @SerialName("bpm") var bpm: String? = null,
    @SerialName("key") var key: String? = null,
    @SerialName("license") var license: String? = null,
    @SerialName("version") var version: String? = null,
    @SerialName("type") var type: String? = null,
    @SerialName("downloadable") var downloadable: String? = null,
    @SerialName("genre") var genre: String? = null,
    @SerialName("genre_slush") var genreSlush: String? = null,
    @SerialName("title") var title: String? = null,
    @SerialName("uri") var uri: String? = null,
    @SerialName("permalink_url") var permalinkUrl: String? = null,
    @SerialName("thumb") var thumb: String? = null,
    @SerialName("artwork_url") var artworkUrl: String? = null,
    @SerialName("artwork_url_retina") var artworkUrlRetina: String? = null,
    @SerialName("background_url") var backgroundUrl: String? = null,
    @SerialName("waveform_data") var waveformData: String? = null,
    @SerialName("waveform_url") var waveformUrl: String? = null,
    @SerialName("user") var user: HearthisCategoryTrackUserDTO? = null,
    @SerialName("stream_url") var streamUrl: String? = null,
    @SerialName("preview_url") var previewUrl: String? = null,
    @SerialName("download_url") var downloadUrl: String? = null,
    @SerialName("download_filename") var downloadFilename: String? = null,
    @SerialName("playback_count") var playbackCount: String? = null,
    @SerialName("download_count") var downloadCount: String? = null,
    @SerialName("favoritings_count") var favoritingsCount: String? = null,
    @SerialName("reshares_count") var resharesCount: String? = null,
    @SerialName("comment_count") var commentCount: String? = null,
    @SerialName("played") var played: Boolean? = null,
    @SerialName("favorited") var favorited: Boolean? = null,
    @SerialName("liked") var liked: Boolean? = null,
    @SerialName("reshared") var reshared: Boolean? = null,
    @SerialName("fan_exclusive_play") var fanExclusivePlay: Int? = null,
    @SerialName("fan_exclusive_download") var fanExclusiveDownload: Int? = null

)

class HearthisTrackList : ArrayList<HearthisTrackDTO>()
class HearthisUserList : ArrayList<HearthisUserDTO>()
class HearthisCategoryList : ArrayList<HearthisCategoryDTO>()
class  HearthisCategoryTrackList : ArrayList<HearthisCategoryTrackDTO>()
class HearthisPlaylistList : ArrayList<HearthisPlaylistDTO>()
