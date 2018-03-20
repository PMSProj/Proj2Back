package com.dao;

import java.util.List;

import com.model.Job;

public interface JobDao {
	void addJob(Job job);//insert into jodata

	List<Job> getAllJobs();//select * from jobdata

	Job getJob(int id);//select * from jobdata

}
