package com.example.triage;

import java.sql.Time;
import java.util.HashMap;

public class Patient {
	private final String[] personalInfo;
	private Time arrivalTime;
	private Number[] vitalSigns;
	private boolean firstTimer;
	private HashMap<Time,VisitRecords> arriveTimeToVisitRecords;
	
	public Patient(String name, String healthCardNumber, String DOB){
		personalInfo=new String[3];
		personalInfo[0]=name;
		personalInfo[1]=healthCardNumber;
		personalInfo[2]=DOB;
		vitalSigns=new Number[4];
		firstTimer=true;
		arriveTimeToVisitRecords=new HashMap<Time, VisitRecords>();
	}
	
	public String getName(){
		return personalInfo[0];
	}
	
	public String getHealthCardNumber(){
		return personalInfo[1];
	}
	
	public String getDOB(){
		return personalInfo[3];
	}
	
	public Time getArrivalTime(){
		return arrivalTime;
	}
	
	public void setArrivalTime(Time arrivalTime){
		this.arrivalTime=arrivalTime;
	}
	
	public Number getTemp(){
		return vitalSigns[0];
	}
	
	public void setTemp(double Temp){
		vitalSigns[0]=Temp;
	}
	
	public Number getSystolicBloodPressure(){
		return vitalSigns[1];
	}
	
	public void setSystolicBloodPressure(double systolic){
		vitalSigns[1]=systolic;
	}
	
	public Number getDiastolicBloodPressure(){
		return vitalSigns[2];
	}
	
	public void setDiastolicBloodPressure(double diastolic){
		vitalSigns[2]=diastolic;
	}
	
	public Number getHeartRate(){
		return vitalSigns[3];
	}
	
	public void setHeartRate(int hr){
		vitalSigns[3]=hr;
	}
	
	public boolean getFirstTImer(){
		return firstTimer;
	}
	
	public void setFirstTimer(boolean ft){
		firstTimer=ft;
	}
	
	public HashMap<Time, VisitRecords> getArriveTimeToVisitRecords(){
		return arriveTimeToVisitRecords;
	}

}
