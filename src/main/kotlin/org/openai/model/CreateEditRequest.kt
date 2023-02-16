package org.openapi.openai.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.annotation.Generated
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import org.openapitools.jackson.nullable.JsonNullable
import java.math.BigDecimal
import java.util.*

/**
 * CreateEditRequest
 */
@Generated(
    value = ["org.openapitools.codegen.languages.SpringCodegen"],
    date = "2023-02-15T20:47:29.471771-08:00[America/Vancouver]"
)
class CreateEditRequest {
    /**
     * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them.
     * @return model
     */
    @get:Schema(
        name = "model",
        description = "ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them.",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("model")
    var model: String? = null

    /**
     * The input text to use as a starting point for the edit.
     * @return input
     */
    @get:Schema(
        name = "input",
        example = "What day of the wek is it?",
        description = "The input text to use as a starting point for the edit.",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("input")
    var input = JsonNullable.undefined<String>()

    /**
     * The instruction that tells the model how to edit the prompt.
     * @return instruction
     */
    @get:Schema(
        name = "instruction",
        example = "Fix the spelling mistakes.",
        description = "The instruction that tells the model how to edit the prompt.",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("instruction")
    var instruction: String? = null

    @JsonProperty("n")
    private var n = JsonNullable.undefined<Int>()

    @JsonProperty("temperature")
    private var temperature = JsonNullable.undefined<BigDecimal>()

    @JsonProperty("top_p")
    private var topP = JsonNullable.undefined<BigDecimal>()
    fun model(model: String?): CreateEditRequest {
        this.model = model
        return this
    }

    fun input(input: String): CreateEditRequest {
        this.input = JsonNullable.of(input)
        return this
    }

    fun instruction(instruction: String?): CreateEditRequest {
        this.instruction = instruction
        return this
    }

    fun n(n: Int): CreateEditRequest {
        this.n = JsonNullable.of(n)
        return this
    }

    /**
     * How many edits to generate for the input and instruction.
     * minimum: 1
     * maximum: 20
     * @return n
     */
    @Schema(
        name = "n",
        example = "1",
        description = "How many edits to generate for the input and instruction.",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    fun getN(): @Min(1) @Max(20) JsonNullable<Int>? {
        return n
    }

    fun setN(n: JsonNullable<Int>) {
        this.n = n
    }

    fun temperature(temperature: BigDecimal): CreateEditRequest {
        this.temperature = JsonNullable.of(temperature)
        return this
    }

    /**
     * What [sampling temperature](https://towardsdatascience.com/how-to-sample-from-language-models-682bceb97277) to use. Higher values means the model will take more risks. Try 0.9 for more creative applications, and 0 (argmax sampling) for ones with a well-defined answer.  We generally recommend altering this or `top_p` but not both.
     * minimum: 0
     * maximum: 2
     * @return temperature
     */
    @Schema(
        name = "temperature",
        example = "1",
        description = "What [sampling temperature](https://towardsdatascience.com/how-to-sample-from-language-models-682bceb97277) to use. Higher values means the model will take more risks. Try 0.9 for more creative applications, and 0 (argmax sampling) for ones with a well-defined answer.  We generally recommend altering this or `top_p` but not both. ",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    fun getTemperature(): @Valid @DecimalMin("0") @DecimalMax("2") JsonNullable<BigDecimal>? {
        return temperature
    }

    fun setTemperature(temperature: JsonNullable<BigDecimal>) {
        this.temperature = temperature
    }

    fun topP(topP: BigDecimal): CreateEditRequest {
        this.topP = JsonNullable.of(topP)
        return this
    }

    /**
     * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both.
     * minimum: 0
     * maximum: 1
     * @return topP
     */
    @Schema(
        name = "top_p",
        example = "1",
        description = "An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. ",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    fun getTopP(): @Valid @DecimalMin("0") @DecimalMax("1") JsonNullable<BigDecimal>? {
        return topP
    }

    fun setTopP(topP: JsonNullable<BigDecimal>) {
        this.topP = topP
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val createEditRequest = other as CreateEditRequest
        return model == createEditRequest.model &&
                equalsNullable(input, createEditRequest.input) && instruction == createEditRequest.instruction &&
                equalsNullable(n, createEditRequest.n) &&
                equalsNullable(temperature, createEditRequest.temperature) &&
                equalsNullable(topP, createEditRequest.topP)
    }

    override fun hashCode(): Int {
        return Objects.hash(
            model,
            hashCodeNullable(input),
            instruction,
            hashCodeNullable(n),
            hashCodeNullable(temperature),
            hashCodeNullable(topP)
        )
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class CreateEditRequest {\n")
        sb.append("    model: ").append(toIndentedString(model)).append("\n")
        sb.append("    input: ").append(toIndentedString(input)).append("\n")
        sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n")
        sb.append("    n: ").append(toIndentedString(n)).append("\n")
        sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n")
        sb.append("    topP: ").append(toIndentedString(topP)).append("\n")
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

    companion object {
        private fun <T> equalsNullable(a: JsonNullable<T>?, b: JsonNullable<T>?): Boolean {
            return a === b || a != null && b != null && a.isPresent && b.isPresent && Objects.deepEquals(
                a.get(),
                b.get()
            )
        }

        private fun <T : Any> hashCodeNullable(a: JsonNullable<T>?): Int {
            if (a == null) {
                return 1
            }
            return if (a.isPresent) arrayOf<Any>(a.get()).contentDeepHashCode() else 31
        }
    }
}