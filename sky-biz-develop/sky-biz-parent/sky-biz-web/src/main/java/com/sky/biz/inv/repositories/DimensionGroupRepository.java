package com.sky.biz.inv.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.sky.biz.inv.entity.DimensionGroupEntity;

public interface DimensionGroupRepository extends
JpaRepository<DimensionGroupEntity, Long>,
JpaSpecificationExecutor<DimensionGroupEntity>{

	public List<DimensionGroupEntity> findByActive(boolean isActive);
}
