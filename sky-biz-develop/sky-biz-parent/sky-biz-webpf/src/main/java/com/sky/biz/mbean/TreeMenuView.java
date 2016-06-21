package com.sky.biz.mbean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import com.swn.eapp.dto.MenuItemDto;

@ManagedBean(name = "treeBasicView")
@SessionScoped
public class TreeMenuView {
	private TreeNode root;

	@ManagedProperty(value="#{controlView}")
	private ControlView controlView;
	
	private TreeNode selectedNode;
	
	@PostConstruct
	public void init() {
		root = new DefaultTreeNode("Root", null);
		TreeNode node0 = this.getRootTreeNode(root,"System","");
		TreeNode node1 = this.getRootTreeNode(root, "E-HRM", "");
		TreeNode node2 = this.getRootTreeNode(root, "Inventory", "");

		TreeNode node00 = new DefaultTreeNode(new MenuItemDto("General",""), node0);
		TreeNode node01 = new DefaultTreeNode(new MenuItemDto("Structure",""), node0);

		TreeNode node10 = new DefaultTreeNode(new MenuItemDto("OM",""), node1);
		TreeNode node11 = new DefaultTreeNode(new MenuItemDto("PIM",""), node1);
		
		TreeNode node20 = this.getRootTreeNode(node2,"Product Information","");
		TreeNode node21 = this.getRootTreeNode(node2,"UOM","");

		node1.getChildren().add(new DefaultTreeNode(new MenuItemDto("Node 1.1","")));
		node00.getChildren().add(new DefaultTreeNode(new MenuItemDto("Node 0.0.0","app/org/general")));
		node00.getChildren().add(new DefaultTreeNode(new MenuItemDto("Node 0.0.1","app/org/structure")));
		node01.getChildren().add(new DefaultTreeNode(new MenuItemDto("Node 0.1.0","")));
		node10.getChildren().add(new DefaultTreeNode(new MenuItemDto("Node 1.0.0","")));
		
		this.getRootTreeNode(node20,"view","app/product-info/product-carousel");
	}


	private TreeNode getRootTreeNode(TreeNode parent,String menuName,String outcome){
		return new DefaultTreeNode(new MenuItemDto(menuName,outcome),parent);
	}
	
	public TreeNode getRoot() {
		return root;
	}


	public ControlView getControlView() {
		return controlView;
	}


	public void setControlView(ControlView controlView) {
		this.controlView = controlView;
	}


	public TreeNode getSelectedNode() {
		return selectedNode;
	}


	public void setSelectedNode(TreeNode selectedNode) {
		this.selectedNode = selectedNode;
		if(this.selectedNode != null){
			MenuItemDto menu = (MenuItemDto)this.selectedNode.getData();
			System.out.println(menu.getName());
		}
	}
}
