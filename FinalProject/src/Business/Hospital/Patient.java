/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.RegCenter.Organ;
import java.util.Date;

/**
 *
 * @author ApoorvaLakhmani
 */
public class Patient {
    
    private int patientID;
    private String patientName;
    private int patientAge;
    private String patientLocation;
    private String bloodType;
    private double weight;
    private int height;
    private Organ organNeeded;
   // private int organSize;
    private String otherMedicalCondition;
    private long patientContactNumber;
    private String critical;
    private static int counter;
    private Date transplantRequestDate;
    private Date transplantCompletionDate;
    private Date deathDate;
    private double bmi;
 
    public Patient(){
        counter++;
        patientID = counter;
        organNeeded=new Organ();
    }

    public int getPatientID() {
        return patientID;
    }

    
    public String getCritical() {
        return critical;
    }

    public void setCritical(String critical) {
        this.critical = critical;
    }

    public long getPatientContactNumber() {
        return patientContactNumber;
    }

    public void setPatientContactNumber(long patientContactNumber) {
        this.patientContactNumber = patientContactNumber;
    }

    
   

    
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientLocation() {
        return patientLocation;
    }

    public void setPatientLocation(String patientLocation) {
        this.patientLocation = patientLocation;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Organ getOrganNeeded() {
        return organNeeded;
    }

    public void setOrganNeeded(Organ organNeeded) {
        this.organNeeded = organNeeded;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Patient.counter = counter;
    }

    public String getOtherMedicalCondition() {
        return otherMedicalCondition;
    }

    public void setOtherMedicalCondition(String otherMedicalCondition) {
        this.otherMedicalCondition = otherMedicalCondition;
    }

    public Date getTransplantRequestDate() {
        return transplantRequestDate;
    }

    public void setTransplantRequestDate(Date transplantRequestDate) {
        this.transplantRequestDate = transplantRequestDate;
    }

    public Date getTransplantCompletionDate() {
        return transplantCompletionDate;
    }

    public void setTransplantCompletionDate(Date transplantCompletionDate) {
        this.transplantCompletionDate = transplantCompletionDate;
    }

    public Date getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(Date deathDate) {
        this.deathDate = deathDate;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }
    
    
    
}
