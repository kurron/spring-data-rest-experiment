package org.kurron.sdr

import org.springframework.data.repository.CrudRepository

/**
 * Handles interaction with MongoDB.
 */
interface ModelRepository extends CrudRepository<Model, UUID> {}