package com.techbuilds.firstjobapplication.job;

import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
