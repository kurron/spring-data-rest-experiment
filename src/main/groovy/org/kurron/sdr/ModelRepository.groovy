package org.kurron.sdr

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RestResource
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMethod

/**
 * Handles interaction with MongoDB.  We hide any mutating methods. This is a read-only interface.
 */
@SuppressWarnings("GroovyUnusedDeclaration")
@CrossOrigin( methods = [RequestMethod.GET, RequestMethod.HEAD, RequestMethod.OPTIONS])
interface ModelRepository extends PagingAndSortingRepository<Model, UUID> {

    // because of generics, you cannot have @Override here
    @RestResource(exported = false)
    Model save(Model entity)

    // because of generics, you cannot have @Override here
    @RestResource(exported = false)
    Iterable<Model> save(Iterable<Model> entities)

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