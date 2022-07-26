package proyecto.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.demo.entities.Staff;
import proyecto.demo.repository.StaffRepository;

@Service
public class StaffService {

	@Autowired
	private StaffRepository repo;
	
	public Staff obtenerPorId(Integer staffId) {
		
		Optional<Staff> staff = repo.findById(staffId);
		
		return staff.get();
	}
	
	public List<Staff> findAll() {
		return repo.findAll();
	}
}

