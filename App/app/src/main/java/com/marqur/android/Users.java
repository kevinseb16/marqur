package com.marqur.android;

import java.util.List;

public class Users {
    public String user_id;
    public String username;
    public String email_id;
    public String date_joined;
    public int upvotes;
    public int downvotes;
    public List<Double> location;
    public List<String> markers;

    public Users() {

    }

    public Users(String user_id, String username, String email_id, String date_joined, int upvotes, int downvotes, List<Double> location, List<String> markers) {
        this.user_id = user_id;
        this.username = username;
        this.email_id = email_id;
        this.date_joined = date_joined;
        this.upvotes = upvotes;
        this.downvotes = downvotes;
        this.location = location;
        this.markers = markers;
    }
}
