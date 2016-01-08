package com.sky.biz.inv.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "10")
public class DimensionValueStringEntity extends DimensionValueEntity {

	@Column(name = "string_value")
	private String stringValue;

	public String getStringValue() {
		return stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}
}
