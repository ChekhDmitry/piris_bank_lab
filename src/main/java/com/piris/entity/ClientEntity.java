package com.piris.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "client", schema = "pirisbankdb", catalog = "")
public class ClientEntity {
    private int id;
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
    private Integer military;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "fathers_name")
    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    @Basic
    @Column(name = "birthday")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "sex")
    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "passport_series")
    public String getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }

    @Basic
    @Column(name = "passport_number")
    public int getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Basic
    @Column(name = "passport_id")
    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    @Basic
    @Column(name = "passport_place")
    public String getPassportPlace() {
        return passportPlace;
    }

    public void setPassportPlace(String passportPlace) {
        this.passportPlace = passportPlace;
    }

    @Basic
    @Column(name = "birth_place")
    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    @Basic
    @Column(name = "city_id")
    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "mobile_number")
    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Basic
    @Column(name = "home_mobile_number")
    public String getHomeMobileNumber() {
        return homeMobileNumber;
    }

    public void setHomeMobileNumber(String homeMobileNumber) {
        this.homeMobileNumber = homeMobileNumber;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "marital_status_id")
    public int getMaritalStatusId() {
        return maritalStatusId;
    }

    public void setMaritalStatusId(int maritalStatusId) {
        this.maritalStatusId = maritalStatusId;
    }

    @Basic
    @Column(name = "nationality_id")
    public int getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(int nationalityId) {
        this.nationalityId = nationalityId;
    }

    @Basic
    @Column(name = "disability_id")
    public int getDisabilityId() {
        return disabilityId;
    }

    public void setDisabilityId(int disabilityId) {
        this.disabilityId = disabilityId;
    }

    @Basic
    @Column(name = "pensionary")
    public int getPensionary() {
        return pensionary;
    }

    public void setPensionary(int pensionary) {
        this.pensionary = pensionary;
    }

    @Basic
    @Column(name = "monthly_income")
    public Double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(Double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    @Basic
    @Column(name = "military")
    public Integer getMilitary() {
        return military;
    }

    public void setMilitary(Integer military) {
        this.military = military;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientEntity that = (ClientEntity) o;
        return id == that.id &&
                sex == that.sex &&
                passportNumber == that.passportNumber &&
                cityId == that.cityId &&
                maritalStatusId == that.maritalStatusId &&
                nationalityId == that.nationalityId &&
                disabilityId == that.disabilityId &&
                pensionary == that.pensionary &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(name, that.name) &&
                Objects.equals(fathersName, that.fathersName) &&
                Objects.equals(birthday, that.birthday) &&
                Objects.equals(passportSeries, that.passportSeries) &&
                Objects.equals(passportId, that.passportId) &&
                Objects.equals(passportPlace, that.passportPlace) &&
                Objects.equals(birthPlace, that.birthPlace) &&
                Objects.equals(address, that.address) &&
                Objects.equals(mobileNumber, that.mobileNumber) &&
                Objects.equals(homeMobileNumber, that.homeMobileNumber) &&
                Objects.equals(email, that.email) &&
                Objects.equals(monthlyIncome, that.monthlyIncome) &&
                Objects.equals(military, that.military);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, fathersName, birthday, sex, passportSeries, passportNumber, passportId, passportPlace, birthPlace, cityId, address, mobileNumber, homeMobileNumber, email, maritalStatusId, nationalityId, disabilityId, pensionary, monthlyIncome, military);
    }
}
