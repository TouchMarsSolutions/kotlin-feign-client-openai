package org.openapi.openai.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.annotation.Generated
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import java.util.*

/**
 * CreateEmbeddingResponse
 */
@Generated(
    value = ["org.openapitools.codegen.languages.SpringCodegen"],
    date = "2023-02-15T20:47:29.471771-08:00[America/Vancouver]"
)
class CreateEmbeddingResponse {
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
     * Get model
     * @return model
     */
    @get:Schema(
        name = "model",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("model")
    var model: String? = null

    @JsonProperty("data")
    private var data: @Valid MutableList<CreateEmbeddingResponseDataInner>? = ArrayList()

    /**
     * Get usage
     * @return usage
     */
    @get:Schema(
        name = "usage",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("usage")
    var usage: CreateEmbeddingResponseUsage? = null
    fun _object(_object: String?): CreateEmbeddingResponse {
        `object` = _object
        return this
    }

    fun model(model: String?): CreateEmbeddingResponse {
        this.model = model
        return this
    }

    fun data(data: MutableList<CreateEmbeddingResponseDataInner>?): CreateEmbeddingResponse {
        this.data = data
        return this
    }

    fun addDataItem(dataItem: CreateEmbeddingResponseDataInner): CreateEmbeddingResponse {
        data!!.add(dataItem)
        return this
    }

    /**
     * Get data
     * @return data
     */
    @Schema(name = "data", requiredMode = Schema.RequiredMode.REQUIRED)
    fun getData(): @NotNull @Valid MutableList<CreateEmbeddingResponseDataInner>? {
        return data
    }

    fun setData(data: MutableList<CreateEmbeddingResponseDataInner>?) {
        this.data = data
    }

    fun usage(usage: CreateEmbeddingResponseUsage?): CreateEmbeddingResponse {
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
        val createEmbeddingResponse = other as CreateEmbeddingResponse
        return `object` == createEmbeddingResponse.`object` && model == createEmbeddingResponse.model && data == createEmbeddingResponse.data && usage == createEmbeddingResponse.usage
    }

    override fun hashCode(): Int {
        return Objects.hash(`object`, model, data, usage)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class CreateEmbeddingResponse {\n")
        sb.append("    _object: ").append(toIndentedString(`object`)).append("\n")
        sb.append("    model: ").append(toIndentedString(model)).append("\n")
        sb.append("    data: ").append(toIndentedString(data)).append("\n")
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