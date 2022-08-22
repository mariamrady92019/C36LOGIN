package com.example.c36login.models;

public class PostModel {
    private String name ;
    private String time ;
    private String postDetails ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPostDetails() {
        return postDetails;
    }

    public void setPostDetails(String postDetails) {
        this.postDetails = postDetails;
    }

    public int getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(int profileImage) {
        this.profileImage = profileImage;
    }

    public int getPostImage() {
        return postImage;
    }

    public void setPostImage(int postImage) {
        this.postImage = postImage;
    }

    private  int profileImage;
    private  int  postImage ;

    public PostModel(String name, String time, String postDetails, int prifileImage, int postImage) {
        this.name = name;
        this.time = time;
        this.postDetails = postDetails;
        this.profileImage = prifileImage;
        this.postImage = postImage;
    }
}
