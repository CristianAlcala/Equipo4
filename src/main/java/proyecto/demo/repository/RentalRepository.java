package proyecto.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.demo.entities.Rental;

public interface RentalRepository extends JpaRepository<Rental,Integer> {
	
	public Optional<Rental> findById(Integer id);

}
