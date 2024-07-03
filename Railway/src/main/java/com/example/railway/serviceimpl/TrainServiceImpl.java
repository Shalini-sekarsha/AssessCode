package com.example.railway.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.railway.model.Train;
import com.example.railway.repository.TrainRepo;
import com.example.railway.service.TrainService;



@Service
public class TrainServiceImpl implements TrainService {
	@Autowired
	TrainRepo repo;

	@Override
	public void addTrain(Train train) {
		repo.save(train);
	}

	@Override
	public Train getTrain(int tid) {

		return repo.findById(tid).orElseThrow(null);
	}

	@Override
	public List<Train> getAllTrain() {
		return repo.findAll();
	}

	@Override
	public void updateTrain(Train train) {
		repo.save(train);
	}

	public void deleteTrain(int tid) {
		repo.deleteById(tid);
	}

	public List<Integer> getAllId() {
		return repo.getIDList();

	}


}