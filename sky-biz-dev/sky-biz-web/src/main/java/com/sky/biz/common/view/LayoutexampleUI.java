package com.sky.biz.common.view;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Accordion;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Label;
import com.vaadin.ui.Tree;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.VerticalSplitPanel;

@SuppressWarnings("serial")
@Theme("sky-biz")
public class LayoutexampleUI extends UI {

	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = LayoutexampleUI.class)
	public static class Servlet extends VaadinServlet {
	}

	@Override
	protected void init(VaadinRequest request) {
		// final VerticalLayout layout = new VerticalLayout();
		// layout.setMargin(true);
		// layout.setSizeFull();
		// setContent(layout);

		final VerticalSplitPanel mainLayout = new VerticalSplitPanel();
		mainLayout.setPrimaryStyleName("v-splitpanel-vertical");
		mainLayout.setSplitPosition(5f);

		setContent(mainLayout);

		HorizontalSplitPanel mainLayout2 = new HorizontalSplitPanel();
		mainLayout2.setPrimaryStyleName("v-splitpanel-horizontal");
		mainLayout2.setSplitPosition(15f);

		HorizontalSplitPanel workingLayout = new HorizontalSplitPanel();
		workingLayout.setPrimaryStyleName("v-splitpanel-horizontal");
		workingLayout.setSplitPosition(80f);
		;

		Button button = new Button("Click Me");
		button.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				mainLayout.setFirstComponent(new Label("Thank you for clicking"));
			}
		});
		mainLayout.setSecondComponent(mainLayout2);
		mainLayout2.setFirstComponent(this.getMenu());
		mainLayout2.setSecondComponent(workingLayout);

		workingLayout.setSecondComponent(button);
	}

	private Component getMenu() {
		String[] tabs = { "System", "Human Resource" };
		Accordion accordion = new Accordion();
		for (String caption : tabs) {
			VerticalLayout tab = new VerticalLayout();
			accordion.addTab(tab, caption);
			// Create Tree
			if (caption.equals("Human Resource")) {
				Tree treeRec = new Tree("Recruitment");
				treeRec.addItem("Set up");
				treeRec.addItem("Manpower");
				treeRec.addItem("Candidate");
				treeRec.addItem("Process");
				// Disallow children for leaves
				treeRec.setChildrenAllowed("Set up", false);
				Tree treeEmp = new Tree("Employee");
				treeEmp.addItem("Setup");
				treeEmp.addItem("Register");
				treeEmp.addItem("Resign");
				// Disallow children for leaves
				treeEmp.setChildrenAllowed("Set up", false);
				tab.addComponent(treeRec);
				tab.addComponent(treeEmp);
			}
		}
		return accordion;

	}
}