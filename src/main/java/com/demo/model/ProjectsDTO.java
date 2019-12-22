package com.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDateTime;

public class ProjectsDTO {

    @JsonIgnore
    private int id;
    private String status;
    private String description;
    private Double  max_budget;
    private LocalDateTime end_date;
    private Double lowest_bid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getMax_budget() {
        return max_budget;
    }

    public void setMax_budget(Double max_budget) {
        this.max_budget = max_budget;
    }

    public LocalDateTime getEnd_date() {
        return end_date;
    }

    public void setEnd_date(LocalDateTime end_date) {
        this.end_date = end_date;
    }

    public Double getLowest_bid() {
        return lowest_bid;
    }

    public void setLowest_bid(Double lowest_bid) {
        this.lowest_bid = lowest_bid;
    }

}
