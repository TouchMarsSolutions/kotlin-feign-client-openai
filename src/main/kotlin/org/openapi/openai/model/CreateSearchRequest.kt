package org.openapi.openai.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.annotation.Generated
import jakarta.validation.Valid
import jakarta.validation.constraints.Min
import org.openapitools.jackson.nullable.JsonNullable
import java.util.*

/**
 * CreateSearchRequest
 */
@Generated(
    value = ["org.openapitools.codegen.languages.SpringCodegen"],
    date = "2023-02-15T20:47:29.471771-08:00[America/Vancouver]"
)
class CreateSearchRequest {
    /**
     * Query to search against the documents.
     * @return query
     */
    @get:Schema(
        name = "query",
        example = "the president",
        description = "Query to search against the documents.",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    @JsonProperty("query")
    var query: String? = null

    /**
     * Up to 200 documents to search over, provided as a list of strings.  The maximum document length (in tokens) is 2034 minus the number of tokens in the query.  You should specify either `documents` or a `file`, but not both.
     * @return documents
     */
    @get:Schema(
        name = "documents",
        example = "['White House', 'hospital', 'school']",
        description = "Up to 200 documents to search over, provided as a list of strings.  The maximum document length (in tokens) is 2034 minus the number of tokens in the query.  You should specify either `documents` or a `file`, but not both. ",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("documents")
    var documents: @Valid JsonNullable<MutableList<String>> = JsonNullable.undefined()

    /**
     * The ID of an uploaded file that contains documents to search over.  You should specify either `documents` or a `file`, but not both.
     * @return file
     */
    @get:Schema(
        name = "file",
        description = "The ID of an uploaded file that contains documents to search over.  You should specify either `documents` or a `file`, but not both. ",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("file")
    var file = JsonNullable.undefined<String>()

    @JsonProperty("max_rerank")
    private var maxRerank = JsonNullable.undefined<Int>()

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
    fun query(query: String?): CreateSearchRequest {
        this.query = query
        return this
    }

    fun documents(documents: MutableList<String>?): CreateSearchRequest {
        this.documents = JsonNullable.of(documents)
        return this
    }

    fun addDocumentsItem(documentsItem: String): CreateSearchRequest {
        if (!documents.isPresent) {
            documents = JsonNullable.of(null)
        }
        documents.get()!!.add(documentsItem)
        return this
    }

    fun file(file: String): CreateSearchRequest {
        this.file = JsonNullable.of(file)
        return this
    }

    fun maxRerank(maxRerank: Int): CreateSearchRequest {
        this.maxRerank = JsonNullable.of(maxRerank)
        return this
    }

    /**
     * The maximum number of documents to be re-ranked and returned by search.  This flag only takes effect when `file` is set.
     * minimum: 1
     * @return maxRerank
     */
    @Schema(
        name = "max_rerank",
        description = "The maximum number of documents to be re-ranked and returned by search.  This flag only takes effect when `file` is set. ",
        requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    fun getMaxRerank(): @Min(1) JsonNullable<Int>? {
        return maxRerank
    }

    fun setMaxRerank(maxRerank: JsonNullable<Int>) {
        this.maxRerank = maxRerank
    }

    fun returnMetadata(returnMetadata: Boolean): CreateSearchRequest {
        this.returnMetadata = JsonNullable.of(returnMetadata)
        return this
    }

    fun user(user: String?): CreateSearchRequest {
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
        val createSearchRequest = other as CreateSearchRequest
        return query == createSearchRequest.query &&
                equalsNullable(documents, createSearchRequest.documents) &&
                equalsNullable(file, createSearchRequest.file) &&
                equalsNullable(maxRerank, createSearchRequest.maxRerank) &&
                equalsNullable(returnMetadata, createSearchRequest.returnMetadata) && user == createSearchRequest.user
    }

    override fun hashCode(): Int {
        return Objects.hash(
            query,
            hashCodeNullable(documents),
            hashCodeNullable(file),
            hashCodeNullable(maxRerank),
            hashCodeNullable(returnMetadata),
            user
        )
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class CreateSearchRequest {\n")
        sb.append("    query: ").append(toIndentedString(query)).append("\n")
        sb.append("    documents: ").append(toIndentedString(documents)).append("\n")
        sb.append("    file: ").append(toIndentedString(file)).append("\n")
        sb.append("    maxRerank: ").append(toIndentedString(maxRerank)).append("\n")
        sb.append("    returnMetadata: ").append(toIndentedString(returnMetadata)).append("\n")
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