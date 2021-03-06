package com.treyzania.praseocraft.ftb.downloader.jobbing;

import java.util.ArrayList;

public class Joblist {

	public ArrayList<Job> jobs;
	
	public Joblist() {
		
		this.jobs = new ArrayList<Job>();
		
	}
	
	public void addJob(Job job) {
		
		jobs.add(job);
		
	}
	
	public Job dequeueJob() {
		
		while (jobs.isEmpty()) {
			
			try {
				Thread.sleep(10);
			} catch (Exception e) {}
			
		}
		
		return jobs.remove(0);
		
	}
	
	public int getJobsRemaining() {
		
		return this.jobs.size();
		
	}
	
	public boolean isEmpty() {
		
		return (getJobsRemaining() == 0);
		
	}
	
}
