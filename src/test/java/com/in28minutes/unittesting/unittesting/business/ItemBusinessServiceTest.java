package com.in28minutes.unittesting.unittesting.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.in28minutes.unittesting.unittesting.data.ItemRepository;
import com.in28minutes.unittesting.unittesting.model.Item;

@ExtendWith(MockitoExtension.class)
class ItemBusinessServiceTest {
	
	@Mock
	ItemRepository repo;
	
	@InjectMocks
	ItemBusinessService business;
	
	@Test
	void testSaveItem() {
		when(repo.save(new Item(2, "item2", 20, 20))).thenReturn(new Item(2, "item2", 20, 20));
		Item item2 = business.saveItem(new Item(2, "item2", 20, 20));
		assertEquals(2,item2.getId());
	}

	@Test
	void testRetreiveHardcodedItem() {
		ItemBusinessService bussinessService = new ItemBusinessService();
		Item item = bussinessService.retreiveHardcodedItem();
		assertNotNull(item);
		assertEquals(new Item(1, "Ball", 10, 100), item);
		
	}

	@Test
	void testRetrieveAllItems() {
		when(repo.findAll()).thenReturn(Arrays.asList(new Item(2, "item2", 20, 20)));
		business.retrieveAllItems();
		
	}

}
