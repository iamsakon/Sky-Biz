package com.swn.eapp.dto;

import java.io.Serializable;

public class AbstractDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2159052830534474685L;

	long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
