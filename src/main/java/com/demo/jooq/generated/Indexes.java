/*
 * This file is generated by jOOQ.
 */
package com.demo.jooq.generated;


import com.demo.jooq.generated.tables.Bids;
import com.demo.jooq.generated.tables.Projects;
import com.demo.jooq.generated.tables.Users;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>test</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index BIDS_PRIMARY = Indexes0.BIDS_PRIMARY;
    public static final Index BIDS_PROJECT_ID = Indexes0.BIDS_PROJECT_ID;
    public static final Index PROJECTS_PRIMARY = Indexes0.PROJECTS_PRIMARY;
    public static final Index USERS_PRIMARY = Indexes0.USERS_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index BIDS_PRIMARY = Internal.createIndex("PRIMARY", Bids.BIDS, new OrderField[] { Bids.BIDS.ID }, true);
        public static Index BIDS_PROJECT_ID = Internal.createIndex("project_id", Bids.BIDS, new OrderField[] { Bids.BIDS.PROJECT_ID, Bids.BIDS.BID_PRICE }, false);
        public static Index PROJECTS_PRIMARY = Internal.createIndex("PRIMARY", Projects.PROJECTS, new OrderField[] { Projects.PROJECTS.ID }, true);
        public static Index USERS_PRIMARY = Internal.createIndex("PRIMARY", Users.USERS, new OrderField[] { Users.USERS.USERNAME }, true);
    }
}
