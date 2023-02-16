package org.openapi.openai.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.annotation.Generated
import jakarta.validation.Valid
import java.util.*

/**
 * CreateClassificationResponse
 */
@Generated(
    value = ["org.openapitools.codegen.languages.SpringCodegen"],
    date = "2023-02-15T20:47:29.471771-08:00[America/Vancouver]"
)
class CreateClassificationResponse {
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

    /**
     * Get searchModel
     * @return searchModel
     */
    @get:Schema(
        name = "search_model",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("search_model")
    var searchModel: String? = null

    /**
     * Get completion
     * @return completion
     */
    @get:Schema(
        name = "completion",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("completion")
    var completion: String? = null

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

    @JsonProperty("selected_examples")
    private var selectedExamples: @Valid MutableList<CreateClassificationResponseSelectedExamplesInner>? = null
    fun _object(_object: String?): CreateClassificationResponse {
        `object` = _object
        return this
    }

    fun model(model: String?): CreateClassificationResponse {
        this.model = model
        return this
    }

    fun searchModel(searchModel: String?): CreateClassificationResponse {
        this.searchModel = searchModel
        return this
    }

    fun completion(completion: String?): CreateClassificationResponse {
        this.completion = completion
        return this
    }

    fun label(label: String?): CreateClassificationResponse {
        this.label = label
        return this
    }

    fun selectedExamples(selectedExamples: MutableList<CreateClassificationResponseSelectedExamplesInner>?): CreateClassificationResponse {
        this.selectedExamples = selectedExamples
        return this
    }

    fun addSelectedExamplesItem(selectedExamplesItem: CreateClassificationResponseSelectedExamplesInner): CreateClassificationResponse {
        if (selectedExamples == null) {
            selectedExamples = ArrayList()
        }
        selectedExamples!!.add(selectedExamplesItem)
        return this
    }

    /**
     * Get selectedExamples
     * @return selectedExamples
     */
    @Schema(name = "selected_examples", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    fun getSelectedExamples(): @Valid MutableList<CreateClassificationResponseSelectedExamplesInner>? {
        return selectedExamples
    }

    fun setSelectedExamples(selectedExamples: MutableList<CreateClassificationResponseSelectedExamplesInner>?) {
        this.selectedExamples = selectedExamples
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val createClassificationResponse = other as CreateClassificationResponse
        return `object` == createClassificationResponse.`object` && model == createClassificationResponse.model && searchModel == createClassificationResponse.searchModel && completion == createClassificationResponse.completion && label == createClassificationResponse.label && selectedExamples == createClassificationResponse.selectedExamples
    }

    override fun hashCode(): Int {
        return Objects.hash(`object`, model, searchModel, completion, label, selectedExamples)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class CreateClassificationResponse {\n")
        sb.append("    _object: ").append(toIndentedString(`object`)).append("\n")
        sb.append("    model: ").append(toIndentedString(model)).append("\n")
        sb.append("    searchModel: ").append(toIndentedString(searchModel)).append("\n")
        sb.append("    completion: ").append(toIndentedString(completion)).append("\n")
        sb.append("    label: ").append(toIndentedString(label)).append("\n")
        sb.append("    selectedExamples: ").append(toIndentedString(selectedExamples)).append("\n")
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