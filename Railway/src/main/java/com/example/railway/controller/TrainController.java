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

import com.example.railway.model.Train;
import com.example.railway.serviceimpl.TrainServiceImpl;

@RestController
@RequestMapping("/tra")
@CrossOrigin("http://localhost:3000")
public class TrainController {
	
	public TrainServiceImpl getService() {
		return service;
	}
	public void setService(TrainServiceImpl service) {
		this.service = service;
	}
	TrainServiceImpl service;
@PostMapping
public String insertTrain(@RequestBody Train t)

{
	String msg="";
	
	try
	{
		service.addTrain(t);
		msg=" add Success";
	}
	catch(Exception s) 
	{
		
		msg=" add Failure";
	}

	return msg;
}
@GetMapping("{tid}")	
public Train getTrainById(@PathVariable("tid")int tid) {
return service.getTrain(tid);

}
@GetMapping("/all")	
public List <Train> getTrain()
{
return service.getAllTrain();

}
@PutMapping
public String updateTrain(@RequestBody Train t)

{
	String msg="";
	
	try
	{
		service.updateTrain(t);
		msg="update Success";
	}
	catch(Exception s) 
	{
		
		msg="update Failure";
	}

	return msg;
}
@DeleteMapping("{tid}")
public String deleteTrain(@PathVariable("tid") int tid )

{
	String msg="";
	
	try
	{
		service.deleteTrain(tid);
		msg="del Success";
	}
	catch(Exception s) 
	{
	
		msg="del Failure";
	}

	return msg;
}
@GetMapping("/idlist")
public List<Integer> getIDList(){
	return service.getAllId();
}
}


