package org.openapi.openai.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.annotation.Generated
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import org.openapitools.jackson.nullable.JsonNullable
import java.util.*

/**
 * FineTune
 */
@Generated(
    value = ["org.openapitools.codegen.languages.SpringCodegen"],
    date = "2023-02-15T20:47:29.471771-08:00[America/Vancouver]"
)
class FineTune {
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
     * Get _object
     * @return _object
     */
    @get:Schema(
        name = "object",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("object")
    var `object`: String? = null

    /**
     * Get createdAt
     * @return createdAt
     */
    @get:Schema(
        name = "created_at",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("created_at")
    var createdAt: Int? = null

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @get:Schema(
        name = "updated_at",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("updated_at")
    var updatedAt: Int? = null

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

    @JsonProperty("fine_tuned_model")
    private var fineTunedModel = JsonNullable.undefined<String>()

    /**
     * Get organizationId
     * @return organizationId
     */
    @get:Schema(
        name = "organization_id",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("organization_id")
    var organizationId: String? = null

    /**
     * Get status
     * @return status
     */
    @get:Schema(
        name = "status",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("status")
    var status: String? = null

    /**
     * Get hyperparams
     * @return hyperparams
     */
    @get:Schema(
        name = "hyperparams",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("hyperparams")
    var hyperparams: Any? = null

    @JsonProperty("training_files")
    private var trainingFiles: @Valid MutableList<OpenAIFile>? = ArrayList()

    @JsonProperty("validation_files")
    private var validationFiles: @Valid MutableList<OpenAIFile>? = ArrayList()

    @JsonProperty("result_files")
    private var resultFiles: @Valid MutableList<OpenAIFile>? = ArrayList()

    @JsonProperty("events")
    private var events: @Valid MutableList<FineTuneEvent>? = null
    fun id(id: String?): FineTune {
        this.id = id
        return this
    }

    fun _object(_object: String?): FineTune {
        `object` = _object
        return this
    }

    fun createdAt(createdAt: Int?): FineTune {
        this.createdAt = createdAt
        return this
    }

    fun updatedAt(updatedAt: Int?): FineTune {
        this.updatedAt = updatedAt
        return this
    }

    fun model(model: String?): FineTune {
        this.model = model
        return this
    }

    fun fineTunedModel(fineTunedModel: String): FineTune {
        this.fineTunedModel = JsonNullable.of(fineTunedModel)
        return this
    }

    /**
     * Get fineTunedModel
     * @return fineTunedModel
     */
    @Schema(name = "fine_tuned_model", requiredMode = Schema.RequiredMode.REQUIRED)
    fun getFineTunedModel(): @NotNull JsonNullable<String>? {
        return fineTunedModel
    }

    fun setFineTunedModel(fineTunedModel: JsonNullable<String>) {
        this.fineTunedModel = fineTunedModel
    }

    fun organizationId(organizationId: String?): FineTune {
        this.organizationId = organizationId
        return this
    }

    fun status(status: String?): FineTune {
        this.status = status
        return this
    }

    fun hyperparams(hyperparams: Any?): FineTune {
        this.hyperparams = hyperparams
        return this
    }

    fun trainingFiles(trainingFiles: MutableList<OpenAIFile>?): FineTune {
        this.trainingFiles = trainingFiles
        return this
    }

    fun addTrainingFilesItem(trainingFilesItem: OpenAIFile): FineTune {
        trainingFiles!!.add(trainingFilesItem)
        return this
    }

    /**
     * Get trainingFiles
     * @return trainingFiles
     */
    @Schema(name = "training_files", requiredMode = Schema.RequiredMode.REQUIRED)
    fun getTrainingFiles(): @NotNull @Valid MutableList<OpenAIFile>? {
        return trainingFiles
    }

    fun setTrainingFiles(trainingFiles: MutableList<OpenAIFile>?) {
        this.trainingFiles = trainingFiles
    }

    fun validationFiles(validationFiles: MutableList<OpenAIFile>?): FineTune {
        this.validationFiles = validationFiles
        return this
    }

    fun addValidationFilesItem(validationFilesItem: OpenAIFile): FineTune {
        validationFiles!!.add(validationFilesItem)
        return this
    }

    /**
     * Get validationFiles
     * @return validationFiles
     */
    @Schema(name = "validation_files", requiredMode = Schema.RequiredMode.REQUIRED)
    fun getValidationFiles(): @NotNull @Valid MutableList<OpenAIFile>? {
        return validationFiles
    }

    fun setValidationFiles(validationFiles: MutableList<OpenAIFile>?) {
        this.validationFiles = validationFiles
    }

    fun resultFiles(resultFiles: MutableList<OpenAIFile>?): FineTune {
        this.resultFiles = resultFiles
        return this
    }

    fun addResultFilesItem(resultFilesItem: OpenAIFile): FineTune {
        resultFiles!!.add(resultFilesItem)
        return this
    }

    /**
     * Get resultFiles
     * @return resultFiles
     */
    @Schema(name = "result_files", requiredMode = Schema.RequiredMode.REQUIRED)
    fun getResultFiles(): @NotNull @Valid MutableList<OpenAIFile>? {
        return resultFiles
    }

    fun setResultFiles(resultFiles: MutableList<OpenAIFile>?) {
        this.resultFiles = resultFiles
    }

    fun events(events: MutableList<FineTuneEvent>?): FineTune {
        this.events = events
        return this
    }

    fun addEventsItem(eventsItem: FineTuneEvent): FineTune {
        if (events == null) {
            events = ArrayList()
        }
        events!!.add(eventsItem)
        return this
    }

    /**
     * Get events
     * @return events
     */
    @Schema(name = "events", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    fun getEvents(): @Valid MutableList<FineTuneEvent>? {
        return events
    }

    fun setEvents(events: MutableList<FineTuneEvent>?) {
        this.events = events
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val fineTune = other as FineTune
        return id == fineTune.id && `object` == fineTune.`object` && createdAt == fineTune.createdAt && updatedAt == fineTune.updatedAt && model == fineTune.model && fineTunedModel == fineTune.fineTunedModel && organizationId == fineTune.organizationId && status == fineTune.status && hyperparams == fineTune.hyperparams && trainingFiles == fineTune.trainingFiles && validationFiles == fineTune.validationFiles && resultFiles == fineTune.resultFiles && events == fineTune.events
    }

    override fun hashCode(): Int {
        return Objects.hash(
            id,
            `object`,
            createdAt,
            updatedAt,
            model,
            fineTunedModel,
            organizationId,
            status,
            hyperparams,
            trainingFiles,
            validationFiles,
            resultFiles,
            events
        )
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class FineTune {\n")
        sb.append("    id: ").append(toIndentedString(id)).append("\n")
        sb.append("    _object: ").append(toIndentedString(`object`)).append("\n")
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n")
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n")
        sb.append("    model: ").append(toIndentedString(model)).append("\n")
        sb.append("    fineTunedModel: ").append(toIndentedString(fineTunedModel)).append("\n")
        sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n")
        sb.append("    status: ").append(toIndentedString(status)).append("\n")
        sb.append("    hyperparams: ").append(toIndentedString(hyperparams)).append("\n")
        sb.append("    trainingFiles: ").append(toIndentedString(trainingFiles)).append("\n")
        sb.append("    validationFiles: ").append(toIndentedString(validationFiles)).append("\n")
        sb.append("    resultFiles: ").append(toIndentedString(resultFiles)).append("\n")
        sb.append("    events: ").append(toIndentedString(events)).append("\n")
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