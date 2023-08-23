/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.medical.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;


/**
 *
 * @author Barns
 */
public class HospitalStaff {
    private Integer ID;
    private String firstname;
    private String middlename;
    private String lastname;
    private String phone;
    private String address;
    private String gender;
    private String designation;
    
    private HospitalStaff() {
        
    }

    public HospitalStaff(Integer ID, String firstname, String middlename, String lastname, String phone, String address, String gender, String designation) {
        this.ID = ID;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.designation = designation;
    }
    
    

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "HospitalStaff{" + "ID=" + ID + 
                ", firstname=" + firstname + 
                ", middlename=" + middlename + 
                ", lastname=" + lastname + 
                ", phone=" + phone + 
                ", address=" + address + 
                ", gender=" + gender + 
                ", designation=" + designation + 
        '}';
    }
    
    
    
    
    
}
