package org.openapi.openai.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.annotation.Generated
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import java.util.*

/**
 * CreateCompletionResponse
 */
@Generated(
    value = ["org.openapitools.codegen.languages.SpringCodegen"],
    date = "2023-02-15T20:47:29.471771-08:00[America/Vancouver]"
)
class CreateCompletionResponse {
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
     * Get model
     * @return model
     */
    @get:Schema(
        name = "model",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("model")
    var model: String? = null

    @JsonProperty("choices")
    private var choices: @Valid MutableList<CreateCompletionResponseChoicesInner>? = ArrayList()

    /**
     * Get usage
     * @return usage
     */
    @get:Schema(
        name = "usage",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("usage")
    var usage: CreateCompletionResponseUsage? = null
    fun id(id: String?): CreateCompletionResponse {
        this.id = id
        return this
    }

    fun _object(_object: String?): CreateCompletionResponse {
        `object` = _object
        return this
    }

    fun created(created: Int?): CreateCompletionResponse {
        this.created = created
        return this
    }

    fun model(model: String?): CreateCompletionResponse {
        this.model = model
        return this
    }

    fun choices(choices: MutableList<CreateCompletionResponseChoicesInner>?): CreateCompletionResponse {
        this.choices = choices
        return this
    }

    fun addChoicesItem(choicesItem: CreateCompletionResponseChoicesInner): CreateCompletionResponse {
        choices!!.add(choicesItem)
        return this
    }

    /**
     * Get choices
     * @return choices
     */
    @Schema(name = "choices", requiredMode = Schema.RequiredMode.REQUIRED)
    fun getChoices(): @NotNull @Valid MutableList<CreateCompletionResponseChoicesInner>? {
        return choices
    }

    fun setChoices(choices: MutableList<CreateCompletionResponseChoicesInner>?) {
        this.choices = choices
    }

    fun usage(usage: CreateCompletionResponseUsage?): CreateCompletionResponse {
        this.usage = usage
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val createCompletionResponse = other as CreateCompletionResponse
        return id == createCompletionResponse.id && `object` == createCompletionResponse.`object` && created == createCompletionResponse.created && model == createCompletionResponse.model && choices == createCompletionResponse.choices && usage == createCompletionResponse.usage
    }

    override fun hashCode(): Int {
        return Objects.hash(id, `object`, created, model, choices, usage)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class CreateCompletionResponse {\n")
        sb.append("    id: ").append(toIndentedString(id)).append("\n")
        sb.append("    _object: ").append(toIndentedString(`object`)).append("\n")
        sb.append("    created: ").append(toIndentedString(created)).append("\n")
        sb.append("    model: ").append(toIndentedString(model)).append("\n")
        sb.append("    choices: ").append(toIndentedString(choices)).append("\n")
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n")
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