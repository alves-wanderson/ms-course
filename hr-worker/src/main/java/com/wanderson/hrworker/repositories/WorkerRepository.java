package com.wanderson.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wanderson.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository <Worker, Long> {

}
