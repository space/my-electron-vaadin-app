package com.example.application.views.user;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.RolesAllowed;

@PageTitle("User")
@Route(value = "user", layout = MainLayout.class)
@RolesAllowed("USER")
@Uses(Icon.class)
public class UserView extends Composite<VerticalLayout> {

    public UserView() {
        getContent().setHeightFull();
        getContent().setWidthFull();
    }
}
