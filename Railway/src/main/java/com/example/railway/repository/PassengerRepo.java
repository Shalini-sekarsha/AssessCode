package com.example.railway.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.railway.model.Passenger;




@Repository
public interface PassengerRepo extends JpaRepository<Passenger,Integer>{

}

	