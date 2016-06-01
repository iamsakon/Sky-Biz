/**
 * 
 */
package com.sky.biz.prodim.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.sky.biz.prodim.entity.ProductMasterEntity;


/**
 * @author User
 *
 */
public interface ProductMasterRepository extends
JpaRepository<ProductMasterEntity, Long>,
JpaSpecificationExecutor<ProductMasterEntity>{
	
	public ProductMasterEntity findByCode(String code);
	
}
