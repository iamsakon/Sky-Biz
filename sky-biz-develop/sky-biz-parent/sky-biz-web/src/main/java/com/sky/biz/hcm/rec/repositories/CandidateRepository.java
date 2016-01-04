package com.sky.biz.hcm.rec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.sky.biz.hcm.rec.entity.CandidateEntity;
import java.util.List;

public interface CandidateRepository extends
JpaRepository<CandidateEntity, Long>,
JpaSpecificationExecutor<CandidateEntity>{

	public List<CandidateEntity> findByActive(boolean isActive);
}
