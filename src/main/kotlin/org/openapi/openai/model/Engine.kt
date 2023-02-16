package org.openapi.openai.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.annotation.Generated
import jakarta.validation.constraints.NotNull
import org.openapitools.jackson.nullable.JsonNullable
import java.util.*

/**
 * Engine
 */
@Generated(
    value = ["org.openapitools.codegen.languages.SpringCodegen"],
    date = "2023-02-15T20:47:29.471771-08:00[America/Vancouver]"
)
class Engine {
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

    @JsonProperty("created")
    private var created = JsonNullable.undefined<Int>()

    /**
     * Get ready
     * @return ready
     */
    @get:Schema(
        name = "ready",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("ready")
    var ready: Boolean? = null
    fun id(id: String?): Engine {
        this.id = id
        return this
    }

    fun _object(_object: String?): Engine {
        `object` = _object
        return this
    }

    fun created(created: Int): Engine {
        this.created = JsonNullable.of(created)
        return this
    }

    /**
     * Get created
     * @return created
     */
    @Schema(name = "created", requiredMode = Schema.RequiredMode.REQUIRED)
    fun getCreated(): @NotNull JsonNullable<Int>? {
        return created
    }

    fun setCreated(created: JsonNullable<Int>) {
        this.created = created
    }

    fun ready(ready: Boolean?): Engine {
        this.ready = ready
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val engine = other as Engine
        return id == engine.id && `object` == engine.`object` && created == engine.created && ready == engine.ready
    }

    override fun hashCode(): Int {
        return Objects.hash(id, `object`, created, ready)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class Engine {\n")
        sb.append("    id: ").append(toIndentedString(id)).append("\n")
        sb.append("    _object: ").append(toIndentedString(`object`)).append("\n")
        sb.append("    created: ").append(toIndentedString(created)).append("\n")
        sb.append("    ready: ").append(toIndentedString(ready)).append("\n")
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