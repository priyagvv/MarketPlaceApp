package com.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class BidsDTO {

    private Long id;
    private int project_id;
    private String username;
    private Double bid_price;

    @JsonIgnore
    private Double min_price;
    @JsonIgnore
    private boolean auto_bid;

    public Double getMin_price() {
        return min_price;
    }

    public void setMin_price(Double min_price) {
        this.min_price = min_price;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getBid_price() {
        return bid_price;
    }

    public void setBid_price(Double bid_price) {
        this.bid_price = bid_price;
    }

    public boolean isAuto_bid() {
        return auto_bid;
    }

    public void setAuto_bid(boolean auto_bid) {
        this.auto_bid = auto_bid;
    }

}
