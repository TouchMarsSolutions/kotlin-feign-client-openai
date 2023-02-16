package org.openapi.openai.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.annotation.Generated
import jakarta.validation.Valid
import java.util.*

/**
 * CreateAnswerResponse
 */
@Generated(
    value = ["org.openapitools.codegen.languages.SpringCodegen"],
    date = "2023-02-15T20:47:29.471771-08:00[America/Vancouver]"
)
class CreateAnswerResponse {
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

    @JsonProperty("answers")
    private var answers: @Valid MutableList<String>? = null

    @JsonProperty("selected_documents")
    private var selectedDocuments: @Valid MutableList<CreateAnswerResponseSelectedDocumentsInner>? = null
    fun _object(_object: String?): CreateAnswerResponse {
        `object` = _object
        return this
    }

    fun model(model: String?): CreateAnswerResponse {
        this.model = model
        return this
    }

    fun searchModel(searchModel: String?): CreateAnswerResponse {
        this.searchModel = searchModel
        return this
    }

    fun completion(completion: String?): CreateAnswerResponse {
        this.completion = completion
        return this
    }

    fun answers(answers: MutableList<String>?): CreateAnswerResponse {
        this.answers = answers
        return this
    }

    fun addAnswersItem(answersItem: String): CreateAnswerResponse {
        if (answers == null) {
            answers = ArrayList()
        }
        answers!!.add(answersItem)
        return this
    }

    /**
     * Get answers
     * @return answers
     */
    @Schema(name = "answers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    fun getAnswers(): MutableList<String>? {
        return answers
    }

    fun setAnswers(answers: MutableList<String>?) {
        this.answers = answers
    }

    fun selectedDocuments(selectedDocuments: MutableList<CreateAnswerResponseSelectedDocumentsInner>?): CreateAnswerResponse {
        this.selectedDocuments = selectedDocuments
        return this
    }

    fun addSelectedDocumentsItem(selectedDocumentsItem: CreateAnswerResponseSelectedDocumentsInner): CreateAnswerResponse {
        if (selectedDocuments == null) {
            selectedDocuments = ArrayList()
        }
        selectedDocuments!!.add(selectedDocumentsItem)
        return this
    }

    /**
     * Get selectedDocuments
     * @return selectedDocuments
     */
    @Schema(name = "selected_documents", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    fun getSelectedDocuments(): @Valid MutableList<CreateAnswerResponseSelectedDocumentsInner>? {
        return selectedDocuments
    }

    fun setSelectedDocuments(selectedDocuments: MutableList<CreateAnswerResponseSelectedDocumentsInner>?) {
        this.selectedDocuments = selectedDocuments
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val createAnswerResponse = other as CreateAnswerResponse
        return `object` == createAnswerResponse.`object` && model == createAnswerResponse.model && searchModel == createAnswerResponse.searchModel && completion == createAnswerResponse.completion && answers == createAnswerResponse.answers && selectedDocuments == createAnswerResponse.selectedDocuments
    }

    override fun hashCode(): Int {
        return Objects.hash(`object`, model, searchModel, completion, answers, selectedDocuments)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class CreateAnswerResponse {\n")
        sb.append("    _object: ").append(toIndentedString(`object`)).append("\n")
        sb.append("    model: ").append(toIndentedString(model)).append("\n")
        sb.append("    searchModel: ").append(toIndentedString(searchModel)).append("\n")
        sb.append("    completion: ").append(toIndentedString(completion)).append("\n")
        sb.append("    answers: ").append(toIndentedString(answers)).append("\n")
        sb.append("    selectedDocuments: ").append(toIndentedString(selectedDocuments)).append("\n")
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