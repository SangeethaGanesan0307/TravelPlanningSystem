package com.example.TravelPlanningSystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TravelPlanningSystem.entity.Trip;

public interface TripRepo extends JpaRepository<Trip, Integer>
{

}
