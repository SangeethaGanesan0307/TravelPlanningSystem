package com.example.TravelPlanningSystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TravelPlanningSystem.entity.Expense;

public interface ExpenseRepo extends JpaRepository<Expense, Integer>
{

}
