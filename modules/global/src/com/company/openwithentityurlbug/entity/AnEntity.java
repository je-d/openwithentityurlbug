package com.company.openwithentityurlbug.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "OPENWITHENTITYURLBUG_AN_ENTITY")
@Entity(name = "openwithentityurlbug_AnEntity")
public class AnEntity extends StandardEntity {
    private static final long serialVersionUID = -1925672467428004708L;

    @Column(name = "A_PROPERTY")
    private String aProperty;

    public String getaProperty() {
        return aProperty;
    }

    public void setaProperty(String aProperty) {
        this.aProperty = aProperty;
    }
}