package com.sky.biz.system.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.sky.biz.system.entity.MenuGroupEntity;

public interface MenuGroupRepository extends
JpaRepository<MenuGroupEntity, Long>,
JpaSpecificationExecutor<MenuGroupEntity>{

	public List<MenuGroupEntity> findByIsActive(boolean isActive);
	
	public List<MenuGroupEntity> findByNameAndIsActive(String name,boolean isActive);
	
}
