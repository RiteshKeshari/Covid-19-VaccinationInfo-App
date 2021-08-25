package com.example.vaccinationinfo.model;

public class VaccineModel {
    private String vaccineCenter;
    private String vaccinationCharges;
    private String vaccinationAge;
    private String vaccineTimings;
    private String vaccineName;
    private String vaccineCenterTime;
    private String vaccinationCenterAddress;
    private String vaccineAvailable;

    public VaccineModel(){

    }

    public String getVaccineCenter() {
        return vaccineCenter;
    }

    public void setVaccineCenter(String vaccineCenter) {
        this.vaccineCenter = vaccineCenter;
    }

    public String getVaccinationCharges() {
        return vaccinationCharges;
    }

    public void setVaccinationCharges(String vaccinationCharges) {
        this.vaccinationCharges = vaccinationCharges;
    }

    public String getVaccinationAge() {
        return vaccinationAge;
    }

    public void setVaccinationAge(String vaccinationAge) {
        this.vaccinationAge = vaccinationAge;
    }

    public String getVaccineTimings() {
        return vaccineTimings;
    }

    public void setVaccineTimings(String vaccineTimings) {
        this.vaccineTimings = vaccineTimings;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public String getVaccineCenterTime() {
        return vaccineCenterTime;
    }

    public void setVaccineCenterTime(String vaccineCenterTime) {
        this.vaccineCenterTime = vaccineCenterTime;
    }

    public String getVaccinationCenterAddress() {
        return vaccinationCenterAddress;
    }

    public void setVaccinationCenterAddress(String vaccinationCenterAddress) {
        this.vaccinationCenterAddress = vaccinationCenterAddress;
    }

    public String getVaccineAvailable() {
        return vaccineAvailable;
    }

    public void setVaccineAvailable(String vaccineAvailable) {
        this.vaccineAvailable = vaccineAvailable;
    }

    public VaccineModel(String vaccineCenter, String vaccinationCharges, String vaccinationAge, String vaccineTimings, String vaccineName, String vaccineCenterTime, String vaccinationCenterAddress, String vaccineAvailable) {
        this.vaccineCenter = vaccineCenter;
        this.vaccinationCharges = vaccinationCharges;
        this.vaccinationAge = vaccinationAge;
        this.vaccineTimings = vaccineTimings;
        this.vaccineName = vaccineName;
        this.vaccineCenterTime = vaccineCenterTime;
        this.vaccinationCenterAddress = vaccinationCenterAddress;
        this.vaccineAvailable = vaccineAvailable;
    }
}
