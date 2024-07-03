package com.example.railway.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.railway.model.Train;

	@Repository
	public interface TrainRepo extends JpaRepository<Train,Integer>{
		@Query("select tid from Train")
		public List<Integer> getIDList();
	}
	

