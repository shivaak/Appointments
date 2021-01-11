package com.shiva.appointments.model;

import java.util.Date;

public class AppointmentModel {

    private String type;
    private String description;
    private Date date;

    public AppointmentModel(String type, String description, Date date) {
        this.type = type;
        this.description = description;
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
