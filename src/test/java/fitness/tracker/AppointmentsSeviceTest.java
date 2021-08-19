package fitness.tracker;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.in28minutes.unittesting.unittesting.model.Item;

@ExtendWith(MockitoExtension.class)
class AppointmentsSeviceTest {
	
	@Mock
	AppointmentRepository repo;
	
	@InjectMocks
	AppointmentsSevice appointments;

	@Test
	void testSaveAppointment() {
		
		Appointment app = new Appointment(1, false, 2, 800);
		when(repo.save(app)).thenReturn(app);
		Appointment saved = appointments.saveAppointment(app);
		assertEquals(app.getID(),saved.getID());
		
		//fail("Not yet implemented");
	}

}
