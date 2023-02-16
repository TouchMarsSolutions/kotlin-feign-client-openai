package org.openapi.openai.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonTypeName
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.annotation.Generated
import java.util.*

/**
 * CreateClassificationResponseSelectedExamplesInner
 */
@JsonTypeName("CreateClassificationResponse_selected_examples_inner")
@Generated(
    value = ["org.openapitools.codegen.languages.SpringCodegen"],
    date = "2023-02-15T20:47:29.471771-08:00[America/Vancouver]"
)
class CreateClassificationResponseSelectedExamplesInner {
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
     * Get label
     * @return label
     */
    @get:Schema(
        name = "label",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("label")
    var label: String? = null
    fun document(document: Int?): CreateClassificationResponseSelectedExamplesInner {
        this.document = document
        return this
    }

    fun text(text: String?): CreateClassificationResponseSelectedExamplesInner {
        this.text = text
        return this
    }

    fun label(label: String?): CreateClassificationResponseSelectedExamplesInner {
        this.label = label
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val createClassificationResponseSelectedExamplesInner = other as CreateClassificationResponseSelectedExamplesInner
        return document == createClassificationResponseSelectedExamplesInner.document && text == createClassificationResponseSelectedExamplesInner.text && label == createClassificationResponseSelectedExamplesInner.label
    }

    override fun hashCode(): Int {
        return Objects.hash(document, text, label)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class CreateClassificationResponseSelectedExamplesInner {\n")
        sb.append("    document: ").append(toIndentedString(document)).append("\n")
        sb.append("    text: ").append(toIndentedString(text)).append("\n")
        sb.append("    label: ").append(toIndentedString(label)).append("\n")
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