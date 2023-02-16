package org.openapi.openai.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.annotation.Generated
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import java.util.*

/**
 * CreateModerationResponse
 */
@Generated(
    value = ["org.openapitools.codegen.languages.SpringCodegen"],
    date = "2023-02-15T20:47:29.471771-08:00[America/Vancouver]"
)
class CreateModerationResponse {
    /**
     * Get id
     * @return id
     */
    @get:Schema(
        name = "id",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("id")
    var id: String? = null

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

    @JsonProperty("results")
    private var results: @Valid MutableList<CreateModerationResponseResultsInner>? = ArrayList()
    fun id(id: String?): CreateModerationResponse {
        this.id = id
        return this
    }

    fun model(model: String?): CreateModerationResponse {
        this.model = model
        return this
    }

    fun results(results: MutableList<CreateModerationResponseResultsInner>?): CreateModerationResponse {
        this.results = results
        return this
    }

    fun addResultsItem(resultsItem: CreateModerationResponseResultsInner): CreateModerationResponse {
        results!!.add(resultsItem)
        return this
    }

    /**
     * Get results
     * @return results
     */
    @Schema(name = "results", requiredMode = Schema.RequiredMode.REQUIRED)
    fun getResults(): @NotNull @Valid MutableList<CreateModerationResponseResultsInner>? {
        return results
    }

    fun setResults(results: MutableList<CreateModerationResponseResultsInner>?) {
        this.results = results
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val createModerationResponse = other as CreateModerationResponse
        return id == createModerationResponse.id && model == createModerationResponse.model && results == createModerationResponse.results
    }

    override fun hashCode(): Int {
        return Objects.hash(id, model, results)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class CreateModerationResponse {\n")
        sb.append("    id: ").append(toIndentedString(id)).append("\n")
        sb.append("    model: ").append(toIndentedString(model)).append("\n")
        sb.append("    results: ").append(toIndentedString(results)).append("\n")
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