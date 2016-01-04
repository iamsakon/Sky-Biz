package com.sky.biz.hcm.lms.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.sky.biz.hcm.lms.entity.LeaveTypeEntity;

public interface LeaveTypeRepository extends
JpaRepository<LeaveTypeEntity, Long>,
JpaSpecificationExecutor<LeaveTypeEntity>{

	public List<LeaveTypeEntity> findByIsActive(boolean isActive);
}
