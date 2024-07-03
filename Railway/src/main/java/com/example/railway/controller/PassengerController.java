package com.example.railway.controller;

import java.util.List;



import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.railway.model.Passenger;
import com.example.railway.serviceimpl.PassengerServiceImpl;




@RestController
@RequestMapping("/pass")
@CrossOrigin("http://localhost:3000")
public class PassengerController {
	
	public PassengerServiceImpl getService() {
		return service;
	}
	public void setService(PassengerServiceImpl service) {
		this.service = service;
	}
	PassengerServiceImpl service;
@PostMapping
public String insertPassenger(@RequestBody Passenger p)

{
	String msg="";
	
	try
	{
		service.addPassenger(p);
		msg=" add Success";
	}
	catch(Exception s) 
	{
		
		msg=" add Failure";
	}

	
	
	
	return msg;
}
@GetMapping("{id}")	
public Passenger getPassengerById(@PathVariable("id")int id) {
return service.getPassenger(id);

}
@GetMapping("/all")	
public List <Passenger> getPassenger()
{
return service.getAllPassenger();

}
@PutMapping
public String updatePassenger(@RequestBody Passenger p)

{
	String msg="";
	
	try
	{
		service.updatePassenger(p);
		msg="update Success";
	}
	catch(Exception s) 
	{
		
		msg="update Failure";
	}

	return msg;
}
@DeleteMapping("{id}")
public String deletePassenger(@PathVariable("id") int id )

{
	String msg="";
	
	try
	{
		service.deletePassenger(id);
		msg="del Success";
	}
	catch(Exception s) 
	{
		
		msg="del Failure";
	}

	return msg;
}

}



