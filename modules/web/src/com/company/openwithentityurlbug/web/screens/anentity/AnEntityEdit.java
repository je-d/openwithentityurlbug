package com.company.openwithentityurlbug.web.screens.anentity;

import com.google.common.collect.ImmutableMap;
import com.haulmont.cuba.gui.Route;
import com.haulmont.cuba.gui.UrlRouting;
import com.haulmont.cuba.gui.screen.*;
import com.company.openwithentityurlbug.entity.AnEntity;

import javax.inject.Inject;

@Route("AnEntityRoute")
@UiController("openwithentityurlbug_AnEntity.edit")
@UiDescriptor("an-entity-edit.xml")
@EditedEntityContainer("anEntityDc")
@LoadDataBeforeShow
public class AnEntityEdit extends StandardEditor<AnEntity> {
    @Inject
    private UrlRouting urlRouting;

    @Subscribe
    public void onAfterShow(AfterShowEvent event) {
        generateRoute();
    }



    public void generateRoute() {
        if (getEditedEntity() != null) {
            String routeToSelectedRole = urlRouting.getRouteGenerator()
                    .getEditorRoute(getEditedEntity(), ImmutableMap.of("tab", "risikobeurteilungTab"));
            //http://localhost:8080/oweub/#main/AnEntityRoute?id=7s2gpvx3shsctq82q2b5k2axvb

        }
    }
}