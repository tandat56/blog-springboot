package com.webshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webshop.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
	
	CategoryEntity findOneByCode(String code);
}
