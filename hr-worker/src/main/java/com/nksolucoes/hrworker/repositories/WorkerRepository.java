package com.nksolucoes.hrworker.repositories;

import com.nksolucoes.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long>{
}
