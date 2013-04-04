package org.kurron.jpa;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
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
        for( int i = 0; i < 5; i++ )
        {
            final Order entity = new Order();
            entity.setCustomer( Integer.toHexString( random.nextInt( Integer.MAX_VALUE ) ).toUpperCase() );
            entity.setItems( createItems() );
            orderRepository.save( entity );
        }
    }

    private List<Item> createItems() {
        final List<Item> items = new ArrayList<>( 5 );
        for( int i = 0; i < 5; i++ )
        {
            items.add( newItem() );
        }
        return items;
    }

    private Item newItem() {
        final Item item = new Item();
        item.setPrice(random.nextDouble());
        item.setQuantity(random.nextInt(Integer.MAX_VALUE));
        item.setProduct(Integer.toHexString(random.nextInt(Integer.MAX_VALUE)).toUpperCase());
        return item;
    }
}
