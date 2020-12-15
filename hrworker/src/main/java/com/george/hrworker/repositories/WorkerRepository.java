package com.george.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.george.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
