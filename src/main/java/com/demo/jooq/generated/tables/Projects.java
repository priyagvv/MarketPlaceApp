/*
 * This file is generated by jOOQ.
 */
package com.demo.jooq.generated.tables;


import com.demo.jooq.generated.Indexes;
import com.demo.jooq.generated.Keys;
import com.demo.jooq.generated.Test;
import com.demo.jooq.generated.tables.records.ProjectsRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Projects extends TableImpl<ProjectsRecord> {

    private static final long serialVersionUID = 300968603;

    /**
     * The reference instance of <code>test.PROJECTS</code>
     */
    public static final Projects PROJECTS = new Projects();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProjectsRecord> getRecordType() {
        return ProjectsRecord.class;
    }

    /**
     * The column <code>test.PROJECTS.id</code>.
     */
    public final TableField<ProjectsRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>test.PROJECTS.status</code>.
     */
    public final TableField<ProjectsRecord, String> STATUS = createField(DSL.name("status"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>test.PROJECTS.description</code>.
     */
    public final TableField<ProjectsRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>test.PROJECTS.max_budget</code>.
     */
    public final TableField<ProjectsRecord, Double> MAX_BUDGET = createField(DSL.name("max_budget"), org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>test.PROJECTS.End_date</code>.
     */
    public final TableField<ProjectsRecord, LocalDateTime> END_DATE = createField(DSL.name("End_date"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.inline("2019-12-31 00:00:00", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>test.PROJECTS.lowest_bid</code>.
     */
    public final TableField<ProjectsRecord, Double> LOWEST_BID = createField(DSL.name("lowest_bid"), org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * Create a <code>test.PROJECTS</code> table reference
     */
    public Projects() {
        this(DSL.name("PROJECTS"), null);
    }

    /**
     * Create an aliased <code>test.PROJECTS</code> table reference
     */
    public Projects(String alias) {
        this(DSL.name(alias), PROJECTS);
    }

    /**
     * Create an aliased <code>test.PROJECTS</code> table reference
     */
    public Projects(Name alias) {
        this(alias, PROJECTS);
    }

    private Projects(Name alias, Table<ProjectsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Projects(Name alias, Table<ProjectsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Projects(Table<O> child, ForeignKey<O, ProjectsRecord> key) {
        super(child, key, PROJECTS);
    }

    @Override
    public Schema getSchema() {
        return Test.TEST;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PROJECTS_PRIMARY);
    }

    @Override
    public Identity<ProjectsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PROJECTS;
    }

    @Override
    public UniqueKey<ProjectsRecord> getPrimaryKey() {
        return Keys.KEY_PROJECTS_PRIMARY;
    }

    @Override
    public List<UniqueKey<ProjectsRecord>> getKeys() {
        return Arrays.<UniqueKey<ProjectsRecord>>asList(Keys.KEY_PROJECTS_PRIMARY);
    }

    @Override
    public Projects as(String alias) {
        return new Projects(DSL.name(alias), this);
    }

    @Override
    public Projects as(Name alias) {
        return new Projects(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Projects rename(String name) {
        return new Projects(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Projects rename(Name name) {
        return new Projects(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, Double, LocalDateTime, Double> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}