package com.example.TravelPlanningSystem.entity;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Component
public class ItineraryItem
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int itineraryItemId;
	private String activity;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	
	
}

