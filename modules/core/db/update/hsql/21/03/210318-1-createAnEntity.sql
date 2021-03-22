create table OPENWITHENTITYURLBUG_AN_ENTITY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    A_PROPERTY varchar(255),
    --
    primary key (ID)
);