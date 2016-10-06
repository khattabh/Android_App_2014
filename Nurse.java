package com.example.triage;

import java.sql.Time;
import java.util.HashMap;
import java.util.TreeMap;

public class Nurse {
	
		public void launchApp(){
			return;
		}
		
		public Patient lookUp(String hcn){
		return Triage.getMap.get(hcn);	
			
		}
		public VisitRecords createVR(String hcn){
			Time measurement = new Time(System.currentTimeMillis());
			TreeMap<Time, String> emptyTree = new TreeMap<Time,String>();
			VisitRecords VR = new VisitRecords(hcn,measurement,emptyTree);
			return VR;
			
		}
		
		public void UpdateVisitRecord(Patient p,Number[] vitalSigns){
		 	p.setTemp((Double) vitalSigns[0]);
		 	p.setSystolicBloodPressure((Double) vitalSigns[1]);
		 	p.setDiastolicBloodPressure((Double) vitalSigns[2]);
		 	p.setHeartRate((Integer) vitalSigns[3]);
		 	HashMap<Time,Number[]> hm = new HashMap<Time, Number[]>();
		 	Time measurement = new Time(System.currentTimeMillis());
		 	hm.put(measurement, vitalSigns);
		 	
		}
		public void saveData(){
			
		}
		public HashMap<Time,VisitRecords> viewPreviousRecords(Patient p){
			return p.getArriveTimeToVisitRecords();
		}
}
