package org.openapi.openai.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonTypeName
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.annotation.Generated
import java.util.*

/**
 * CreateCompletionResponseUsage
 */
@JsonTypeName("CreateCompletionResponse_usage")
@Generated(
    value = ["org.openapitools.codegen.languages.SpringCodegen"],
    date = "2023-02-15T20:47:29.471771-08:00[America/Vancouver]"
)
class CreateCompletionResponseUsage {
    /**
     * Get promptTokens
     * @return promptTokens
     */
    @get:Schema(
        name = "prompt_tokens",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("prompt_tokens")
    var promptTokens: Int? = null

    /**
     * Get completionTokens
     * @return completionTokens
     */
    @get:Schema(
        name = "completion_tokens",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("completion_tokens")
    var completionTokens: Int? = null

    /**
     * Get totalTokens
     * @return totalTokens
     */
    @get:Schema(
        name = "total_tokens",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("total_tokens")
    var totalTokens: Int? = null
    fun promptTokens(promptTokens: Int?): CreateCompletionResponseUsage {
        this.promptTokens = promptTokens
        return this
    }

    fun completionTokens(completionTokens: Int?): CreateCompletionResponseUsage {
        this.completionTokens = completionTokens
        return this
    }

    fun totalTokens(totalTokens: Int?): CreateCompletionResponseUsage {
        this.totalTokens = totalTokens
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val createCompletionResponseUsage = other as CreateCompletionResponseUsage
        return promptTokens == createCompletionResponseUsage.promptTokens && completionTokens == createCompletionResponseUsage.completionTokens && totalTokens == createCompletionResponseUsage.totalTokens
    }

    override fun hashCode(): Int {
        return Objects.hash(promptTokens, completionTokens, totalTokens)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class CreateCompletionResponseUsage {\n")
        sb.append("    promptTokens: ").append(toIndentedString(promptTokens)).append("\n")
        sb.append("    completionTokens: ").append(toIndentedString(completionTokens)).append("\n")
        sb.append("    totalTokens: ").append(toIndentedString(totalTokens)).append("\n")
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