package com.driver;

import java.util.List;

public class Group {
    private String name;
    private int numberOfParticipants;
    private List<User> userList;
    private User admin;

    public Group(String name, int numberOfParticipants, List<User> userList, User admin) {
        this.name = name;
        this.numberOfParticipants = numberOfParticipants;
        this.userList = userList;
        this.admin = admin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public User getAdmin() {
        return admin;
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }
}
