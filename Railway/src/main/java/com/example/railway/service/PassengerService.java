package com.example.railway.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.railway.model.Passenger;

@Service
public interface PassengerService {
public void addPassenger(Passenger customer);
public Passenger getPassenger(int id);
public List<Passenger> getAllPassenger();
void updatePassenger(Passenger passenger);
public void deletePassenger(int id);

}