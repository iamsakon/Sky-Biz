package com.sky.biz.inv.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.sky.biz.inv.entity.DimensionValueEntity;

public interface DimensionValueRepository extends
JpaRepository<DimensionValueEntity, Long>,
JpaSpecificationExecutor<DimensionValueEntity>{

	public List<DimensionValueEntity> findByActive(boolean isActive);
}
