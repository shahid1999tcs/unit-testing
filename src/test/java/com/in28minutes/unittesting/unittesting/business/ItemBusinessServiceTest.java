package com.in28minutes.unittesting.unittesting.business;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
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
	void testSaveItem() throws ParameterMissingException {
		Item item1 = new Item(2, "item2", 20, 20);
		when(repo.save(item1)).thenReturn(item1);
		Item item2 = business.saveItem(item1);
		assertEquals(item1.getName(),item2.getName());
	}
	
	@Test
	void testSaveItemWhenNameIsNull() {
		
		try {
			Item item = business.saveItem(new Item(2, null, 20, 20));
		} catch (Exception e) {
			assertNotNull(e);
			assertEquals(ParameterMissingException.class, e.getClass());
		}
	}

	@Test
	void testRetreiveHardcodedItem() {
		ItemBusinessService bussinessService = new ItemBusinessService();
		Item item = bussinessService.retreiveHardcodedItem();
		assertNotNull(item);
		assertEquals(1, item.getId());
		
	}
	
	@Test
	void testEquals() {
		Buscuit buscuit = new Buscuit("Oreo",2);
		Buscuit buscuit2 = new Buscuit("Oreo",2);
		assertThat(buscuit, equalTo(buscuit2));
	}

	@Test
	void testRetrieveAllItems() {
		when(repo.findAll()).thenReturn(Arrays.asList(new Item(2, "item2", 20, 20)));
		business.retrieveAllItems();
		
	}

}
