package com.sky.biz.inv.entity;

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
@Table(name = "inv_dimension_group")
@SequenceGenerator(name = "seq_inv_dimension_group", sequenceName = "seq_inv_dimension_group")
@Entity
public class DimensionGroupEntity extends AbstractEntity {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "description", nullable = true)
	private String description;
	@Column(name = "is_used", nullable = false)
	private boolean used = true;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isUsed() {
		return used;
	}
	public void setUsed(boolean used) {
		this.used = used;
	}


}
