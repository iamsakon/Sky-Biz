package com.sky.biz.hcm.om.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.sky.biz.common.entity.AbstractEntity;
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "hcm_om_org")
@SequenceGenerator(name = "seq_hcm_om_org", sequenceName = "seq_hcm_om_org")
@Entity
public class OrgEntity extends AbstractEntity {

	@Id
	@Column(name = "om_org_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	@Column(name="code")
	private String code;
	@Column(name="memo")
	private String memo;
	@Column(name="purpose")
	private String purpose;
	@Column(name="address_line1")
	private String addressLine1;
	@Column(name="address_line2")
	private String addressLine2;
	@Column(name="address_line3")
	private String addressLine3;
	@ManyToOne
	@Column(name="org_type_id")
	private OrgTypeEntity orgType;
	@ManyToOne
	@Column(name="parent_org_id")
	private OrgEntity parentOrg;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getAddressLine3() {
		return addressLine3;
	}
	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}
	public OrgTypeEntity getOrgType() {
		return orgType;
	}
	public void setOrgType(OrgTypeEntity orgType) {
		this.orgType = orgType;
	}
	public OrgEntity getParentOrg() {
		return parentOrg;
	}
	public void setParentOrg(OrgEntity parentOrg) {
		this.parentOrg = parentOrg;
	}
}
