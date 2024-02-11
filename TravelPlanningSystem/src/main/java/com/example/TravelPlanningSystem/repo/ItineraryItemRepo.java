package com.example.TravelPlanningSystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TravelPlanningSystem.entity.ItineraryItem;

public interface ItineraryItemRepo extends JpaRepository<ItineraryItem, Integer>
{

}
