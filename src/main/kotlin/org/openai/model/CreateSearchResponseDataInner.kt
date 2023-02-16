package org.openapi.openai.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonTypeName
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.annotation.Generated
import java.math.BigDecimal
import java.util.*

/**
 * CreateSearchResponseDataInner
 */
@JsonTypeName("CreateSearchResponse_data_inner")
@Generated(
    value = ["org.openapitools.codegen.languages.SpringCodegen"],
    date = "2023-02-15T20:47:29.471771-08:00[America/Vancouver]"
)
class CreateSearchResponseDataInner {
    /**
     * Get _object
     * @return _object
     */
    @get:Schema(
        name = "object",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("object")
    var `object`: String? = null

    /**
     * Get document
     * @return document
     */
    @get:Schema(
        name = "document",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("document")
    var document: Int? = null

    /**
     * Get score
     * @return score
     */
    @get:Schema(
        name = "score",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("score")
    var score: BigDecimal? = null
    fun _object(_object: String?): CreateSearchResponseDataInner {
        `object` = _object
        return this
    }

    fun document(document: Int?): CreateSearchResponseDataInner {
        this.document = document
        return this
    }

    fun score(score: BigDecimal?): CreateSearchResponseDataInner {
        this.score = score
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val createSearchResponseDataInner = other as CreateSearchResponseDataInner
        return `object` == createSearchResponseDataInner.`object` && document == createSearchResponseDataInner.document && score == createSearchResponseDataInner.score
    }

    override fun hashCode(): Int {
        return Objects.hash(`object`, document, score)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class CreateSearchResponseDataInner {\n")
        sb.append("    _object: ").append(toIndentedString(`object`)).append("\n")
        sb.append("    document: ").append(toIndentedString(document)).append("\n")
        sb.append("    score: ").append(toIndentedString(score)).append("\n")
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