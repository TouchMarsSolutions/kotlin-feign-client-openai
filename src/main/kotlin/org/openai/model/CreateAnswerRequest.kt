package org.openapi.openai.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.annotation.Generated
import jakarta.validation.Valid
import jakarta.validation.constraints.*
import org.openapitools.jackson.nullable.JsonNullable
import java.math.BigDecimal
import java.util.*

/**
 * CreateAnswerRequest
 */
@Generated(
    value = ["org.openapitools.codegen.languages.SpringCodegen"],
    date = "2023-02-15T20:47:29.471771-08:00[America/Vancouver]"
)
class CreateAnswerRequest {
    /**
     * ID of the model to use for completion. You can select one of `ada`, `babbage`, `curie`, or `davinci`.
     * @return model
     */
    @get:Schema(
        name = "model",
        description = "ID of the model to use for completion. You can select one of `ada`, `babbage`, `curie`, or `davinci`.",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("model")
    var model: String? = null

    /**
     * Question to get answered.
     * @return question
     */
    @get:Schema(
        name = "question",
        example = "What is the capital of Japan?",
        description = "Question to get answered.",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("question")
    var question: String? = null

    @JsonProperty("examples")
    private var examples: @Valid MutableList<List<String>>? = ArrayList()

    /**
     * A text snippet containing the contextual information used to generate the answers for the `examples` you provide.
     * @return examplesContext
     */
    @get:Schema(
        name = "examples_context",
        example = "Ottawa, Canada's capital, is located in the east of southern Ontario, near the city of Montréal and the U.S. border.",
        description = "A text snippet containing the contextual information used to generate the answers for the `examples` you provide.",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("examples_context")
    var examplesContext: String? = null

    /**
     * List of documents from which the answer for the input `question` should be derived. If this is an empty list, the question will be answered based on the question-answer examples.  You should specify either `documents` or a `file`, but not both.
     * @return documents
     */
    @get:Schema(
        name = "documents",
        example = "['Japan is an island country in East Asia, located in the northwest Pacific Ocean.', 'Tokyo is the capital and most populous prefecture of Japan.']",
        description = "List of documents from which the answer for the input `question` should be derived. If this is an empty list, the question will be answered based on the question-answer examples.  You should specify either `documents` or a `file`, but not both. ",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("documents")
    var documents: @Valid JsonNullable<MutableList<String>> = JsonNullable.undefined()

    /**
     * The ID of an uploaded file that contains documents to search over. See [upload file](/docs/api-reference/files/upload) for how to upload a file of the desired format and purpose.  You should specify either `documents` or a `file`, but not both.
     * @return file
     */
    @get:Schema(
        name = "file",
        description = "The ID of an uploaded file that contains documents to search over. See [upload file](/docs/api-reference/files/upload) for how to upload a file of the desired format and purpose.  You should specify either `documents` or a `file`, but not both. ",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("file")
    var file = JsonNullable.undefined<String>()

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

    /**
     * The maximum number of documents to be ranked by [Search](/docs/api-reference/searches/create) when using `file`. Setting it to a higher value leads to improved accuracy but with increased latency and cost.
     * @return maxRerank
     */
    @get:Schema(
        name = "max_rerank",
        description = "The maximum number of documents to be ranked by [Search](/docs/api-reference/searches/create) when using `file`. Setting it to a higher value leads to improved accuracy but with increased latency and cost.",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("max_rerank")
    var maxRerank = JsonNullable.undefined<Int>()

    @JsonProperty("temperature")
    private var temperature = JsonNullable.undefined<BigDecimal>()

    @JsonProperty("logprobs")
    private var logprobs = JsonNullable.undefined<Int>()

    /**
     * The maximum number of tokens allowed for the generated answer
     * @return maxTokens
     */
    @get:Schema(
        name = "max_tokens",
        description = "The maximum number of tokens allowed for the generated answer",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("max_tokens")
    var maxTokens = JsonNullable.undefined<Int>()

    @JsonProperty("stop")
    private var stop = JsonNullable.undefined<CreateAnswerRequestStop>()

    @JsonProperty("n")
    private var n = JsonNullable.undefined<Int>()

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
    fun model(model: String?): CreateAnswerRequest {
        this.model = model
        return this
    }

    fun question(question: String?): CreateAnswerRequest {
        this.question = question
        return this
    }

    fun examples(examples: MutableList<List<String>>?): CreateAnswerRequest {
        this.examples = examples
        return this
    }

    fun addExamplesItem(examplesItem: MutableList<String>): CreateAnswerRequest {
        examples!!.add(examplesItem)
        return this
    }

    /**
     * List of (question, answer) pairs that will help steer the model towards the tone and answer format you'd like. We recommend adding 2 to 3 examples.
     * @return examples
     */
    @Schema(
        name = "examples",
        example = "[['What is the capital of Canada?', 'Ottawa'], ['Which province is Ottawa in?', 'Ontario']]",
        description = "List of (question, answer) pairs that will help steer the model towards the tone and answer format you'd like. We recommend adding 2 to 3 examples.",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    fun getExamples(): @NotNull @Valid @Size(min = 1, max = 200) MutableList<List<String>>? {
        return examples
    }

    fun setExamples(examples: MutableList<List<String>>?) {
        this.examples = examples
    }

    fun examplesContext(examplesContext: String?): CreateAnswerRequest {
        this.examplesContext = examplesContext
        return this
    }

    fun documents(documents: MutableList<String>?): CreateAnswerRequest {
        this.documents = JsonNullable.of(documents)
        return this
    }

    fun addDocumentsItem(documentsItem: String): CreateAnswerRequest {
        if (!documents.isPresent) {
            documents = JsonNullable.of(null)
        }
        documents.get()!!.add(documentsItem)
        return this
    }

    fun file(file: String): CreateAnswerRequest {
        this.file = JsonNullable.of(file)
        return this
    }

    fun searchModel(searchModel: String): CreateAnswerRequest {
        this.searchModel = JsonNullable.of(searchModel)
        return this
    }

    fun maxRerank(maxRerank: Int): CreateAnswerRequest {
        this.maxRerank = JsonNullable.of(maxRerank)
        return this
    }

    fun temperature(temperature: BigDecimal): CreateAnswerRequest {
        this.temperature = JsonNullable.of(temperature)
        return this
    }

    /**
     * What [sampling temperature](https://towardsdatascience.com/how-to-sample-from-language-models-682bceb97277) to use. Higher values mean the model will take more risks and value 0 (argmax sampling) works better for scenarios with a well-defined answer.
     * @return temperature
     */
    @Schema(
        name = "temperature",
        description = "What [sampling temperature](https://towardsdatascience.com/how-to-sample-from-language-models-682bceb97277) to use. Higher values mean the model will take more risks and value 0 (argmax sampling) works better for scenarios with a well-defined answer.",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    fun getTemperature(): @Valid JsonNullable<BigDecimal>? {
        return temperature
    }

    fun setTemperature(temperature: JsonNullable<BigDecimal>) {
        this.temperature = temperature
    }

    fun logprobs(logprobs: Int): CreateAnswerRequest {
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

    fun maxTokens(maxTokens: Int): CreateAnswerRequest {
        this.maxTokens = JsonNullable.of(maxTokens)
        return this
    }

    fun stop(stop: CreateAnswerRequestStop): CreateAnswerRequest {
        this.stop = JsonNullable.of(stop)
        return this
    }

    /**
     * Get stop
     * @return stop
     */
    @Schema(name = "stop", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    fun getStop(): @Valid JsonNullable<CreateAnswerRequestStop>? {
        return stop
    }

    fun setStop(stop: JsonNullable<CreateAnswerRequestStop>) {
        this.stop = stop
    }

    fun n(n: Int): CreateAnswerRequest {
        this.n = JsonNullable.of(n)
        return this
    }

    /**
     * How many answers to generate for each question.
     * minimum: 1
     * maximum: 10
     * @return n
     */
    @Schema(
        name = "n",
        description = "How many answers to generate for each question.",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    fun getN(): @Min(1) @Max(10) JsonNullable<Int>? {
        return n
    }

    fun setN(n: JsonNullable<Int>) {
        this.n = n
    }

    fun logitBias(logitBias: Any): CreateAnswerRequest {
        this.logitBias = JsonNullable.of(logitBias)
        return this
    }

    fun returnMetadata(returnMetadata: Boolean): CreateAnswerRequest {
        this.returnMetadata = JsonNullable.of(returnMetadata)
        return this
    }

    fun returnPrompt(returnPrompt: Boolean): CreateAnswerRequest {
        this.returnPrompt = JsonNullable.of(returnPrompt)
        return this
    }

    fun expand(expand: MutableList<Any>?): CreateAnswerRequest {
        this.expand = JsonNullable.of(expand)
        return this
    }

    fun addExpandItem(expandItem: Any): CreateAnswerRequest {
        if (!expand.isPresent) {
            expand = JsonNullable.of(null)
        }
        expand.get()!!.add(expandItem)
        return this
    }

    fun user(user: String?): CreateAnswerRequest {
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
        val createAnswerRequest = other as CreateAnswerRequest
        return model == createAnswerRequest.model && question == createAnswerRequest.question && examples == createAnswerRequest.examples && examplesContext == createAnswerRequest.examplesContext &&
                equalsNullable(documents, createAnswerRequest.documents) &&
                equalsNullable(file, createAnswerRequest.file) &&
                equalsNullable(searchModel, createAnswerRequest.searchModel) &&
                equalsNullable(maxRerank, createAnswerRequest.maxRerank) &&
                equalsNullable(temperature, createAnswerRequest.temperature) &&
                equalsNullable(logprobs, createAnswerRequest.logprobs) &&
                equalsNullable(maxTokens, createAnswerRequest.maxTokens) &&
                equalsNullable(stop, createAnswerRequest.stop) &&
                equalsNullable(n, createAnswerRequest.n) &&
                equalsNullable(logitBias, createAnswerRequest.logitBias) &&
                equalsNullable(returnMetadata, createAnswerRequest.returnMetadata) &&
                equalsNullable(returnPrompt, createAnswerRequest.returnPrompt) &&
                equalsNullable(expand, createAnswerRequest.expand) && user == createAnswerRequest.user
    }

    override fun hashCode(): Int {
        return Objects.hash(
            model,
            question,
            examples,
            examplesContext,
            hashCodeNullable(documents),
            hashCodeNullable(file),
            hashCodeNullable(searchModel),
            hashCodeNullable(maxRerank),
            hashCodeNullable(temperature),
            hashCodeNullable(logprobs),
            hashCodeNullable(maxTokens),
            hashCodeNullable(stop),
            hashCodeNullable(n),
            hashCodeNullable(logitBias),
            hashCodeNullable(returnMetadata),
            hashCodeNullable(returnPrompt),
            hashCodeNullable(expand),
            user
        )
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class CreateAnswerRequest {\n")
        sb.append("    model: ").append(toIndentedString(model)).append("\n")
        sb.append("    question: ").append(toIndentedString(question)).append("\n")
        sb.append("    examples: ").append(toIndentedString(examples)).append("\n")
        sb.append("    examplesContext: ").append(toIndentedString(examplesContext)).append("\n")
        sb.append("    documents: ").append(toIndentedString(documents)).append("\n")
        sb.append("    file: ").append(toIndentedString(file)).append("\n")
        sb.append("    searchModel: ").append(toIndentedString(searchModel)).append("\n")
        sb.append("    maxRerank: ").append(toIndentedString(maxRerank)).append("\n")
        sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n")
        sb.append("    logprobs: ").append(toIndentedString(logprobs)).append("\n")
        sb.append("    maxTokens: ").append(toIndentedString(maxTokens)).append("\n")
        sb.append("    stop: ").append(toIndentedString(stop)).append("\n")
        sb.append("    n: ").append(toIndentedString(n)).append("\n")
        sb.append("    logitBias: ").append(toIndentedString(logitBias)).append("\n")
        sb.append("    returnMetadata: ").append(toIndentedString(returnMetadata)).append("\n")
        sb.append("    returnPrompt: ").append(toIndentedString(returnPrompt)).append("\n")
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