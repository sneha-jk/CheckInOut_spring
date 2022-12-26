package com.webapp.CheckInOut.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.webapp.CheckInOut.classlog.check;

public interface LogDao extends JpaRepository<check,Integer >{
	
	@Query(value="select * from class_log where date= ?1",nativeQuery = true)
	List<check> findAllByDate(String date);
}