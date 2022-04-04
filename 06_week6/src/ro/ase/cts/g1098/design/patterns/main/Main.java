package ro.ase.cts.g1098.design.patterns.main;

import java.io.IOException;

import ro.ase.cts.g1098.design.patterns.interfaces.ILogging;
import ro.ase.cts.g1098.design.patterns.models.LoggerGenerator;
import ro.ase.cts.g1098.design.patterns.models.LoggerType;

public class Main {

	//Logging system

//2. In order to manage the app logs define a module that 
	//will save all logs in a single/unique
    //file
	
//-there will be unique log files for errors and general info
//-the files will be created and opened when the app starts (eager instantiation)
//-the developers don't know the real file names for the 2 logs
//-all loggers will implement the Ilogging interface

	public static void main(String[] args) throws IOException {
		
		ILogging errorLog=LoggerGenerator.getLogger(LoggerType.ERROR);
		errorLog.log("Hello !");
		
		//we can t have the singleton and singleton registry in the 
		//same time in 2 dif classes -> we have a bug
		ILogging infoLog=LoggerGenerator.getLogger(LoggerType.INFO);
		infoLog.log("Hello again!");
		
		System.out.println("The end!");
	}

}
