package com.contact.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contact.manager.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
