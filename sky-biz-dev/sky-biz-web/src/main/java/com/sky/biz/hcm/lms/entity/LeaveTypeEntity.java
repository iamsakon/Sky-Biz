/**
 * 
 */
package com.sky.biz.hcm.lms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.sky.biz.common.entity.AbstractEntity;

/**
 * @author MrMai
 *
 */
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "hcm_lms_leave_type")
@SequenceGenerator(name = "seq_hcm_leave_type", sequenceName = "seq_hcm_leave_type")
@Entity
public class LeaveTypeEntity extends AbstractEntity {

	@Id
	@Column(name = "rec_candidate_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	/**
	 * 
	 */
	@Column(name = "code",nullable=false)
	private String code;
	/**
	 * 
	 */
	@Column(name = "name")
	private String name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
