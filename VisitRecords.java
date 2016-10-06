package com.example.triage;

import java.util.TreeMap;
import java.sql.Time;

public class VisitRecords{
	
	/** Health card number of a particular patient that corresponds to his visit records. **/
	public String health_card_number;
	
	/** Time arrived at ER for current visit. **/
	public Time arrival_time;
	
	/** Maps the time the vital signs were taken to its corresponding vital signs, sorted from earliest to latest. **/
	private TreeMap<Time, String> timeofMeasurementstovitalSigns;

	public VisitRecords(String health_card_number, Time arrival_time,
			TreeMap<Time, String> timeofMeasurementstovitalSigns) {
		super();
		this.health_card_number = health_card_number;
		this.arrival_time = arrival_time;
		this.timeofMeasurementstovitalSigns = timeofMeasurementstovitalSigns;
	}

	
	public String getHealth_card_number() {
		return health_card_number;
	}


	public void setHealth_card_number(String health_card_number) {
		this.health_card_number = health_card_number;
	}

	
	public Time getArrival_time() {
		return arrival_time;
	}


	public void setArrival_time(Time arrival_time) {
		this.arrival_time = arrival_time;
	}


	public TreeMap<Time, String> getTimeofMeasurementstovitalSigns() {
		return timeofMeasurementstovitalSigns;
	}


	public void setTimeofMeasurementstovitalSigns(
			TreeMap<Time, String> timeofMeasurementstovitalSigns) {
		this.timeofMeasurementstovitalSigns = timeofMeasurementstovitalSigns;
	}

	
	}