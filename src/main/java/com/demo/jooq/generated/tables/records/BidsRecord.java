/*
 * This file is generated by jOOQ.
 */
package com.demo.jooq.generated.tables.records;


import com.demo.jooq.generated.tables.Bids;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


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
public class BidsRecord extends UpdatableRecordImpl<BidsRecord> implements Record5<Integer, Integer, String, Double, Byte> {

    private static final long serialVersionUID = -25856322;

    /**
     * Setter for <code>test.BIDS.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>test.BIDS.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>test.BIDS.project_id</code>.
     */
    public void setProjectId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>test.BIDS.project_id</code>.
     */
    public Integer getProjectId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>test.BIDS.username</code>.
     */
    public void setUsername(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>test.BIDS.username</code>.
     */
    public String getUsername() {
        return (String) get(2);
    }

    /**
     * Setter for <code>test.BIDS.bid_price</code>.
     */
    public void setBidPrice(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>test.BIDS.bid_price</code>.
     */
    public Double getBidPrice() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>test.BIDS.auto_bid</code>.
     */
    public void setAutoBid(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>test.BIDS.auto_bid</code>.
     */
    public Byte getAutoBid() {
        return (Byte) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Integer, String, Double, Byte> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, Integer, String, Double, Byte> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Bids.BIDS.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Bids.BIDS.PROJECT_ID;
    }

    @Override
    public Field<String> field3() {
        return Bids.BIDS.USERNAME;
    }

    @Override
    public Field<Double> field4() {
        return Bids.BIDS.BID_PRICE;
    }

    @Override
    public Field<Byte> field5() {
        return Bids.BIDS.AUTO_BID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getProjectId();
    }

    @Override
    public String component3() {
        return getUsername();
    }

    @Override
    public Double component4() {
        return getBidPrice();
    }

    @Override
    public Byte component5() {
        return getAutoBid();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getProjectId();
    }

    @Override
    public String value3() {
        return getUsername();
    }

    @Override
    public Double value4() {
        return getBidPrice();
    }

    @Override
    public Byte value5() {
        return getAutoBid();
    }

    @Override
    public BidsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public BidsRecord value2(Integer value) {
        setProjectId(value);
        return this;
    }

    @Override
    public BidsRecord value3(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public BidsRecord value4(Double value) {
        setBidPrice(value);
        return this;
    }

    @Override
    public BidsRecord value5(Byte value) {
        setAutoBid(value);
        return this;
    }

    @Override
    public BidsRecord values(Integer value1, Integer value2, String value3, Double value4, Byte value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BidsRecord
     */
    public BidsRecord() {
        super(Bids.BIDS);
    }

    /**
     * Create a detached, initialised BidsRecord
     */
    public BidsRecord(Integer id, Integer projectId, String username, Double bidPrice, Byte autoBid) {
        super(Bids.BIDS);

        set(0, id);
        set(1, projectId);
        set(2, username);
        set(3, bidPrice);
        set(4, autoBid);
    }
}