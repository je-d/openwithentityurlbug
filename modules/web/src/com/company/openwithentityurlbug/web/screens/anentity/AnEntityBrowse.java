package com.company.openwithentityurlbug.web.screens.anentity;

import com.google.common.collect.ImmutableMap;
import com.haulmont.cuba.gui.Route;
import com.haulmont.cuba.gui.UrlRouting;
import com.haulmont.cuba.gui.screen.*;
import com.company.openwithentityurlbug.entity.AnEntity;

import javax.inject.Inject;

@UiController("openwithentityurlbug_AnEntity.browse")
@UiDescriptor("an-entity-browse.xml")
@LookupComponent("anEntitiesTable")
@LoadDataBeforeShow
public class AnEntityBrowse extends StandardLookup<AnEntity> {

}