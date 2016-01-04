/**
 * 
 */
package com.sky.biz.system.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.sky.biz.common.entity.AbstractEntity;

/**
 * @author MrMai
 *
 */
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "sys_menu_group")
@SequenceGenerator(name = "seq_sys_menu_group", sequenceName = "seq_sys_menu_group")
@Entity
public class MenuGroupEntity extends AbstractEntity {
	@Id
	@Column(name = "menu_group_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;	
	/**
	 * 
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	private MenuGroupEntity menuGroup;	
	
	/**
	 * Menu Name
	 */
	@Column(name = "name", nullable = false)
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public MenuGroupEntity getMenuGroup() {
		return menuGroup;
	}

	public void setMenuGroup(MenuGroupEntity menuGroup) {
		this.menuGroup = menuGroup;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
