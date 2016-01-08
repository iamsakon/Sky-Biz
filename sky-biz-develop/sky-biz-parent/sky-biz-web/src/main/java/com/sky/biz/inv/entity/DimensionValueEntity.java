/**
 * 
 */
package com.sky.biz.inv.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
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
 * @author sakon
 *
 */
@Entity
@Table(name = "inv_dimension_value")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@SequenceGenerator(name = "seq_inv_dimension_value", sequenceName = "seq_inv_dimension_value")
@DiscriminatorColumn(name = "VALUE_TYPE",discriminatorType=DiscriminatorType.INTEGER)
public abstract class DimensionValueEntity extends AbstractEntity {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "sortKey")
	private int sortKey;
	@Column(name = "is_used", nullable = false)
	private boolean used = true;

	public int getSortKey() {
		return sortKey;
	}

	public void setSortKey(int sortKey) {
		this.sortKey = sortKey;
	}

	public boolean isUsed() {
		return used;
	}

	public void setUsed(boolean used) {
		this.used = used;
	}


	
}
