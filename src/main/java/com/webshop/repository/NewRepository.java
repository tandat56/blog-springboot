package com.webshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.webshop.entity.NewEntity;

public interface NewRepository extends JpaRepository<NewEntity, Long> {
	
}
