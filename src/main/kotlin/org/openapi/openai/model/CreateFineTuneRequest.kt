package org.openapi.openai.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.annotation.Generated
import jakarta.validation.Valid
import jakarta.validation.constraints.Size
import org.openapitools.jackson.nullable.JsonNullable
import java.math.BigDecimal
import java.util.*

/**
 * CreateFineTuneRequest
 */
@Generated(
    value = ["org.openapitools.codegen.languages.SpringCodegen"],
    date = "2023-02-15T20:47:29.471771-08:00[America/Vancouver]"
)
class CreateFineTuneRequest {
    /**
     * The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file, where each training example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details.
     * @return trainingFile
     */
    @get:Schema(
        name = "training_file",
        example = "file-ajSREls59WBbvgSzJSVWxMCB",
        description = "The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file, where each training example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details. ",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("training_file")
    var trainingFile: String? = null

    /**
     * The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the [fine-tuning results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model). Your train and validation data should be mutually exclusive.  Your dataset must be formatted as a JSONL file, where each validation example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details.
     * @return validationFile
     */
    @get:Schema(
        name = "validation_file",
        example = "file-XjSREls59WBbvgSzJSVWxMCa",
        description = "The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the [fine-tuning results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model). Your train and validation data should be mutually exclusive.  Your dataset must be formatted as a JSONL file, where each validation example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details. ",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("validation_file")
    var validationFile = JsonNullable.undefined<String>()

    /**
     * The name of the base model to fine-tune. You can select one of \"ada\", \"babbage\", \"curie\", \"davinci\", or a fine-tuned model created after 2022-04-21. To learn more about these models, see the [Models](https://beta.openai.com/docs/models) documentation.
     * @return model
     */
    @get:Schema(
        name = "model",
        description = "The name of the base model to fine-tune. You can select one of \"ada\", \"babbage\", \"curie\", \"davinci\", or a fine-tuned model created after 2022-04-21. To learn more about these models, see the [Models](https://beta.openai.com/docs/models) documentation. ",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("model")
    var model = JsonNullable.undefined<String>()

    @JsonProperty("n_epochs")
    private var nEpochs = JsonNullable.undefined<Int>()

    /**
     * The batch size to use for training. The batch size is the number of training examples used to train a single forward and backward pass.  By default, the batch size will be dynamically configured to be ~0.2% of the number of examples in the training set, capped at 256 - in general, we've found that larger batch sizes tend to work better for larger datasets.
     * @return batchSize
     */
    @get:Schema(
        name = "batch_size",
        description = "The batch size to use for training. The batch size is the number of training examples used to train a single forward and backward pass.  By default, the batch size will be dynamically configured to be ~0.2% of the number of examples in the training set, capped at 256 - in general, we've found that larger batch sizes tend to work better for larger datasets. ",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("batch_size")
    var batchSize = JsonNullable.undefined<Int>()

    @JsonProperty("learning_rate_multiplier")
    private var learningRateMultiplier = JsonNullable.undefined<BigDecimal>()

    @JsonProperty("prompt_loss_weight")
    private var promptLossWeight = JsonNullable.undefined<BigDecimal>()

    /**
     * If set, we calculate classification-specific metrics such as accuracy and F-1 score using the validation set at the end of every epoch. These metrics can be viewed in the [results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model).  In order to compute classification metrics, you must provide a `validation_file`. Additionally, you must specify `classification_n_classes` for multiclass classification or `classification_positive_class` for binary classification.
     * @return computeClassificationMetrics
     */
    @get:Schema(
        name = "compute_classification_metrics",
        description = "If set, we calculate classification-specific metrics such as accuracy and F-1 score using the validation set at the end of every epoch. These metrics can be viewed in the [results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model).  In order to compute classification metrics, you must provide a `validation_file`. Additionally, you must specify `classification_n_classes` for multiclass classification or `classification_positive_class` for binary classification. ",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("compute_classification_metrics")
    var computeClassificationMetrics = JsonNullable.undefined<Boolean>()

    /**
     * The number of classes in a classification task.  This parameter is required for multiclass classification.
     * @return classificationNClasses
     */
    @get:Schema(
        name = "classification_n_classes",
        description = "The number of classes in a classification task.  This parameter is required for multiclass classification. ",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("classification_n_classes")
    var classificationNClasses = JsonNullable.undefined<Int>()

    /**
     * The positive class in binary classification.  This parameter is needed to generate precision, recall, and F1 metrics when doing binary classification.
     * @return classificationPositiveClass
     */
    @get:Schema(
        name = "classification_positive_class",
        description = "The positive class in binary classification.  This parameter is needed to generate precision, recall, and F1 metrics when doing binary classification. ",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("classification_positive_class")
    var classificationPositiveClass = JsonNullable.undefined<String>()

    /**
     * If this is provided, we calculate F-beta scores at the specified beta values. The F-beta score is a generalization of F-1 score. This is only used for binary classification.  With a beta of 1 (i.e. the F-1 score), precision and recall are given the same weight. A larger beta score puts more weight on recall and less on precision. A smaller beta score puts more weight on precision and less on recall.
     * @return classificationBetas
     */
    @get:Schema(
        name = "classification_betas",
        example = "[0.6,1,1.5,2]",
        description = "If this is provided, we calculate F-beta scores at the specified beta values. The F-beta score is a generalization of F-1 score. This is only used for binary classification.  With a beta of 1 (i.e. the F-1 score), precision and recall are given the same weight. A larger beta score puts more weight on recall and less on precision. A smaller beta score puts more weight on precision and less on recall. ",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("classification_betas")
    var classificationBetas: @Valid JsonNullable<MutableList<BigDecimal>> = JsonNullable.undefined()

    @JsonProperty("suffix")
    private var suffix = JsonNullable.undefined<String>()
    fun trainingFile(trainingFile: String?): CreateFineTuneRequest {
        this.trainingFile = trainingFile
        return this
    }

    fun validationFile(validationFile: String): CreateFineTuneRequest {
        this.validationFile = JsonNullable.of(validationFile)
        return this
    }

    fun model(model: String): CreateFineTuneRequest {
        this.model = JsonNullable.of(model)
        return this
    }

    fun nEpochs(nEpochs: Int): CreateFineTuneRequest {
        this.nEpochs = JsonNullable.of(nEpochs)
        return this
    }

    /**
     * The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset.
     * @return nEpochs
     */
    @Schema(
        name = "n_epochs",
        description = "The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. ",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    fun getnEpochs(): JsonNullable<Int> {
        return nEpochs
    }

    fun setnEpochs(nEpochs: JsonNullable<Int>) {
        this.nEpochs = nEpochs
    }

    fun batchSize(batchSize: Int): CreateFineTuneRequest {
        this.batchSize = JsonNullable.of(batchSize)
        return this
    }

    fun learningRateMultiplier(learningRateMultiplier: BigDecimal): CreateFineTuneRequest {
        this.learningRateMultiplier = JsonNullable.of(learningRateMultiplier)
        return this
    }

    /**
     * The learning rate multiplier to use for training. The fine-tuning learning rate is the original learning rate used for pretraining multiplied by this value.  By default, the learning rate multiplier is the 0.05, 0.1, or 0.2 depending on final `batch_size` (larger learning rates tend to perform better with larger batch sizes). We recommend experimenting with values in the range 0.02 to 0.2 to see what produces the best results.
     * @return learningRateMultiplier
     */
    @Schema(
        name = "learning_rate_multiplier",
        description = "The learning rate multiplier to use for training. The fine-tuning learning rate is the original learning rate used for pretraining multiplied by this value.  By default, the learning rate multiplier is the 0.05, 0.1, or 0.2 depending on final `batch_size` (larger learning rates tend to perform better with larger batch sizes). We recommend experimenting with values in the range 0.02 to 0.2 to see what produces the best results. ",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    fun getLearningRateMultiplier(): @Valid JsonNullable<BigDecimal>? {
        return learningRateMultiplier
    }

    fun setLearningRateMultiplier(learningRateMultiplier: JsonNullable<BigDecimal>) {
        this.learningRateMultiplier = learningRateMultiplier
    }

    fun promptLossWeight(promptLossWeight: BigDecimal): CreateFineTuneRequest {
        this.promptLossWeight = JsonNullable.of(promptLossWeight)
        return this
    }

    /**
     * The weight to use for loss on the prompt tokens. This controls how much the model tries to learn to generate the prompt (as compared to the completion which always has a weight of 1.0), and can add a stabilizing effect to training when completions are short.  If prompts are extremely long (relative to completions), it may make sense to reduce this weight so as to avoid over-prioritizing learning the prompt.
     * @return promptLossWeight
     */
    @Schema(
        name = "prompt_loss_weight",
        description = "The weight to use for loss on the prompt tokens. This controls how much the model tries to learn to generate the prompt (as compared to the completion which always has a weight of 1.0), and can add a stabilizing effect to training when completions are short.  If prompts are extremely long (relative to completions), it may make sense to reduce this weight so as to avoid over-prioritizing learning the prompt. ",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    fun getPromptLossWeight(): @Valid JsonNullable<BigDecimal>? {
        return promptLossWeight
    }

    fun setPromptLossWeight(promptLossWeight: JsonNullable<BigDecimal>) {
        this.promptLossWeight = promptLossWeight
    }

    fun computeClassificationMetrics(computeClassificationMetrics: Boolean): CreateFineTuneRequest {
        this.computeClassificationMetrics = JsonNullable.of(computeClassificationMetrics)
        return this
    }

    fun classificationNClasses(classificationNClasses: Int): CreateFineTuneRequest {
        this.classificationNClasses = JsonNullable.of(classificationNClasses)
        return this
    }

    fun classificationPositiveClass(classificationPositiveClass: String): CreateFineTuneRequest {
        this.classificationPositiveClass = JsonNullable.of(classificationPositiveClass)
        return this
    }

    fun classificationBetas(classificationBetas: MutableList<BigDecimal>?): CreateFineTuneRequest {
        this.classificationBetas = JsonNullable.of(classificationBetas)
        return this
    }

    fun addClassificationBetasItem(classificationBetasItem: BigDecimal): CreateFineTuneRequest {
        if (!classificationBetas.isPresent) {
            classificationBetas = JsonNullable.of(null)
        }
        classificationBetas.get()!!.add(classificationBetasItem)
        return this
    }

    fun suffix(suffix: String): CreateFineTuneRequest {
        this.suffix = JsonNullable.of(suffix)
        return this
    }

    /**
     * A string of up to 40 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ada:ft-your-org:custom-model-name-2022-02-15-04-21-04`.
     * @return suffix
     */
    @Schema(
        name = "suffix",
        description = "A string of up to 40 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ada:ft-your-org:custom-model-name-2022-02-15-04-21-04`. ",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    fun getSuffix(): @Size(min = 1, max = 40) JsonNullable<String>? {
        return suffix
    }

    fun setSuffix(suffix: JsonNullable<String>) {
        this.suffix = suffix
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val createFineTuneRequest = other as CreateFineTuneRequest
        return trainingFile == createFineTuneRequest.trainingFile &&
                equalsNullable(validationFile, createFineTuneRequest.validationFile) &&
                equalsNullable(model, createFineTuneRequest.model) &&
                equalsNullable(nEpochs, createFineTuneRequest.nEpochs) &&
                equalsNullable(batchSize, createFineTuneRequest.batchSize) &&
                equalsNullable(learningRateMultiplier, createFineTuneRequest.learningRateMultiplier) &&
                equalsNullable(promptLossWeight, createFineTuneRequest.promptLossWeight) &&
                equalsNullable(computeClassificationMetrics, createFineTuneRequest.computeClassificationMetrics) &&
                equalsNullable(classificationNClasses, createFineTuneRequest.classificationNClasses) &&
                equalsNullable(classificationPositiveClass, createFineTuneRequest.classificationPositiveClass) &&
                equalsNullable(classificationBetas, createFineTuneRequest.classificationBetas) &&
                equalsNullable(suffix, createFineTuneRequest.suffix)
    }

    override fun hashCode(): Int {
        return Objects.hash(
            trainingFile,
            hashCodeNullable(validationFile),
            hashCodeNullable(model),
            hashCodeNullable(nEpochs),
            hashCodeNullable(batchSize),
            hashCodeNullable(learningRateMultiplier),
            hashCodeNullable(promptLossWeight),
            hashCodeNullable(computeClassificationMetrics),
            hashCodeNullable(classificationNClasses),
            hashCodeNullable(classificationPositiveClass),
            hashCodeNullable(classificationBetas),
            hashCodeNullable(suffix)
        )
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class CreateFineTuneRequest {\n")
        sb.append("    trainingFile: ").append(toIndentedString(trainingFile)).append("\n")
        sb.append("    validationFile: ").append(toIndentedString(validationFile)).append("\n")
        sb.append("    model: ").append(toIndentedString(model)).append("\n")
        sb.append("    nEpochs: ").append(toIndentedString(nEpochs)).append("\n")
        sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n")
        sb.append("    learningRateMultiplier: ").append(toIndentedString(learningRateMultiplier)).append("\n")
        sb.append("    promptLossWeight: ").append(toIndentedString(promptLossWeight)).append("\n")
        sb.append("    computeClassificationMetrics: ").append(toIndentedString(computeClassificationMetrics))
            .append("\n")
        sb.append("    classificationNClasses: ").append(toIndentedString(classificationNClasses)).append("\n")
        sb.append("    classificationPositiveClass: ").append(toIndentedString(classificationPositiveClass))
            .append("\n")
        sb.append("    classificationBetas: ").append(toIndentedString(classificationBetas)).append("\n")
        sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n")
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