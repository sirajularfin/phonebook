package com.contact.manager.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.NaturalId;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @NaturalId(mutable = true)
    private String email;

    private String password;

    private String role;

    @Column(columnDefinition = "boolean default false")
    private Boolean loginStatus;

    @CreationTimestamp
    private Date accountCreation;

    @Column(length = 500)
    private String description;

    private String image;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
    private List<Contact> contcats = new ArrayList<>();

    protected User() {
	super();
    }

    public User(String name, String email, String password, String role, Boolean loginStatus, Date accountCreation,
	    String description, String image) {
	super();
	this.name = name;
	this.email = email;
	this.password = password;
	this.role = role;
	this.loginStatus = loginStatus;
	this.accountCreation = accountCreation;
	this.description = description;
	this.image = image;
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

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public String getRole() {
	return role;
    }

    public void setRole(String role) {
	this.role = role;
    }

    public Boolean getLoginStatus() {
	return loginStatus;
    }

    public void setLoginStatus(Boolean loginStatus) {
	this.loginStatus = loginStatus;
    }

    public Date getAccountCreation() {
	return accountCreation;
    }

    public void setAccountCreation(Date accountCreation) {
	this.accountCreation = accountCreation;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public String getImage() {
	return image;
    }

    public void setImage(String image) {
	this.image = image;
    }

    public List<Contact> getContcats() {
	return contcats;
    }

    public void setContcats(List<Contact> contcats) {
	this.contcats = contcats;
    }

    @Override
    public String toString() {
	return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", role=" + role
		+ ", loginStatus=" + loginStatus + ", accountCreation=" + accountCreation + ", description="
		+ description + ", image=" + image + ", contcats=" + contcats + "]";
    }

}
