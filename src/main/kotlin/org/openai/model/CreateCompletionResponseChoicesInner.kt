package org.openapi.openai.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonTypeName
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.annotation.Generated
import jakarta.validation.Valid
import org.openapitools.jackson.nullable.JsonNullable
import java.util.*

/**
 * CreateCompletionResponseChoicesInner
 */
@JsonTypeName("CreateCompletionResponse_choices_inner")
@Generated(
    value = ["org.openapitools.codegen.languages.SpringCodegen"],
    date = "2023-02-15T20:47:29.471771-08:00[America/Vancouver]"
)
class CreateCompletionResponseChoicesInner {
    /**
     * Get text
     * @return text
     */
    @get:Schema(
        name = "text",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("text")
    var text: String? = null

    /**
     * Get index
     * @return index
     */
    @get:Schema(
        name = "index",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("index")
    var index: Int? = null

    @JsonProperty("logprobs")
    private var logprobs = JsonNullable.undefined<CreateCompletionResponseChoicesInnerLogprobs>()

    /**
     * Get finishReason
     * @return finishReason
     */
    @get:Schema(
        name = "finish_reason",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("finish_reason")
    var finishReason: String? = null
    fun text(text: String?): CreateCompletionResponseChoicesInner {
        this.text = text
        return this
    }

    fun index(index: Int?): CreateCompletionResponseChoicesInner {
        this.index = index
        return this
    }

    fun logprobs(logprobs: CreateCompletionResponseChoicesInnerLogprobs): CreateCompletionResponseChoicesInner {
        this.logprobs = JsonNullable.of(logprobs)
        return this
    }

    /**
     * Get logprobs
     * @return logprobs
     */
    @Schema(name = "logprobs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    fun getLogprobs(): @Valid JsonNullable<CreateCompletionResponseChoicesInnerLogprobs>? {
        return logprobs
    }

    fun setLogprobs(logprobs: JsonNullable<CreateCompletionResponseChoicesInnerLogprobs>) {
        this.logprobs = logprobs
    }

    fun finishReason(finishReason: String?): CreateCompletionResponseChoicesInner {
        this.finishReason = finishReason
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val createCompletionResponseChoicesInner = other as CreateCompletionResponseChoicesInner
        return text == createCompletionResponseChoicesInner.text && index == createCompletionResponseChoicesInner.index &&
                equalsNullable(
                    logprobs,
                    createCompletionResponseChoicesInner.logprobs
                ) && finishReason == createCompletionResponseChoicesInner.finishReason
    }

    override fun hashCode(): Int {
        return Objects.hash(text, index, hashCodeNullable(logprobs), finishReason)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class CreateCompletionResponseChoicesInner {\n")
        sb.append("    text: ").append(toIndentedString(text)).append("\n")
        sb.append("    index: ").append(toIndentedString(index)).append("\n")
        sb.append("    logprobs: ").append(toIndentedString(logprobs)).append("\n")
        sb.append("    finishReason: ").append(toIndentedString(finishReason)).append("\n")
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