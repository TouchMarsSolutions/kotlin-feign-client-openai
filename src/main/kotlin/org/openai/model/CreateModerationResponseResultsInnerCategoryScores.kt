package org.openapi.openai.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonTypeName
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.annotation.Generated
import java.math.BigDecimal
import java.util.*

/**
 * CreateModerationResponseResultsInnerCategoryScores
 */
@JsonTypeName("CreateModerationResponse_results_inner_category_scores")
@Generated(
    value = ["org.openapitools.codegen.languages.SpringCodegen"],
    date = "2023-02-15T20:47:29.471771-08:00[America/Vancouver]"
)
class CreateModerationResponseResultsInnerCategoryScores {
    /**
     * Get hate
     * @return hate
     */
    @get:Schema(
        name = "hate",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("hate")
    var hate: BigDecimal? = null

    /**
     * Get hateThreatening
     * @return hateThreatening
     */
    @get:Schema(
        name = "hate/threatening",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("hate/threatening")
    var hateThreatening: BigDecimal? = null

    /**
     * Get selfHarm
     * @return selfHarm
     */
    @get:Schema(
        name = "self-harm",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("self-harm")
    var selfHarm: BigDecimal? = null

    /**
     * Get sexual
     * @return sexual
     */
    @get:Schema(
        name = "sexual",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("sexual")
    var sexual: BigDecimal? = null

    /**
     * Get sexualMinors
     * @return sexualMinors
     */
    @get:Schema(
        name = "sexual/minors",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("sexual/minors")
    var sexualMinors: BigDecimal? = null

    /**
     * Get violence
     * @return violence
     */
    @get:Schema(
        name = "violence",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("violence")
    var violence: BigDecimal? = null

    /**
     * Get violenceGraphic
     * @return violenceGraphic
     */
    @get:Schema(
        name = "violence/graphic",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("violence/graphic")
    var violenceGraphic: BigDecimal? = null
    fun hate(hate: BigDecimal?): CreateModerationResponseResultsInnerCategoryScores {
        this.hate = hate
        return this
    }

    fun hateThreatening(hateThreatening: BigDecimal?): CreateModerationResponseResultsInnerCategoryScores {
        this.hateThreatening = hateThreatening
        return this
    }

    fun selfHarm(selfHarm: BigDecimal?): CreateModerationResponseResultsInnerCategoryScores {
        this.selfHarm = selfHarm
        return this
    }

    fun sexual(sexual: BigDecimal?): CreateModerationResponseResultsInnerCategoryScores {
        this.sexual = sexual
        return this
    }

    fun sexualMinors(sexualMinors: BigDecimal?): CreateModerationResponseResultsInnerCategoryScores {
        this.sexualMinors = sexualMinors
        return this
    }

    fun violence(violence: BigDecimal?): CreateModerationResponseResultsInnerCategoryScores {
        this.violence = violence
        return this
    }

    fun violenceGraphic(violenceGraphic: BigDecimal?): CreateModerationResponseResultsInnerCategoryScores {
        this.violenceGraphic = violenceGraphic
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val createModerationResponseResultsInnerCategoryScores = other as CreateModerationResponseResultsInnerCategoryScores
        return hate == createModerationResponseResultsInnerCategoryScores.hate && hateThreatening == createModerationResponseResultsInnerCategoryScores.hateThreatening && selfHarm == createModerationResponseResultsInnerCategoryScores.selfHarm && sexual == createModerationResponseResultsInnerCategoryScores.sexual && sexualMinors == createModerationResponseResultsInnerCategoryScores.sexualMinors && violence == createModerationResponseResultsInnerCategoryScores.violence && violenceGraphic == createModerationResponseResultsInnerCategoryScores.violenceGraphic
    }

    override fun hashCode(): Int {
        return Objects.hash(hate, hateThreatening, selfHarm, sexual, sexualMinors, violence, violenceGraphic)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class CreateModerationResponseResultsInnerCategoryScores {\n")
        sb.append("    hate: ").append(toIndentedString(hate)).append("\n")
        sb.append("    hateThreatening: ").append(toIndentedString(hateThreatening)).append("\n")
        sb.append("    selfHarm: ").append(toIndentedString(selfHarm)).append("\n")
        sb.append("    sexual: ").append(toIndentedString(sexual)).append("\n")
        sb.append("    sexualMinors: ").append(toIndentedString(sexualMinors)).append("\n")
        sb.append("    violence: ").append(toIndentedString(violence)).append("\n")
        sb.append("    violenceGraphic: ").append(toIndentedString(violenceGraphic)).append("\n")
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