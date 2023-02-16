package org.openapi.openai.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.annotation.Generated
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import org.openapitools.jackson.nullable.JsonNullable
import java.util.*

/**
 * CreateImageRequest
 */
@Generated(
    value = ["org.openapitools.codegen.languages.SpringCodegen"],
    date = "2023-02-15T20:47:29.471771-08:00[America/Vancouver]"
)
class CreateImageRequest {
    /**
     * A text description of the desired image(s). The maximum length is 1000 characters.
     * @return prompt
     */
    @get:Schema(
        name = "prompt",
        example = "A cute baby sea otter",
        description = "A text description of the desired image(s). The maximum length is 1000 characters.",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("prompt")
    var prompt: String? = null

    @JsonProperty("n")
    private var n = JsonNullable.undefined<Int>()

    /**
     * The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
     */
    enum class SizeEnum(@get:JsonValue val value: String) {
        _256X256("256x256"), _512X512("512x512"), _1024X1024("1024x1024");

        override fun toString(): String {
            return value
        }

        companion object {
            @JsonCreator
            fun fromValue(value: String): SizeEnum? {
                for (b in values()) {
                    if (b.value == value) {
                        return b
                    }
                }
                return null
            }
        }
    }

    /**
     * The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
     * @return size
     */
    @get:Schema(
        name = "size",
        example = "1024x1024",
        description = "The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("size")
    var size = JsonNullable.undefined<SizeEnum>()

    /**
     * The format in which the generated images are returned. Must be one of `url` or `b64_json`.
     */
    enum class ResponseFormatEnum(@get:JsonValue val value: String) {
        URL("url"), B64_JSON("b64_json");

        override fun toString(): String {
            return value
        }

        companion object {
            @JsonCreator
            fun fromValue(value: String): ResponseFormatEnum? {
                for (b in values()) {
                    if (b.value == value) {
                        return b
                    }
                }
                return null
            }
        }
    }

    /**
     * The format in which the generated images are returned. Must be one of `url` or `b64_json`.
     * @return responseFormat
     */
    @get:Schema(
        name = "response_format",
        example = "url",
        description = "The format in which the generated images are returned. Must be one of `url` or `b64_json`.",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("response_format")
    var responseFormat = JsonNullable.undefined<ResponseFormatEnum>()

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
    fun prompt(prompt: String?): CreateImageRequest {
        this.prompt = prompt
        return this
    }

    fun n(n: Int): CreateImageRequest {
        this.n = JsonNullable.of(n)
        return this
    }

    /**
     * The number of images to generate. Must be between 1 and 10.
     * minimum: 1
     * maximum: 10
     * @return n
     */
    @Schema(
        name = "n",
        example = "1",
        description = "The number of images to generate. Must be between 1 and 10.",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    fun getN(): @Min(1) @Max(10) JsonNullable<Int>? {
        return n
    }

    fun setN(n: JsonNullable<Int>) {
        this.n = n
    }

    fun size(size: SizeEnum): CreateImageRequest {
        this.size = JsonNullable.of(size)
        return this
    }

    fun responseFormat(responseFormat: ResponseFormatEnum): CreateImageRequest {
        this.responseFormat = JsonNullable.of(responseFormat)
        return this
    }

    fun user(user: String?): CreateImageRequest {
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
        val createImageRequest = other as CreateImageRequest
        return prompt == createImageRequest.prompt &&
                equalsNullable(n, createImageRequest.n) &&
                equalsNullable(size, createImageRequest.size) &&
                equalsNullable(responseFormat, createImageRequest.responseFormat) && user == createImageRequest.user
    }

    override fun hashCode(): Int {
        return Objects.hash(prompt, hashCodeNullable(n), hashCodeNullable(size), hashCodeNullable(responseFormat), user)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class CreateImageRequest {\n")
        sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n")
        sb.append("    n: ").append(toIndentedString(n)).append("\n")
        sb.append("    size: ").append(toIndentedString(size)).append("\n")
        sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n")
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

    companion object {
        private fun <T> equalsNullable(a: JsonNullable<T>?, b: JsonNullable<T>?): Boolean {
            return a === b || a != null && b != null && a.isPresent && b.isPresent && Objects.deepEquals(
                a.get(),
                b.get()
            )
        }

        private fun <T : Any> hashCodeNullable(a: JsonNullable<T>?): Int {
            if (a == null) {
                return 1
            }
            return if (a.isPresent) arrayOf<Any>(a.get()).contentDeepHashCode() else 31
        }
    }
}