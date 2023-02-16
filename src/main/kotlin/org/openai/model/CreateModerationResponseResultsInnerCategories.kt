package org.openapi.openai.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonTypeName
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.annotation.Generated
import java.util.*

/**
 * CreateModerationResponseResultsInnerCategories
 */
@JsonTypeName("CreateModerationResponse_results_inner_categories")
@Generated(
    value = ["org.openapitools.codegen.languages.SpringCodegen"],
    date = "2023-02-15T20:47:29.471771-08:00[America/Vancouver]"
)
class CreateModerationResponseResultsInnerCategories {
    /**
     * Get hate
     * @return hate
     */
    @get:Schema(
        name = "hate",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("hate")
    var hate: Boolean? = null

    /**
     * Get hateThreatening
     * @return hateThreatening
     */
    @get:Schema(
        name = "hate/threatening",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("hate/threatening")
    var hateThreatening: Boolean? = null

    /**
     * Get selfHarm
     * @return selfHarm
     */
    @get:Schema(
        name = "self-harm",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("self-harm")
    var selfHarm: Boolean? = null

    /**
     * Get sexual
     * @return sexual
     */
    @get:Schema(
        name = "sexual",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("sexual")
    var sexual: Boolean? = null

    /**
     * Get sexualMinors
     * @return sexualMinors
     */
    @get:Schema(
        name = "sexual/minors",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("sexual/minors")
    var sexualMinors: Boolean? = null

    /**
     * Get violence
     * @return violence
     */
    @get:Schema(
        name = "violence",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("violence")
    var violence: Boolean? = null

    /**
     * Get violenceGraphic
     * @return violenceGraphic
     */
    @get:Schema(
        name = "violence/graphic",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("violence/graphic")
    var violenceGraphic: Boolean? = null
    fun hate(hate: Boolean?): CreateModerationResponseResultsInnerCategories {
        this.hate = hate
        return this
    }

    fun hateThreatening(hateThreatening: Boolean?): CreateModerationResponseResultsInnerCategories {
        this.hateThreatening = hateThreatening
        return this
    }

    fun selfHarm(selfHarm: Boolean?): CreateModerationResponseResultsInnerCategories {
        this.selfHarm = selfHarm
        return this
    }

    fun sexual(sexual: Boolean?): CreateModerationResponseResultsInnerCategories {
        this.sexual = sexual
        return this
    }

    fun sexualMinors(sexualMinors: Boolean?): CreateModerationResponseResultsInnerCategories {
        this.sexualMinors = sexualMinors
        return this
    }

    fun violence(violence: Boolean?): CreateModerationResponseResultsInnerCategories {
        this.violence = violence
        return this
    }

    fun violenceGraphic(violenceGraphic: Boolean?): CreateModerationResponseResultsInnerCategories {
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
        val createModerationResponseResultsInnerCategories = other as CreateModerationResponseResultsInnerCategories
        return hate == createModerationResponseResultsInnerCategories.hate && hateThreatening == createModerationResponseResultsInnerCategories.hateThreatening && selfHarm == createModerationResponseResultsInnerCategories.selfHarm && sexual == createModerationResponseResultsInnerCategories.sexual && sexualMinors == createModerationResponseResultsInnerCategories.sexualMinors && violence == createModerationResponseResultsInnerCategories.violence && violenceGraphic == createModerationResponseResultsInnerCategories.violenceGraphic
    }

    override fun hashCode(): Int {
        return Objects.hash(hate, hateThreatening, selfHarm, sexual, sexualMinors, violence, violenceGraphic)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class CreateModerationResponseResultsInnerCategories {\n")
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