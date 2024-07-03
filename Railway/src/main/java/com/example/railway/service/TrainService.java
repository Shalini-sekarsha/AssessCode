package com.example.railway.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.railway.model.Train;



@Service
public interface TrainService {
	public void addTrain(Train train);
	public Train getTrain(int tid);
	public List<Train> getAllTrain();
	void updateTrain(Train train);
	public void deleteTrain(int tid);
	List<Integer> getAllId();
	
}

