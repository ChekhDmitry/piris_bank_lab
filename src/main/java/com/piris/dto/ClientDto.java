package com.piris.dto;

import java.sql.Date;

public class ClientDto {
    private String surname;
    private String name;
    private String fathersName;
    private Date birthday;
    private int sex;
    private String passportSeries;
    private int passportNumber;
    private String passportId;
    private String passportPlace;
    private String birthPlace;
    private int cityId;
    private String address;
    private String mobileNumber;
    private String homeMobileNumber;
    private String email;
    private int maritalStatusId;
    private int nationalityId;
    private int disabilityId;
    private int pensionary;
    private Double monthlyIncome;
    private int military;

    public ClientDto() {
    }

    public ClientDto(String surname, String name, String fathersName, Date birthday, int sex, String passportSeries, int passportNumber, String passportId, String passportPlace, String birthPlace, int cityId, String address, String mobileNumber, String homeMobileNumber, String email, int maritalStatusId, int nationalityId, int disabilityId, int pensionary, Double monthlyIncome, int military) {
        this.surname = surname;
        this.name = name;
        this.fathersName = fathersName;
        this.birthday = birthday;
        this.sex = sex;
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
        this.passportId = passportId;
        this.passportPlace = passportPlace;
        this.birthPlace = birthPlace;
        this.cityId = cityId;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.homeMobileNumber = homeMobileNumber;
        this.email = email;
        this.maritalStatusId = maritalStatusId;
        this.nationalityId = nationalityId;
        this.disabilityId = disabilityId;
        this.pensionary = pensionary;
        this.monthlyIncome = monthlyIncome;
        this.military = military;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public String getPassportPlace() {
        return passportPlace;
    }

    public void setPassportPlace(String passportPlace) {
        this.passportPlace = passportPlace;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getHomeMobileNumber() {
        return homeMobileNumber;
    }

    public void setHomeMobileNumber(String homeMobileNumber) {
        this.homeMobileNumber = homeMobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMaritalStatusId() {
        return maritalStatusId;
    }

    public void setMaritalStatusId(int maritalStatusId) {
        this.maritalStatusId = maritalStatusId;
    }

    public int getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(int nationalityId) {
        this.nationalityId = nationalityId;
    }

    public int getDisabilityId() {
        return disabilityId;
    }

    public void setDisabilityId(int disabilityId) {
        this.disabilityId = disabilityId;
    }

    public int getPensionary() {
        return pensionary;
    }

    public void setPensionary(int pensionary) {
        this.pensionary = pensionary;
    }

    public Double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(Double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public int getMilitary() {
        return military;
    }

    public void setMilitary(int military) {
        this.military = military;
    }

    @Override
    public String toString() {
        return "ClientDto{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", fathersName='" + fathersName + '\'' +
                ", birthday=" + birthday +
                ", sex=" + sex +
                ", passportSeries='" + passportSeries + '\'' +
                ", passportNumber=" + passportNumber +
                ", passportId='" + passportId + '\'' +
                ", passportPlace='" + passportPlace + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", cityId=" + cityId +
                ", address='" + address + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", homeMobileNumber='" + homeMobileNumber + '\'' +
                ", email='" + email + '\'' +
                ", maritalStatusId=" + maritalStatusId +
                ", nationalityId=" + nationalityId +
                ", disabilityId=" + disabilityId +
                ", pensionary=" + pensionary +
                ", monthlyIncome=" + monthlyIncome +
                ", military=" + military +
                '}';
    }
}
