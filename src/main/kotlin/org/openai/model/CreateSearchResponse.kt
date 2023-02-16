package org.openapi.openai.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.annotation.Generated
import jakarta.validation.Valid
import java.util.*

/**
 * CreateSearchResponse
 */
@Generated(
    value = ["org.openapitools.codegen.languages.SpringCodegen"],
    date = "2023-02-15T20:47:29.471771-08:00[America/Vancouver]"
)
class CreateSearchResponse {
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
     * Get model
     * @return model
     */
    @get:Schema(
        name = "model",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("model")
    var model: String? = null

    @JsonProperty("data")
    private var data: @Valid MutableList<CreateSearchResponseDataInner>? = null
    fun _object(_object: String?): CreateSearchResponse {
        `object` = _object
        return this
    }

    fun model(model: String?): CreateSearchResponse {
        this.model = model
        return this
    }

    fun data(data: MutableList<CreateSearchResponseDataInner>?): CreateSearchResponse {
        this.data = data
        return this
    }

    fun addDataItem(dataItem: CreateSearchResponseDataInner): CreateSearchResponse {
        if (data == null) {
            data = ArrayList()
        }
        data!!.add(dataItem)
        return this
    }

    /**
     * Get data
     * @return data
     */
    @Schema(name = "data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    fun getData(): @Valid MutableList<CreateSearchResponseDataInner>? {
        return data
    }

    fun setData(data: MutableList<CreateSearchResponseDataInner>?) {
        this.data = data
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val createSearchResponse = other as CreateSearchResponse
        return `object` == createSearchResponse.`object` && model == createSearchResponse.model && data == createSearchResponse.data
    }

    override fun hashCode(): Int {
        return Objects.hash(`object`, model, data)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class CreateSearchResponse {\n")
        sb.append("    _object: ").append(toIndentedString(`object`)).append("\n")
        sb.append("    model: ").append(toIndentedString(model)).append("\n")
        sb.append("    data: ").append(toIndentedString(data)).append("\n")
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