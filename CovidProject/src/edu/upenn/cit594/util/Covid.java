package edu.upenn.cit594.util;

public class Covid {
	
	private String zipCode;
	private int negTest;
	private int posTest;
	private int deathToll;
	private int hospitalization;
	private int partialVaccinated;
	private int fullyVaccinated;
	private int booster;
	private String date;
	
	
	public Covid (String zipCode, int negTest, int posTest, int deathToll, int hospitalization, int partialVaccinated,
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

	public String getZipCode() {
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

  // testing
	public String toString() {
		return "Covid [zipCode=" + zipCode + ", negTest=" + negTest + ", posTest=" + posTest + ", deathToll=" + deathToll
				+ ", hospitalization=" + hospitalization + ", partialVaccinated=" + partialVaccinated
				+ ", fullyVaccinated=" + fullyVaccinated + ", booster=" + booster + ", date=" + date + "]";
	}

	
	
}
