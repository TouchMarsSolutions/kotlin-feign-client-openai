package org.openapi.openai.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.annotation.Generated
import java.util.*

/**
 * FineTuneEvent
 */
@Generated(
    value = ["org.openapitools.codegen.languages.SpringCodegen"],
    date = "2023-02-15T20:47:29.471771-08:00[America/Vancouver]"
)
class FineTuneEvent {
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
     * Get level
     * @return level
     */
    @get:Schema(
        name = "level",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("level")
    var level: String? = null

    /**
     * Get message
     * @return message
     */
    @get:Schema(
        name = "message",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("message")
    var message: String? = null
    fun _object(_object: String?): FineTuneEvent {
        `object` = _object
        return this
    }

    fun createdAt(createdAt: Int?): FineTuneEvent {
        this.createdAt = createdAt
        return this
    }

    fun level(level: String?): FineTuneEvent {
        this.level = level
        return this
    }

    fun message(message: String?): FineTuneEvent {
        this.message = message
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val fineTuneEvent = other as FineTuneEvent
        return `object` == fineTuneEvent.`object` && createdAt == fineTuneEvent.createdAt && level == fineTuneEvent.level && message == fineTuneEvent.message
    }

    override fun hashCode(): Int {
        return Objects.hash(`object`, createdAt, level, message)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class FineTuneEvent {\n")
        sb.append("    _object: ").append(toIndentedString(`object`)).append("\n")
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n")
        sb.append("    level: ").append(toIndentedString(level)).append("\n")
        sb.append("    message: ").append(toIndentedString(message)).append("\n")
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