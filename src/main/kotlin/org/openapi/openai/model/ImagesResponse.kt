package org.openapi.openai.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.annotation.Generated
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import java.util.*

/**
 * ImagesResponse
 */
@Generated(
    value = ["org.openapitools.codegen.languages.SpringCodegen"],
    date = "2023-02-15T20:47:29.471771-08:00[America/Vancouver]"
)
class ImagesResponse {
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

    @JsonProperty("data")
    private var data: @Valid MutableList<ImagesResponseDataInner>? = ArrayList()
    fun created(created: Int?): ImagesResponse {
        this.created = created
        return this
    }

    fun data(data: MutableList<ImagesResponseDataInner>?): ImagesResponse {
        this.data = data
        return this
    }

    fun addDataItem(dataItem: ImagesResponseDataInner): ImagesResponse {
        data!!.add(dataItem)
        return this
    }

    /**
     * Get data
     * @return data
     */
    @Schema(name = "data", requiredMode = Schema.RequiredMode.REQUIRED)
    fun getData(): @NotNull @Valid MutableList<ImagesResponseDataInner>? {
        return data
    }

    fun setData(data: MutableList<ImagesResponseDataInner>?) {
        this.data = data
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val imagesResponse = other as ImagesResponse
        return created == imagesResponse.created && data == imagesResponse.data
    }

    override fun hashCode(): Int {
        return Objects.hash(created, data)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class ImagesResponse {\n")
        sb.append("    created: ").append(toIndentedString(created)).append("\n")
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