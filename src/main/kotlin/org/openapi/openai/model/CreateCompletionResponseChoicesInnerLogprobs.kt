package org.openapi.openai.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonTypeName
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.annotation.Generated
import jakarta.validation.Valid
import java.math.BigDecimal
import java.util.*

/**
 * CreateCompletionResponseChoicesInnerLogprobs
 */
@JsonTypeName("CreateCompletionResponse_choices_inner_logprobs")
@Generated(
    value = ["org.openapitools.codegen.languages.SpringCodegen"],
    date = "2023-02-15T20:47:29.471771-08:00[America/Vancouver]"
)
class CreateCompletionResponseChoicesInnerLogprobs {
    @JsonProperty("tokens")
    private var tokens: @Valid MutableList<String>? = null

    @JsonProperty("token_logprobs")
    private var tokenLogprobs: @Valid MutableList<BigDecimal>? = null

    @JsonProperty("top_logprobs")
    private var topLogprobs: @Valid MutableList<Any>? = null

    @JsonProperty("text_offset")
    private var textOffset: @Valid MutableList<Int>? = null
    fun tokens(tokens: MutableList<String>?): CreateCompletionResponseChoicesInnerLogprobs {
        this.tokens = tokens
        return this
    }

    fun addTokensItem(tokensItem: String): CreateCompletionResponseChoicesInnerLogprobs {
        if (tokens == null) {
            tokens = ArrayList()
        }
        tokens!!.add(tokensItem)
        return this
    }

    /**
     * Get tokens
     * @return tokens
     */
    @Schema(name = "tokens", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    fun getTokens(): MutableList<String>? {
        return tokens
    }

    fun setTokens(tokens: MutableList<String>?) {
        this.tokens = tokens
    }

    fun tokenLogprobs(tokenLogprobs: MutableList<BigDecimal>?): CreateCompletionResponseChoicesInnerLogprobs {
        this.tokenLogprobs = tokenLogprobs
        return this
    }

    fun addTokenLogprobsItem(tokenLogprobsItem: BigDecimal): CreateCompletionResponseChoicesInnerLogprobs {
        if (tokenLogprobs == null) {
            tokenLogprobs = ArrayList()
        }
        tokenLogprobs!!.add(tokenLogprobsItem)
        return this
    }

    /**
     * Get tokenLogprobs
     * @return tokenLogprobs
     */
    @Schema(name = "token_logprobs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    fun getTokenLogprobs(): @Valid MutableList<BigDecimal>? {
        return tokenLogprobs
    }

    fun setTokenLogprobs(tokenLogprobs: MutableList<BigDecimal>?) {
        this.tokenLogprobs = tokenLogprobs
    }

    fun topLogprobs(topLogprobs: MutableList<Any>?): CreateCompletionResponseChoicesInnerLogprobs {
        this.topLogprobs = topLogprobs
        return this
    }

    fun addTopLogprobsItem(topLogprobsItem: Any): CreateCompletionResponseChoicesInnerLogprobs {
        if (topLogprobs == null) {
            topLogprobs = ArrayList()
        }
        topLogprobs!!.add(topLogprobsItem)
        return this
    }

    /**
     * Get topLogprobs
     * @return topLogprobs
     */
    @Schema(name = "top_logprobs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    fun getTopLogprobs(): MutableList<Any>? {
        return topLogprobs
    }

    fun setTopLogprobs(topLogprobs: MutableList<Any>?) {
        this.topLogprobs = topLogprobs
    }

    fun textOffset(textOffset: MutableList<Int>?): CreateCompletionResponseChoicesInnerLogprobs {
        this.textOffset = textOffset
        return this
    }

    fun addTextOffsetItem(textOffsetItem: Int): CreateCompletionResponseChoicesInnerLogprobs {
        if (textOffset == null) {
            textOffset = ArrayList()
        }
        textOffset!!.add(textOffsetItem)
        return this
    }

    /**
     * Get textOffset
     * @return textOffset
     */
    @Schema(name = "text_offset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    fun getTextOffset(): MutableList<Int>? {
        return textOffset
    }

    fun setTextOffset(textOffset: MutableList<Int>?) {
        this.textOffset = textOffset
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val createCompletionResponseChoicesInnerLogprobs = other as CreateCompletionResponseChoicesInnerLogprobs
        return tokens == createCompletionResponseChoicesInnerLogprobs.tokens && tokenLogprobs == createCompletionResponseChoicesInnerLogprobs.tokenLogprobs && topLogprobs == createCompletionResponseChoicesInnerLogprobs.topLogprobs && textOffset == createCompletionResponseChoicesInnerLogprobs.textOffset
    }

    override fun hashCode(): Int {
        return Objects.hash(tokens, tokenLogprobs, topLogprobs, textOffset)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class CreateCompletionResponseChoicesInnerLogprobs {\n")
        sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n")
        sb.append("    tokenLogprobs: ").append(toIndentedString(tokenLogprobs)).append("\n")
        sb.append("    topLogprobs: ").append(toIndentedString(topLogprobs)).append("\n")
        sb.append("    textOffset: ").append(toIndentedString(textOffset)).append("\n")
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