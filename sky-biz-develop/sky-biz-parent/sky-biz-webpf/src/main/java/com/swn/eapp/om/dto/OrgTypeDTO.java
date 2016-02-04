/**
 * 
 */
package com.swn.eapp.om.dto;

import java.io.Serializable;

import com.swn.eapp.dto.AbstractDTO;

/**
 * @author MrMai
 *
 */
public class OrgTypeDTO extends AbstractDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9207921835038941463L;

	String code;
	
	String name;

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
