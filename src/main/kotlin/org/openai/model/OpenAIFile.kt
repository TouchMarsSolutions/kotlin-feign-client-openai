package org.openapi.openai.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.annotation.Generated
import org.openapitools.jackson.nullable.JsonNullable
import java.util.*

/**
 * OpenAIFile
 */
@Generated(
    value = ["org.openapitools.codegen.languages.SpringCodegen"],
    date = "2023-02-15T20:47:29.471771-08:00[America/Vancouver]"
)
class OpenAIFile {
    /**
     * Get id
     * @return id
     */
    @get:Schema(
        name = "id",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("id")
    var id: String? = null

    /**
     * Get _object
     * @return _object
     */
    @get:Schema(
        name = "object",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("object")
    var `object`: String? = null

    /**
     * Get bytes
     * @return bytes
     */
    @get:Schema(
        name = "bytes",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("bytes")
    var bytes: Int? = null

    /**
     * Get createdAt
     * @return createdAt
     */
    @get:Schema(
        name = "created_at",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("created_at")
    var createdAt: Int? = null

    /**
     * Get filename
     * @return filename
     */
    @get:Schema(
        name = "filename",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("filename")
    var filename: String? = null

    /**
     * Get purpose
     * @return purpose
     */
    @get:Schema(
        name = "purpose",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("purpose")
    var purpose: String? = null

    /**
     * Get status
     * @return status
     */
    @get:Schema(
        name = "status",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("status")
    var status: String? = null

    /**
     * Get statusDetails
     * @return statusDetails
     */
    @get:Schema(
        name = "status_details",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("status_details")
    var statusDetails = JsonNullable.undefined<Any>()
    fun id(id: String?): OpenAIFile {
        this.id = id
        return this
    }

    fun _object(_object: String?): OpenAIFile {
        `object` = _object
        return this
    }

    fun bytes(bytes: Int?): OpenAIFile {
        this.bytes = bytes
        return this
    }

    fun createdAt(createdAt: Int?): OpenAIFile {
        this.createdAt = createdAt
        return this
    }

    fun filename(filename: String?): OpenAIFile {
        this.filename = filename
        return this
    }

    fun purpose(purpose: String?): OpenAIFile {
        this.purpose = purpose
        return this
    }

    fun status(status: String?): OpenAIFile {
        this.status = status
        return this
    }

    fun statusDetails(statusDetails: Any): OpenAIFile {
        this.statusDetails = JsonNullable.of(statusDetails)
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val openAIFile = other as OpenAIFile
        return id == openAIFile.id && `object` == openAIFile.`object` && bytes == openAIFile.bytes && createdAt == openAIFile.createdAt && filename == openAIFile.filename && purpose == openAIFile.purpose && status == openAIFile.status &&
                equalsNullable(statusDetails, openAIFile.statusDetails)
    }

    override fun hashCode(): Int {
        return Objects.hash(id, `object`, bytes, createdAt, filename, purpose, status, hashCodeNullable(statusDetails))
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class OpenAIFile {\n")
        sb.append("    id: ").append(toIndentedString(id)).append("\n")
        sb.append("    _object: ").append(toIndentedString(`object`)).append("\n")
        sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n")
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n")
        sb.append("    filename: ").append(toIndentedString(filename)).append("\n")
        sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n")
        sb.append("    status: ").append(toIndentedString(status)).append("\n")
        sb.append("    statusDetails: ").append(toIndentedString(statusDetails)).append("\n")
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