package org.kurron.jpa;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Will load the database when the application starts.
 */
@Component
public class DataLoader implements InitializingBean {

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private OrderRepository orderRepository;

    final Random random = new Random();

    @Override
    public void afterPropertiesSet() throws Exception {
        for( int i = 0; i < 100; i++ )
        {
            final Item entity = newItem();
            itemRepository.save(entity);
        }
    }

    private Item newItem() {
        final Item entity = new Item();
        entity.setPrice( random.nextDouble() );
        entity.setQuantity(random.nextInt(Integer.MAX_VALUE));
        entity.setProduct( Integer.toHexString( random.nextInt( Integer.MAX_VALUE ) ).toUpperCase() );
        return entity;
    }
}
