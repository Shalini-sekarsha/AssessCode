package com.example.railway.serviceimpl;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.railway.model.Passenger;
import com.example.railway.repository.PassengerRepo;
import com.example.railway.service.PassengerService;




@Service
public class PassengerServiceImpl implements PassengerService {
	@Autowired
    PassengerRepo repo;
	
	@Override
	public void addPassenger(Passenger passenger) {
		repo.save(passenger);
	}

	@Override
	public Passenger getPassenger(int id) {
		
		return repo.findById(id).orElseThrow(null);
	}
@Override 
public List<Passenger> getAllPassenger(){
	return repo.findAll();
}

@Override
public void updatePassenger(Passenger passenger) {
	repo.save(passenger);
}	
public void deletePassenger(int id) {
	repo.deleteById(id);
}
}