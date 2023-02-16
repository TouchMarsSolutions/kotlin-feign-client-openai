package org.openapi.openai.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonTypeName
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.annotation.Generated
import java.util.*

/**
 * ImagesResponseDataInner
 */
@JsonTypeName("ImagesResponse_data_inner")
@Generated(
    value = ["org.openapitools.codegen.languages.SpringCodegen"],
    date = "2023-02-15T20:47:29.471771-08:00[America/Vancouver]"
)
class ImagesResponseDataInner {
    /**
     * Get url
     * @return url
     */
    @get:Schema(
        name = "url",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("url")
    var url: String? = null

    /**
     * Get b64Json
     * @return b64Json
     */
    @get:Schema(
        name = "b64_json",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("b64_json")
    var b64Json: String? = null
    fun url(url: String?): ImagesResponseDataInner {
        this.url = url
        return this
    }

    fun b64Json(b64Json: String?): ImagesResponseDataInner {
        this.b64Json = b64Json
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val imagesResponseDataInner = other as ImagesResponseDataInner
        return url == imagesResponseDataInner.url && b64Json == imagesResponseDataInner.b64Json
    }

    override fun hashCode(): Int {
        return Objects.hash(url, b64Json)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class ImagesResponseDataInner {\n")
        sb.append("    url: ").append(toIndentedString(url)).append("\n")
        sb.append("    b64Json: ").append(toIndentedString(b64Json)).append("\n")
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