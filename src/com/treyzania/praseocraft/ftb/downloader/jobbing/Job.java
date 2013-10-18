package com.treyzania.praseocraft.ftb.downloader.jobbing;

import com.treyzania.praseocraft.ftb.downloader.PCDL;

public class Job {

	public final long creation;
	public final Joblist pool;

	public Job(Joblist jl) {

		this.creation = System.currentTimeMillis();
		this.pool = jl;

	}
	
	public boolean runJob() {
		
		// Nothing.
		
		return true;
		
	}
	
	public static void announceSkip(Job j, String msg) {
		
		PCDL.log.warning("JOB SKIPPED: \"" + j.toString() + "\" FOR " + msg);
		
	}

}
