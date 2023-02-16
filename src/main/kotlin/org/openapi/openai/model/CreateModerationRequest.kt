package org.openapi.openai.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.annotation.Generated
import java.util.*

/**
 * CreateModerationRequest
 */
@Generated(
    value = ["org.openapitools.codegen.languages.SpringCodegen"],
    date = "2023-02-15T20:47:29.471771-08:00[America/Vancouver]"
)
class CreateModerationRequest {
    /**
     * Get input
     * @return input
     */
    @get:Schema(
        name = "input",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("input")
    var input: CreateModerationRequestInput? = null

    /**
     * Two content moderations models are available: `text-moderation-stable` and `text-moderation-latest`.  The default is `text-moderation-latest` which will be automatically upgraded over time. This ensures you are always using our most accurate model. If you use `text-moderation-stable`, we will provide advanced notice before updating the model. Accuracy of `text-moderation-stable` may be slightly lower than for `text-moderation-latest`.
     * @return model
     */
    @get:Schema(
        name = "model",
        example = "text-moderation-stable",
        description = "Two content moderations models are available: `text-moderation-stable` and `text-moderation-latest`.  The default is `text-moderation-latest` which will be automatically upgraded over time. This ensures you are always using our most accurate model. If you use `text-moderation-stable`, we will provide advanced notice before updating the model. Accuracy of `text-moderation-stable` may be slightly lower than for `text-moderation-latest`. ",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("model")
    var model = "text-moderation-latest"
    fun input(input: CreateModerationRequestInput?): CreateModerationRequest {
        this.input = input
        return this
    }

    fun model(model: String): CreateModerationRequest {
        this.model = model
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val createModerationRequest = other as CreateModerationRequest
        return input == createModerationRequest.input && model == createModerationRequest.model
    }

    override fun hashCode(): Int {
        return Objects.hash(input, model)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class CreateModerationRequest {\n")
        sb.append("    input: ").append(toIndentedString(input)).append("\n")
        sb.append("    model: ").append(toIndentedString(model)).append("\n")
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