package org.openapi.openai.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonTypeName
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.annotation.Generated
import java.util.*

/**
 * CreateEmbeddingResponseUsage
 */
@JsonTypeName("CreateEmbeddingResponse_usage")
@Generated(
    value = ["org.openapitools.codegen.languages.SpringCodegen"],
    date = "2023-02-15T20:47:29.471771-08:00[America/Vancouver]"
)
class CreateEmbeddingResponseUsage {
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
     * Get totalTokens
     * @return totalTokens
     */
    @get:Schema(
        name = "total_tokens",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("total_tokens")
    var totalTokens: Int? = null
    fun promptTokens(promptTokens: Int?): CreateEmbeddingResponseUsage {
        this.promptTokens = promptTokens
        return this
    }

    fun totalTokens(totalTokens: Int?): CreateEmbeddingResponseUsage {
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
        val createEmbeddingResponseUsage = other as CreateEmbeddingResponseUsage
        return promptTokens == createEmbeddingResponseUsage.promptTokens && totalTokens == createEmbeddingResponseUsage.totalTokens
    }

    override fun hashCode(): Int {
        return Objects.hash(promptTokens, totalTokens)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class CreateEmbeddingResponseUsage {\n")
        sb.append("    promptTokens: ").append(toIndentedString(promptTokens)).append("\n")
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