package org.kurron.sdr

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RestResource

/**
 * Handles interaction with MongoDB.
 */
interface ModelRepository extends PagingAndSortingRepository<Model, UUID> {

    @Override
    @RestResource(exported = false)
    void delete(UUID uuid)

    @Override
    @RestResource(exported = false)
    void delete(Model entity)

    @Override
    @RestResource(exported = false)
    void delete(Iterable<? extends Model> entities)

    @Override
    @RestResource(exported = false)
    void deleteAll()
}