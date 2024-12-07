
package com.klef.jfsd.exam;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String gender;
    private int age;
    private String location;
    private String email;
    private String mobileNumber;

    // Constructor
    public Client(String name, String gender, int age, String location, String email, String mobileNumber) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.location = location;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    // ToString for printing Client details
    @Override
    public String toString() {
        return "Client [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", location=" + location
                + ", email=" + email + ", mobileNumber=" + mobileNumber + "]";
    }
}
