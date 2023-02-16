package org.openapi.openai.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.annotation.Generated
import java.util.*

/**
 * DeleteFileResponse
 */
@Generated(
    value = ["org.openapitools.codegen.languages.SpringCodegen"],
    date = "2023-02-15T20:47:29.471771-08:00[America/Vancouver]"
)
class DeleteFileResponse {
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
     * Get deleted
     * @return deleted
     */
    @get:Schema(
        name = "deleted",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("deleted")
    var deleted: Boolean? = null
    fun id(id: String?): DeleteFileResponse {
        this.id = id
        return this
    }

    fun _object(_object: String?): DeleteFileResponse {
        `object` = _object
        return this
    }

    fun deleted(deleted: Boolean?): DeleteFileResponse {
        this.deleted = deleted
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val deleteFileResponse = other as DeleteFileResponse
        return id == deleteFileResponse.id && `object` == deleteFileResponse.`object` && deleted == deleteFileResponse.deleted
    }

    override fun hashCode(): Int {
        return Objects.hash(id, `object`, deleted)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class DeleteFileResponse {\n")
        sb.append("    id: ").append(toIndentedString(id)).append("\n")
        sb.append("    _object: ").append(toIndentedString(`object`)).append("\n")
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n")
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