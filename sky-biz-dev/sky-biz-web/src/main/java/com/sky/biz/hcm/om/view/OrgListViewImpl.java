package com.sky.biz.hcm.om.view;

import com.vaadin.ui.Table;

public class OrgListViewImpl{

	public Table getOrgList(){
		Table table = new Table("My Table");
		table.addContainerProperty("index", String.class, null);
		table.addContainerProperty("code", String.class, null);
		table.addContainerProperty("memo", String.class, null);
		table.addContainerProperty("purpose", String.class, null);
		table.addContainerProperty("addressLine1", String.class, null);
		table.addContainerProperty("addressLine2", String.class, null);
		table.addContainerProperty("addressLine3", String.class, null);
		table.addContainerProperty("Action", String.class, null);
		return table;
	}
	
}
