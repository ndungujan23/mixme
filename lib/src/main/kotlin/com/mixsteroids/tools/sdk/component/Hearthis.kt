package com.mixsteroids.tools.sdk.component

import com.mixsteroids.tools.sdk.model.response.*
import com.mixsteroids.tools.sdk.util.extension.endpointHearthis
import com.mixsteroids.tools.sdk.util.extension.parameters
import io.ktor.client.*
import io.ktor.client.request.*

class Hearthis(private val client: HttpClient) {

    /**
     * Search for a track
     * @param t search string
     * @param page page
     * @param count number of items
     * @return HearthisTrackList
     * @see HearthisTrackList
     */
    suspend fun searchTrack(t: String, page: Int? = 1, count: Int? = 10): HearthisTrackList? = client.get {
        endpointHearthis("search")
        parameters(
            mapOf(
                "t" to t,
                "page" to page.toString(),
                "count" to count.toString(),
                "type" to "tracks",
            )
        )
    }

    /**
     * Search for a playlist
     * @param t search string
     * @param page page
     * @param count number of items
     * @return HearthisPlaylistList
     * @see HearthisPlaylistList
     */
    suspend fun searchPlaylist(t: String, page: Int? = 1, count: Int? = 10): HearthisPlaylistList? = client.get {
        endpointHearthis("search")
        parameters(
            mapOf(
                "t" to t,
                "page" to page.toString(),
                "count" to count.toString(),
                "type" to "playlists",
            )
        )
    }

    /**
     * Search for a user
     * @param t search string
     * @param page page
     * @param count number of items
     * @return HearthisUserList
     * @see HearthisUserList
     */
    suspend fun searchUser(t: String, page: Int? = 1, count: Int? = 10): HearthisUserList? = client.get {
        endpointHearthis("search")
        parameters(
            mapOf(
                "t" to t,
                "page" to page.toString(),
                "count" to count.toString(),
                "type" to "user",
            )
        )
    }

    /**
     * gets all available genres/categories
     * @return HearthisCategoryList
     * @see HearthisCategoryList
     */
    suspend fun getCategories(): HearthisCategoryList? = client.get {
        endpointHearthis("categories")
    }

    /**
     * gets all genre tracks
     * @param category category name
     * @param page page
     * @param count number of items
     * @return HearthisCategoryTrackList
     * @see HearthisCategoryTrackList
     */
//    suspend fun getCategoryTracks(category: String, page: Int? = 1, count: Int? = 10): HearthisCategoryTrackList? = client.get {
//        endpointHearthis("categories", category)
//        parameters(
//            mapOf(
//                "page" to page.toString(),
//                "count" to count.toString(),
//            )
//        )
//    }

    /**
     * gets a single artist/user
     * @param username name of the artist
     * @return HearthisUserDTO
     * @see HearthisUserDTO
     */
    suspend fun getUser(username: String): HearthisUserDTO? = client.get {
        endpointHearthis(username)
    }

    /**
     * gets a single track information
     * @param username name of artist
     * @param track_name name of track
     * @return HearthisTrackDTO
     * @see HearthisTrackDTO
     */
    suspend fun getTrack(username: String, track_name: String): HearthisTrackDTO? = client.get {
        endpointHearthis(username, track_name)
    }
}
