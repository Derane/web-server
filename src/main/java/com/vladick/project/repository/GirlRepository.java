package com.vladick.project.repository;

import com.vladick.project.entity.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GirlRepository extends JpaRepository<Girl, Long> {
}
