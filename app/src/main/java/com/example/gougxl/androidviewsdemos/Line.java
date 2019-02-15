package com.example.gougxl.androidviewsdemos;

import java.util.UUID;

public class Line {
    UUID lineid;
    String lineword;
    public Line(){
        lineid = UUID.randomUUID();
    }

    public Line getline (){
        return new Line();
    }

    public String getLineword() {
        return lineword;
    }

    public UUID getLineid() {
        return lineid;
    }

    public void setLineid(UUID lineid) {
        this.lineid = lineid;
    }

    public void setLineword(String lineword) {
        this.lineword = lineword;
    }
}
