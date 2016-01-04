/**
 * 
 */
package com.sky.biz.system.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Inheritance;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
/**
 * @author MrMai
 *
 */
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "sys_menu_item")
@SequenceGenerator(name = "seq_sys_menu_item", sequenceName = "seq_sys_menu_item")
@Entity
public class MenuItemEntity extends MenuGroupEntity {

	@Id
	@Column(name = "menu_item_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	/**
	 * 
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	private MenuGroupEntity menuGroup;	
	/**
	 * 
	 */
	@Column(name = "target")
	private String target;

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

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}
}
