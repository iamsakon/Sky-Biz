package com.sky.biz.system.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.sky.biz.system.entity.MenuGroupEntity;
import com.sky.biz.system.entity.MenuItemEntity;

public interface MenuItemRepository extends
JpaRepository<MenuItemEntity, Long>,
JpaSpecificationExecutor<MenuItemEntity>{

	public List<MenuItemEntity> findByIsActive(boolean isActive);
	
	public List<MenuItemEntity> findByNameAndIsActive(String name,boolean isActive);
	
	public List<MenuItemEntity> findByMenuGroupAndIsActive(MenuGroupEntity menuGroup,boolean isActive);
	
}
