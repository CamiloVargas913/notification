package com.example.demo.models;

public abstract class Notification {
    private int id;
    private String messaje;
    private Channel channel;

    public Notification(int id, String messaje, Channel channel) {
        this.id=id;
        this.messaje=messaje;
        this.channel=channel;
    }


}

