package com.example.demo.models;

public abstract class Notification {
    private int id;
    private String messaje;
    private int channel;
    private User user;

    public Notification(int id, String messaje, int channel) {
        this.id=id;
        this.messaje=messaje;
        this.channel=channel;
    }

    public abstract void sendNotification();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessaje() {
        return messaje;
    }

    public void setMessaje(String messaje) {
        this.messaje = messaje;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

