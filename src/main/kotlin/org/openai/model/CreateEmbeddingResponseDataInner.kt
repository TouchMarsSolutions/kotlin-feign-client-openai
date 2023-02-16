package org.openapi.openai.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonTypeName
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.annotation.Generated
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import java.math.BigDecimal
import java.util.*

/**
 * CreateEmbeddingResponseDataInner
 */
@JsonTypeName("CreateEmbeddingResponse_data_inner")
@Generated(
    value = ["org.openapitools.codegen.languages.SpringCodegen"],
    date = "2023-02-15T20:47:29.471771-08:00[America/Vancouver]"
)
class CreateEmbeddingResponseDataInner {
    /**
     * Get index
     * @return index
     */
    @get:Schema(
        name = "index",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("index")
    var index: Int? = null

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

    @JsonProperty("embedding")
    private var embedding: @Valid MutableList<BigDecimal>? = ArrayList()
    fun index(index: Int?): CreateEmbeddingResponseDataInner {
        this.index = index
        return this
    }

    fun _object(_object: String?): CreateEmbeddingResponseDataInner {
        `object` = _object
        return this
    }

    fun embedding(embedding: MutableList<BigDecimal>?): CreateEmbeddingResponseDataInner {
        this.embedding = embedding
        return this
    }

    fun addEmbeddingItem(embeddingItem: BigDecimal): CreateEmbeddingResponseDataInner {
        embedding!!.add(embeddingItem)
        return this
    }

    /**
     * Get embedding
     * @return embedding
     */
    @Schema(name = "embedding", requiredMode = Schema.RequiredMode.REQUIRED)
    fun getEmbedding(): @NotNull @Valid MutableList<BigDecimal>? {
        return embedding
    }

    fun setEmbedding(embedding: MutableList<BigDecimal>?) {
        this.embedding = embedding
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val createEmbeddingResponseDataInner = other as CreateEmbeddingResponseDataInner
        return index == createEmbeddingResponseDataInner.index && `object` == createEmbeddingResponseDataInner.`object` && embedding == createEmbeddingResponseDataInner.embedding
    }

    override fun hashCode(): Int {
        return Objects.hash(index, `object`, embedding)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class CreateEmbeddingResponseDataInner {\n")
        sb.append("    index: ").append(toIndentedString(index)).append("\n")
        sb.append("    _object: ").append(toIndentedString(`object`)).append("\n")
        sb.append("    embedding: ").append(toIndentedString(embedding)).append("\n")
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