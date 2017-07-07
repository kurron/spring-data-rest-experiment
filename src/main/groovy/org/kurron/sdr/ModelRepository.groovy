package org.kurron.sdr

import org.springframework.data.repository.PagingAndSortingRepository

/**
 * Handles interaction with MongoDB.
 */
interface ModelRepository extends PagingAndSortingRepository<Model, UUID> {}