package com.sky.biz.inv.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "30")
public class DimensionValueDoubleEntity extends DimensionValueEntity {

	@Column(name = "double_value")
	private double doubleValue;

	public double getDoubleValue() {
		return doubleValue;
	}

	public void setDoubleValue(double doubleValue) {
		this.doubleValue = doubleValue;
	}
}
