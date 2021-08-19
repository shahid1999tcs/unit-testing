package fitness.tracker;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.unittesting.unittesting.model.Item;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer>{

}
