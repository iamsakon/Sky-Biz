/**
 * 
 */
package com.sky.biz.hcm.rec.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sky.biz.common.entity.AbstractEntity;

import java.util.Calendar;
/**
 * @author MrMai
 *
 */
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "hcm_rec_candidate")
@SequenceGenerator(name = "seq_hcm_rec_candidate", sequenceName = "seq_hcm_rec_candidate")
@Entity
public class CandidateEntity extends AbstractEntity{

	@Id
	@Column(name = "rec_candidate_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	/**
	 * Candidate code
	 */
	@Column(name = "code", nullable = false)
	private String code;
	/**
	 * Indicate date that candidate was registered
	 */
	@Column(name = "registered_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar registeredDate;
	
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
	public Calendar getRegisteredDate() {
		return registeredDate;
	}
	public void setRegisteredDate(Calendar registeredDate) {
		this.registeredDate = registeredDate;
	}
	
}
