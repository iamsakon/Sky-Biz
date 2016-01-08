package com.sky.biz.inv.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "40")
public class DimensionValueBooleanEntity extends DimensionValueEntity {

	@Column(name = "boolean_value")
	private boolean booleanValue;
	@Column(name = "caption_when_true")
	private String captionWhenTrue;
	@Column(name = "caption_when_false")
	private String captionWhenFalse;

	public boolean getBooleanValue() {
		return booleanValue;
	}

	public void setBooleanValue(boolean booleanValue) {
		this.booleanValue = booleanValue;
	}

	public String getCaptionWhenTrue() {
		return captionWhenTrue;
	}

	public void setCaptionWhenTrue(String captionWhenTrue) {
		this.captionWhenTrue = captionWhenTrue;
	}

	public String getCaptionWhenFalse() {
		return captionWhenFalse;
	}

	public void setCaptionWhenFalse(String captionWhenFalse) {
		this.captionWhenFalse = captionWhenFalse;
	}

	
}
