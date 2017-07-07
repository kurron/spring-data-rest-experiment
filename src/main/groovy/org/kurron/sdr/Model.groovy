package org.kurron.sdr

import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.annotation.Version
import org.springframework.data.mongodb.core.mapping.Document

/**
 * MongoDB document that holds different types of data that can be used for benchmarking.
 */
@Document
class Model {

    @Id
    UUID primaryKey

    @Version
    Long etag

    @LastModifiedDate
    Date lastModified

    User user

    Permissions permissions
}
