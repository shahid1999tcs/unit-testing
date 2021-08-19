package fitness.tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28minutes.unittesting.unittesting.data.ItemRepository;

@Component
public class AppointmentsSevice {
	
	public void setRepository(AppointmentRepository repository) {
		this.repository = repository;
	}

	@Autowired
	private AppointmentRepository repository;
	
	
	public Appointment saveAppointment(Appointment app1) {
		
		return repository.save(app1);
		
	}
	
}
