package com.example.test_tasks.repository;

import com.example.test_tasks.domain.SubstringDataBase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public interface SubstringDataBaseRepo extends JpaRepository<SubstringDataBase, Long> {
}
