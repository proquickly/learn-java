package com.andykmiles;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Hello {
	public static void main(String[] args) {
		Logger logger
            = Logger.getLogger(
                Hello.class.getName());
		logger.log(Level.INFO, "Hello");
		Person person = new Person("Andy", 24);
		Job job = new Job("Developer", person);
		String name = person.getName();
		logger.log(Level.INFO, name);
		String jobName = job.getJobName();
		logger.log(Level.INFO, jobName);
		logger.log(Level.INFO, job.getJobOwner().getName());
		double result = person.calculate(10);
		String resultMessage = String.valueOf(result) ;
		logger.log(Level.INFO, resultMessage);
	}
}
