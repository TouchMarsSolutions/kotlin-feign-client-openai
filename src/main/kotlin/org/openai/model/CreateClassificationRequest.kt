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
 * CreateClassificationRequest
 */
@Generated(
    value = ["org.openapitools.codegen.languages.SpringCodegen"],
    date = "2023-02-15T20:47:29.471771-08:00[America/Vancouver]"
)
class CreateClassificationRequest {
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
     * Query to be classified.
     * @return query
     */
    @get:Schema(
        name = "query",
        example = "The plot is not very attractive.",
        description = "Query to be classified.",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("query")
    var query: String? = null

    /**
     * A list of examples with labels, in the following format:  `[[\"The movie is so interesting.\", \"Positive\"], [\"It is quite boring.\", \"Negative\"], ...]`  All the label strings will be normalized to be capitalized.  You should specify either `examples` or `file`, but not both.
     * @return examples
     */
    @get:Schema(
        name = "examples",
        example = "[['Do not see this film.', 'Negative'], ['Smart, provocative and blisteringly funny.', 'Positive']]",
        description = "A list of examples with labels, in the following format:  `[[\"The movie is so interesting.\", \"Positive\"], [\"It is quite boring.\", \"Negative\"], ...]`  All the label strings will be normalized to be capitalized.  You should specify either `examples` or `file`, but not both. ",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("examples")
    var examples: @Valid JsonNullable<MutableList<List<String>>> = JsonNullable.undefined()

    /**
     * The ID of the uploaded file that contains training examples. See [upload file](/docs/api-reference/files/upload) for how to upload a file of the desired format and purpose.  You should specify either `examples` or `file`, but not both.
     * @return file
     */
    @get:Schema(
        name = "file",
        description = "The ID of the uploaded file that contains training examples. See [upload file](/docs/api-reference/files/upload) for how to upload a file of the desired format and purpose.  You should specify either `examples` or `file`, but not both. ",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("file")
    var file = JsonNullable.undefined<String>()

    /**
     * The set of categories being classified. If not specified, candidate labels will be automatically collected from the examples you provide. All the label strings will be normalized to be capitalized.
     * @return labels
     */
    @get:Schema(
        name = "labels",
        example = "[\"Positive\",\"Negative\"]",
        description = "The set of categories being classified. If not specified, candidate labels will be automatically collected from the examples you provide. All the label strings will be normalized to be capitalized.",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("labels")
    var labels: @Valid JsonNullable<MutableList<String>> = JsonNullable.undefined()

    /**
     * ID of the model to use for [Search](/docs/api-reference/searches/create). You can select one of `ada`, `babbage`, `curie`, or `davinci`.
     * @return searchModel
     */
    @get:Schema(
        name = "search_model",
        description = "ID of the model to use for [Search](/docs/api-reference/searches/create). You can select one of `ada`, `babbage`, `curie`, or `davinci`.",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("search_model")
    var searchModel = JsonNullable.undefined<String>()

    @JsonProperty("temperature")
    private var temperature = JsonNullable.undefined<BigDecimal>()

    @JsonProperty("logprobs")
    private var logprobs = JsonNullable.undefined<Int>()

    /**
     * The maximum number of examples to be ranked by [Search](/docs/api-reference/searches/create) when using `file`. Setting it to a higher value leads to improved accuracy but with increased latency and cost.
     * @return maxExamples
     */
    @get:Schema(
        name = "max_examples",
        description = "The maximum number of examples to be ranked by [Search](/docs/api-reference/searches/create) when using `file`. Setting it to a higher value leads to improved accuracy but with increased latency and cost.",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("max_examples")
    var maxExamples = JsonNullable.undefined<Int>()

    /**
     * Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the GPT tokenizer) to an associated bias value from -100 to 100. You can use this [tokenizer tool](/tokenizer?view=bpe) (which works for both GPT-2 and GPT-3) to convert text to token IDs. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  As an example, you can pass `{\"50256\": -100}` to prevent the <|endoftext|> token from being generated.
     * @return logitBias
     */
    @get:Schema(
        name = "logit_bias",
        description = "Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the GPT tokenizer) to an associated bias value from -100 to 100. You can use this [tokenizer tool](/tokenizer?view=bpe) (which works for both GPT-2 and GPT-3) to convert text to token IDs. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  As an example, you can pass `{\"50256\": -100}` to prevent the <|endoftext|> token from being generated. ",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("logit_bias")
    var logitBias = JsonNullable.undefined<Any>()

    /**
     * If set to `true`, the returned JSON will include a \"prompt\" field containing the final prompt that was used to request a completion. This is mainly useful for debugging purposes.
     * @return returnPrompt
     */
    @get:Schema(
        name = "return_prompt",
        description = "If set to `true`, the returned JSON will include a \"prompt\" field containing the final prompt that was used to request a completion. This is mainly useful for debugging purposes.",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("return_prompt")
    var returnPrompt = JsonNullable.undefined<Boolean>()

    /**
     * A special boolean flag for showing metadata. If set to `true`, each document entry in the returned JSON will contain a \"metadata\" field.  This flag only takes effect when `file` is set.
     * @return returnMetadata
     */
    @get:Schema(
        name = "return_metadata",
        description = "A special boolean flag for showing metadata. If set to `true`, each document entry in the returned JSON will contain a \"metadata\" field.  This flag only takes effect when `file` is set. ",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("return_metadata")
    var returnMetadata = JsonNullable.undefined<Boolean>()

    /**
     * If an object name is in the list, we provide the full information of the object; otherwise, we only provide the object ID. Currently we support `completion` and `file` objects for expansion.
     * @return expand
     */
    @get:Schema(
        name = "expand",
        description = "If an object name is in the list, we provide the full information of the object; otherwise, we only provide the object ID. Currently we support `completion` and `file` objects for expansion.",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("expand")
    var expand: @Valid JsonNullable<MutableList<Any>> = JsonNullable.undefined()

    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).
     * @return user
     */
    @get:Schema(
        name = "user",
        example = "user-1234",
        description = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("user")
    var user: String? = null
    fun model(model: String?): CreateClassificationRequest {
        this.model = model
        return this
    }

    fun query(query: String?): CreateClassificationRequest {
        this.query = query
        return this
    }

    fun examples(examples: MutableList<List<String>>?): CreateClassificationRequest {
        this.examples = JsonNullable.of(examples)
        return this
    }

    fun addExamplesItem(examplesItem: MutableList<String>): CreateClassificationRequest {
        if (!examples.isPresent) {
            examples = JsonNullable.of(null)
        }
        examples.get()!!.add(examplesItem)
        return this
    }

    fun file(file: String): CreateClassificationRequest {
        this.file = JsonNullable.of(file)
        return this
    }

    fun labels(labels: MutableList<String>?): CreateClassificationRequest {
        this.labels = JsonNullable.of(labels)
        return this
    }

    fun addLabelsItem(labelsItem: String): CreateClassificationRequest {
        if (!labels.isPresent) {
            labels = JsonNullable.of(null)
        }
        labels.get()!!.add(labelsItem)
        return this
    }

    fun searchModel(searchModel: String): CreateClassificationRequest {
        this.searchModel = JsonNullable.of(searchModel)
        return this
    }

    fun temperature(temperature: BigDecimal): CreateClassificationRequest {
        this.temperature = JsonNullable.of(temperature)
        return this
    }

    /**
     * What sampling `temperature` to use. Higher values mean the model will take more risks. Try 0.9 for more creative applications, and 0 (argmax sampling) for ones with a well-defined answer.
     * minimum: 0
     * maximum: 2
     * @return temperature
     */
    @Schema(
        name = "temperature",
        example = "0",
        description = "What sampling `temperature` to use. Higher values mean the model will take more risks. Try 0.9 for more creative applications, and 0 (argmax sampling) for ones with a well-defined answer.",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    fun getTemperature(): @Valid @DecimalMin("0") @DecimalMax("2") JsonNullable<BigDecimal>? {
        return temperature
    }

    fun setTemperature(temperature: JsonNullable<BigDecimal>) {
        this.temperature = temperature
    }

    fun logprobs(logprobs: Int): CreateClassificationRequest {
        this.logprobs = JsonNullable.of(logprobs)
        return this
    }

    /**
     * Include the log probabilities on the `logprobs` most likely tokens, as well the chosen tokens. For example, if `logprobs` is 5, the API will return a list of the 5 most likely tokens. The API will always return the `logprob` of the sampled token, so there may be up to `logprobs+1` elements in the response.  The maximum value for `logprobs` is 5. If you need more than this, please contact us through our [Help center](https://help.openai.com) and describe your use case.  When `logprobs` is set, `completion` will be automatically added into `expand` to get the logprobs.
     * minimum: 0
     * maximum: 5
     * @return logprobs
     */
    @Schema(
        name = "logprobs",
        description = "Include the log probabilities on the `logprobs` most likely tokens, as well the chosen tokens. For example, if `logprobs` is 5, the API will return a list of the 5 most likely tokens. The API will always return the `logprob` of the sampled token, so there may be up to `logprobs+1` elements in the response.  The maximum value for `logprobs` is 5. If you need more than this, please contact us through our [Help center](https://help.openai.com) and describe your use case.  When `logprobs` is set, `completion` will be automatically added into `expand` to get the logprobs. ",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    fun getLogprobs(): @Min(0) @Max(5) JsonNullable<Int>? {
        return logprobs
    }

    fun setLogprobs(logprobs: JsonNullable<Int>) {
        this.logprobs = logprobs
    }

    fun maxExamples(maxExamples: Int): CreateClassificationRequest {
        this.maxExamples = JsonNullable.of(maxExamples)
        return this
    }

    fun logitBias(logitBias: Any): CreateClassificationRequest {
        this.logitBias = JsonNullable.of(logitBias)
        return this
    }

    fun returnPrompt(returnPrompt: Boolean): CreateClassificationRequest {
        this.returnPrompt = JsonNullable.of(returnPrompt)
        return this
    }

    fun returnMetadata(returnMetadata: Boolean): CreateClassificationRequest {
        this.returnMetadata = JsonNullable.of(returnMetadata)
        return this
    }

    fun expand(expand: MutableList<Any>?): CreateClassificationRequest {
        this.expand = JsonNullable.of(expand)
        return this
    }

    fun addExpandItem(expandItem: Any): CreateClassificationRequest {
        if (!expand.isPresent) {
            expand = JsonNullable.of(null)
        }
        expand.get()!!.add(expandItem)
        return this
    }

    fun user(user: String?): CreateClassificationRequest {
        this.user = user
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val createClassificationRequest = other as CreateClassificationRequest
        return model == createClassificationRequest.model && query == createClassificationRequest.query &&
                equalsNullable(examples, createClassificationRequest.examples) &&
                equalsNullable(file, createClassificationRequest.file) &&
                equalsNullable(labels, createClassificationRequest.labels) &&
                equalsNullable(searchModel, createClassificationRequest.searchModel) &&
                equalsNullable(temperature, createClassificationRequest.temperature) &&
                equalsNullable(logprobs, createClassificationRequest.logprobs) &&
                equalsNullable(maxExamples, createClassificationRequest.maxExamples) &&
                equalsNullable(logitBias, createClassificationRequest.logitBias) &&
                equalsNullable(returnPrompt, createClassificationRequest.returnPrompt) &&
                equalsNullable(returnMetadata, createClassificationRequest.returnMetadata) &&
                equalsNullable(expand, createClassificationRequest.expand) && user == createClassificationRequest.user
    }

    override fun hashCode(): Int {
        return Objects.hash(
            model,
            query,
            hashCodeNullable(examples),
            hashCodeNullable(file),
            hashCodeNullable(labels),
            hashCodeNullable(searchModel),
            hashCodeNullable(temperature),
            hashCodeNullable(logprobs),
            hashCodeNullable(maxExamples),
            hashCodeNullable(logitBias),
            hashCodeNullable(returnPrompt),
            hashCodeNullable(returnMetadata),
            hashCodeNullable(expand),
            user
        )
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class CreateClassificationRequest {\n")
        sb.append("    model: ").append(toIndentedString(model)).append("\n")
        sb.append("    query: ").append(toIndentedString(query)).append("\n")
        sb.append("    examples: ").append(toIndentedString(examples)).append("\n")
        sb.append("    file: ").append(toIndentedString(file)).append("\n")
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n")
        sb.append("    searchModel: ").append(toIndentedString(searchModel)).append("\n")
        sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n")
        sb.append("    logprobs: ").append(toIndentedString(logprobs)).append("\n")
        sb.append("    maxExamples: ").append(toIndentedString(maxExamples)).append("\n")
        sb.append("    logitBias: ").append(toIndentedString(logitBias)).append("\n")
        sb.append("    returnPrompt: ").append(toIndentedString(returnPrompt)).append("\n")
        sb.append("    returnMetadata: ").append(toIndentedString(returnMetadata)).append("\n")
        sb.append("    expand: ").append(toIndentedString(expand)).append("\n")
        sb.append("    user: ").append(toIndentedString(user)).append("\n")
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