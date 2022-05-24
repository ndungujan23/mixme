package com.mixsteroids.tools.sdk.component

import com.mixsteroids.tools.sdk.model.request.MixcloudPagingRequestDTO
import com.mixsteroids.tools.sdk.model.response.MixcloudCloudcastDTO
import com.mixsteroids.tools.sdk.model.response.MixcloudUserDTO
import com.mixsteroids.tools.sdk.util.extension.endpointMixcloud
import com.mixsteroids.tools.sdk.util.extension.json
import com.mixsteroids.tools.sdk.util.extension.parameterPagingMixcloud
import com.mixsteroids.tools.sdk.util.extension.parameters
import io.ktor.client.*
import io.ktor.client.request.*

class Mixcloud(private val client: HttpClient, private val access_token: String? = null) {
    private val accessToken: String? = access_token

    /**
     * Get user from provided access token
     * @return MixcloudUserDTO
     * @see MixcloudUserDTO
     */
    suspend fun me(): MixcloudUserDTO? = client.get {
        endpointMixcloud("me")
        parameters(
            mapOf("access_token" to accessToken.orEmpty(), "metadata" to 1)
        )
    }

    /**
     * Get user by username
     * @return MixcloudUserDTO
     * @see MixcloudUserDTO
     */
    suspend fun user(username: String): MixcloudUserDTO? = client.get {
        endpointMixcloud(username)
        parameters(
            mapOf("access_token" to accessToken.orEmpty(), "metadata" to 1)
        )
    }



    /**
     * Get single show
     * @param username username of the uploader
     * @param slug the slug name of the
     * @param paging this is the offset for paging. it starts at 0.
     * @return MixcloudCloudcastDTO
     * @see MixcloudCloudcastDTO
     */
    suspend fun show(
        username: String,
        slug: String,
        paging: MixcloudPagingRequestDTO? = null
    ): MixcloudCloudcastDTO? = client.get {
        endpointMixcloud(username, slug)
        parameterPagingMixcloud(paging)
        parameters(
            mapOf("access_token" to accessToken.orEmpty(), "metadata" to 1)
        )
        json()
    }
}
