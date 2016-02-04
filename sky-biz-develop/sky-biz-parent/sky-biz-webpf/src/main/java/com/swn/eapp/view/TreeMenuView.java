package com.swn.eapp.view;

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
		TreeNode node0 = new DefaultTreeNode(new MenuItemDto("System",""), root);
		TreeNode node1 = new DefaultTreeNode(new MenuItemDto("E-HRM",""), root);

		TreeNode node00 = new DefaultTreeNode(new MenuItemDto("General",""), node0);
		TreeNode node01 = new DefaultTreeNode(new MenuItemDto("Structure",""), node0);

		TreeNode node10 = new DefaultTreeNode(new MenuItemDto("OM",""), node1);
		TreeNode node20 = new DefaultTreeNode(new MenuItemDto("PIM",""), node1);

		node1.getChildren().add(new DefaultTreeNode(new MenuItemDto("Node 1.1","")));
		node00.getChildren().add(new DefaultTreeNode(new MenuItemDto("Node 0.0.0","app/org/general")));
		node00.getChildren().add(new DefaultTreeNode(new MenuItemDto("Node 0.0.1","app/org/structure")));
		node01.getChildren().add(new DefaultTreeNode(new MenuItemDto("Node 0.1.0","")));
		node10.getChildren().add(new DefaultTreeNode(new MenuItemDto("Node 1.0.0","")));
		root.getChildren().add(new DefaultTreeNode(new MenuItemDto("Node 2","")));
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
