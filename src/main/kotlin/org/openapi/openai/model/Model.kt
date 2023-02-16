package org.openapi.openai.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.annotation.Generated
import java.util.*

/**
 * Model
 */
@Generated(
    value = ["org.openapitools.codegen.languages.SpringCodegen"],
    date = "2023-02-15T20:47:29.471771-08:00[America/Vancouver]"
)
class Model {
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
     * Get created
     * @return created
     */
    @get:Schema(
        name = "created",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("created")
    var created: Int? = null

    /**
     * Get ownedBy
     * @return ownedBy
     */
    @get:Schema(
        name = "owned_by",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("owned_by")
    var ownedBy: String? = null
    fun id(id: String?): Model {
        this.id = id
        return this
    }

    fun _object(_object: String?): Model {
        `object` = _object
        return this
    }

    fun created(created: Int?): Model {
        this.created = created
        return this
    }

    fun ownedBy(ownedBy: String?): Model {
        this.ownedBy = ownedBy
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val model = other as Model
        return id == model.id && `object` == model.`object` && created == model.created && ownedBy == model.ownedBy
    }

    override fun hashCode(): Int {
        return Objects.hash(id, `object`, created, ownedBy)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class Model {\n")
        sb.append("    id: ").append(toIndentedString(id)).append("\n")
        sb.append("    _object: ").append(toIndentedString(`object`)).append("\n")
        sb.append("    created: ").append(toIndentedString(created)).append("\n")
        sb.append("    ownedBy: ").append(toIndentedString(ownedBy)).append("\n")
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