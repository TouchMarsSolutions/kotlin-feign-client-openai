package org.openapi.openai.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.annotation.Generated
import java.util.*

/**
 * CreateEmbeddingRequest
 */
@Generated(
    value = ["org.openapitools.codegen.languages.SpringCodegen"],
    date = "2023-02-15T20:47:29.471771-08:00[America/Vancouver]"
)
class CreateEmbeddingRequest {
    /**
     * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them.
     * @return model
     */
    @get:Schema(
        name = "model",
        description = "ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them.",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("model")
    var model: String? = null

    /**
     * Get input
     * @return input
     */
    @get:Schema(
        name = "input",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("input")
    var input: CreateEmbeddingRequestInput? = null

    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).
     * @return user
     */
    @get:Schema(
        name = "user",
        example = "user-1234",
        description = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("user")
    var user: String? = null
    fun model(model: String?): CreateEmbeddingRequest {
        this.model = model
        return this
    }

    fun input(input: CreateEmbeddingRequestInput?): CreateEmbeddingRequest {
        this.input = input
        return this
    }

    fun user(user: String?): CreateEmbeddingRequest {
        this.user = user
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val createEmbeddingRequest = other as CreateEmbeddingRequest
        return model == createEmbeddingRequest.model && input == createEmbeddingRequest.input && user == createEmbeddingRequest.user
    }

    override fun hashCode(): Int {
        return Objects.hash(model, input, user)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class CreateEmbeddingRequest {\n")
        sb.append("    model: ").append(toIndentedString(model)).append("\n")
        sb.append("    input: ").append(toIndentedString(input)).append("\n")
        sb.append("    user: ").append(toIndentedString(user)).append("\n")
        sb.append("}")
        return sb.toString()
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private fun toIndentedString(o: Any?): String {
        return o?.toString()?.replace("\n", "\n    ") ?: "null"
    }
}