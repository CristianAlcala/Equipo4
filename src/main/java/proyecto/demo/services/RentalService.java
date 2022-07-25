package proyecto.demo.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.demo.entities.Rental;
import proyecto.demo.repository.RentalRepository;

@Service
public class RentalService {
	
	@Autowired
	private RentalRepository rentalRepository;
	
	private Optional<Rental> findById(Integer id){
		
		return rentalRepository.findById(id);
	}
	
	
}
