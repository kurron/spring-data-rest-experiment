package org.kurron.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Spring JPA will proxy this interface for me.
 */
public interface ItemRepository extends PagingAndSortingRepository<Item, Long> {
}
