package com.sky.biz.hcm.om.entity;

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
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "hcm_om_legal_unit")
@SequenceGenerator(name = "seq_hcm_om_legal_unit", sequenceName = "seq_hcm_om_legal_unit")
@Entity
public class LegalEntity extends AbstractEntity {

	@Id
	@Column(name = "om_legal_unit_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
}
