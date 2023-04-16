package edu.upenn.cit594.util;
import java.util.Date;

public class Covid {
	
	private int zipCode;
	private int negTest;
	private int posTest;
	private int deathToll;
	private int hospitalization;
	private int partialVaccinated;
	private int fullyVaccinated;
	private int booster;
	private String date;
	
	
	public Covid (int zipCode, int negTest, int posTest, int deathToll, int hospitalization, int partialVaccinated,
			int fullyVaccinated, int booster,  String date) {
		
		this.zipCode = zipCode;
		this.negTest = negTest;
		this.posTest = posTest;
		this.deathToll = deathToll;
		this.hospitalization = hospitalization;
		this.partialVaccinated = partialVaccinated;
		this.fullyVaccinated = fullyVaccinated;
		this.booster = booster;
		this.date = date;
		
	}

	public int getZipCode() {
		return zipCode;
	}


	public int getNegTest() {
		return negTest;
	}


	public int getPosTest() {
		return posTest;
	}


	public int getDeathToll() {
		return deathToll;
	}


	public int getHospitalization() {
		return hospitalization;
	}


	public int getPartialVaccinated() {
		return partialVaccinated;
	}


	public int getFullyVaccinated() {
		return fullyVaccinated;
	}


	public int getBooster() {
		return booster;
	}


	public String getDate() {
		return date;
	}



	
	
}
