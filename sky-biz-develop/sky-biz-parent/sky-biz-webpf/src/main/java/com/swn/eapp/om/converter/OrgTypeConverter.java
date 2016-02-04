package com.swn.eapp.om.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.swn.eapp.om.dto.OrgTypeDTO;

@FacesConverter("orgTypeConverter")
public class OrgTypeConverter implements Converter {
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
		if (value != null && value.trim().length() > 0) {
			try {
				return new OrgTypeDTO();
			} catch (Exception ex) {
				return null;
			}
		} else {
			return null;
		}
	}

	public String getAsString(FacesContext fc, UIComponent uic, Object object) {
		if (object != null) {
			return String.valueOf(((OrgTypeDTO) object).getId());
		} else {
			return null;
		}
	}
}
