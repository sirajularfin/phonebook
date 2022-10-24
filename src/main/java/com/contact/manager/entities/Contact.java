package com.contact.manager.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Integer contactNo;
    private String email;
    private Date dob;
    private String occupation;
    private String image;
    @Column(length = 500)
    private String description;

    @ManyToOne
    private User user;

    protected Contact() {
	super();
    }

    public Contact(String name, Integer contactNo, String email, Date dob, String occupation, String image,
	    String description) {
	super();
	this.name = name;
	this.contactNo = contactNo;
	this.email = email;
	this.dob = dob;
	this.occupation = occupation;
	this.image = image;
	this.description = description;
    }

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Integer getContactNo() {
	return contactNo;
    }

    public void setContactNo(Integer contactNo) {
	this.contactNo = contactNo;
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
	return "Contact [id=" + id + ", name=" + name + ", contactNo=" + contactNo + ", email=" + email + ", dob=" + dob
		+ ", occupation=" + occupation + ", image=" + image + ", description=" + description + "]";
    }

}
