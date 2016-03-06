package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Attendee;
import com.example.model.Event;

@Repository("attendeeRepository")
public interface AttendeeRepository extends JpaRepository<Attendee, Long>{

    //Attendee save(Attendee attendee);   //SpringData
}
