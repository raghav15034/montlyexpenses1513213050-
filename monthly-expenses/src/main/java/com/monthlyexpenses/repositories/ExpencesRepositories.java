package com.monthlyexpenses.repositories;

import com.monthlyexpenses.model.Expenses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpencesRepositories extends JpaRepository<Expenses,Long> {
}
