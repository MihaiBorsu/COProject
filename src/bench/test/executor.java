package bench.test;

import bench.cpu.CPUThreading;
import logging.ConsoleLogger;
import logging.ILogger;
import logging.TimeUnit;
import timing.ITimer;
import timing.Timer;

public class executor 
{
		 public float score;
	   public void execute()
	   {
	   	PCSpecs specs = new PCSpecs();
	 		((PCSpecs) specs).PCSpec();
	 		  
	 		int cores = Integer.valueOf(specs.proc4);
	 		//int cores = 2;
			ITimer timer = new Timer();
			ILogger log = new ConsoleLogger();	
			TimeUnit timeUnit = TimeUnit.milli;		
			CPUThreading bench = new CPUThreading();
			long time;
		    
			bench.initialize(10000000);
			for (int threads = 1; threads <= cores*2; threads*=2) 
			{			
				timer.start();			
				bench.run(new Integer(threads));		
				time = timer.stop();	
				score = 0.0f;
				System.out.println("Threads: " + threads + " -> time: " + (time / 1000000) + " ms");
			    time= time / 1000000;

				score += threads * 100000 / time;
				
				log.writeTime(timer.stop(), timeUnit);
			}	
			log.close();
			System.out.println("SCORE: " + score);
	   }
}
