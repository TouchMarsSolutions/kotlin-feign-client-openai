package org.openapi.openai.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonTypeName
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.annotation.Generated
import java.util.*

/**
 * CreateModerationResponseResultsInner
 */
@JsonTypeName("CreateModerationResponse_results_inner")
@Generated(
    value = ["org.openapitools.codegen.languages.SpringCodegen"],
    date = "2023-02-15T20:47:29.471771-08:00[America/Vancouver]"
)
class CreateModerationResponseResultsInner {
    /**
     * Get flagged
     * @return flagged
     */
    @get:Schema(
        name = "flagged",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("flagged")
    var flagged: Boolean? = null

    /**
     * Get categories
     * @return categories
     */
    @get:Schema(
        name = "categories",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("categories")
    var categories: CreateModerationResponseResultsInnerCategories? = null

    /**
     * Get categoryScores
     * @return categoryScores
     */
    @get:Schema(
        name = "category_scores",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("category_scores")
    var categoryScores: CreateModerationResponseResultsInnerCategoryScores? = null
    fun flagged(flagged: Boolean?): CreateModerationResponseResultsInner {
        this.flagged = flagged
        return this
    }

    fun categories(categories: CreateModerationResponseResultsInnerCategories?): CreateModerationResponseResultsInner {
        this.categories = categories
        return this
    }

    fun categoryScores(categoryScores: CreateModerationResponseResultsInnerCategoryScores?): CreateModerationResponseResultsInner {
        this.categoryScores = categoryScores
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val createModerationResponseResultsInner = other as CreateModerationResponseResultsInner
        return flagged == createModerationResponseResultsInner.flagged && categories == createModerationResponseResultsInner.categories && categoryScores == createModerationResponseResultsInner.categoryScores
    }

    override fun hashCode(): Int {
        return Objects.hash(flagged, categories, categoryScores)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class CreateModerationResponseResultsInner {\n")
        sb.append("    flagged: ").append(toIndentedString(flagged)).append("\n")
        sb.append("    categories: ").append(toIndentedString(categories)).append("\n")
        sb.append("    categoryScores: ").append(toIndentedString(categoryScores)).append("\n")
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