package com.contact.manager.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String phoneNo;

    private String email;

    private Date dob;

    private String occupation;

    @CreationTimestamp
    private Date addedOn;

    private String image;

    @Column(length = 500)
    private String description;

    @ManyToOne
    private User user;

    protected Contact() {
	super();
    }

    public Contact(String name, String phoneNo, String email, Date dob, String occupation, Date addedOn, String image,
	    String description) {
	super();
	this.name = name;
	this.phoneNo = phoneNo;
	this.email = email;
	this.dob = dob;
	this.occupation = occupation;
	this.addedOn = addedOn;
	this.image = image;
	this.description = description;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getPhoneNo() {
	return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public Date getDob() {
	return dob;
    }

    public void setDob(Date dob) {
	this.dob = dob;
    }

    public String getOccupation() {
	return occupation;
    }

    public void setOccupation(String occupation) {
	this.occupation = occupation;
    }

    public Date getAddedOn() {
	return addedOn;
    }

    public void setAddedOn(Date addedOn) {
	this.addedOn = addedOn;
    }

    public String getImage() {
	return image;
    }

    public void setImage(String image) {
	this.image = image;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public User getUser() {
	return user;
    }

    public void setUser(User user) {
	this.user = user;
    }

    @Override
    public String toString() {
	return "Contact [id=" + id + ", name=" + name + ", phoneNo=" + phoneNo + ", email=" + email + ", dob=" + dob
		+ ", occupation=" + occupation + ", addedOn=" + addedOn + ", image=" + image + ", description="
		+ description + ", user=" + user + "]";
    }

}
