package com.sky.biz.inv.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "20")
public class DimensionValueLongEntity extends DimensionValueEntity {

	@Column(name = "long_value")
	private Long longValue;

	public Long getLongValue() {
		return longValue;
	}

	public void setLongValue(Long longValue) {
		this.longValue = longValue;
	}
}
