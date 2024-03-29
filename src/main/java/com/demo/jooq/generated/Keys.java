/*
 * This file is generated by jOOQ.
 */
package com.demo.jooq.generated;


import com.demo.jooq.generated.tables.Bids;
import com.demo.jooq.generated.tables.Projects;
import com.demo.jooq.generated.tables.Users;
import com.demo.jooq.generated.tables.records.BidsRecord;
import com.demo.jooq.generated.tables.records.ProjectsRecord;
import com.demo.jooq.generated.tables.records.UsersRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>test</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<BidsRecord, Integer> IDENTITY_BIDS = Identities0.IDENTITY_BIDS;
    public static final Identity<ProjectsRecord, Integer> IDENTITY_PROJECTS = Identities0.IDENTITY_PROJECTS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<BidsRecord> KEY_BIDS_PRIMARY = UniqueKeys0.KEY_BIDS_PRIMARY;
    public static final UniqueKey<ProjectsRecord> KEY_PROJECTS_PRIMARY = UniqueKeys0.KEY_PROJECTS_PRIMARY;
    public static final UniqueKey<UsersRecord> KEY_USERS_PRIMARY = UniqueKeys0.KEY_USERS_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<BidsRecord, Integer> IDENTITY_BIDS = Internal.createIdentity(Bids.BIDS, Bids.BIDS.ID);
        public static Identity<ProjectsRecord, Integer> IDENTITY_PROJECTS = Internal.createIdentity(Projects.PROJECTS, Projects.PROJECTS.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<BidsRecord> KEY_BIDS_PRIMARY = Internal.createUniqueKey(Bids.BIDS, "KEY_BIDS_PRIMARY", Bids.BIDS.ID);
        public static final UniqueKey<ProjectsRecord> KEY_PROJECTS_PRIMARY = Internal.createUniqueKey(Projects.PROJECTS, "KEY_PROJECTS_PRIMARY", Projects.PROJECTS.ID);
        public static final UniqueKey<UsersRecord> KEY_USERS_PRIMARY = Internal.createUniqueKey(Users.USERS, "KEY_USERS_PRIMARY", Users.USERS.USERNAME);
    }
}
