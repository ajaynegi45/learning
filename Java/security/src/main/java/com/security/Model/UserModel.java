package com.security.Model;

public class UserModel {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String matchingPassword;

    public UserModel() {
    }
    public UserModel(String firstName, String lastName, String email, String password, String matchingPassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.matchingPassword = matchingPassword;
    }


    //TODO: Getting
    public String getFirstName() {
        System.out.println("Model get 1st Name");
        return firstName;
    }
    public String getLastName() {
        System.out.println("Model get LastName");
        return lastName;
    }
    public String getEmail() {
        System.out.println("Model get email");
        return email;
    }
    public String getPassword() {
        System.out.println("Model get Password");
        return password;
    }
    public String getMatchingPassword() {
        System.out.println("Model get Matching Password");
        return matchingPassword;
    }


    //TODO: Setting

    public void setFirstName(String firstName) {
        System.out.println("Model Set 1st Name");
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        System.out.println("Model Set last Name");
        this.lastName = lastName;
    }
    public void setEmail(String email) {
        System.out.println("Model Set email");
        this.email = email;
    }
    public void setPassword(String password) {
        System.out.println("Model Set Password");
        this.password = password;
    }
    public void setMatchingPassword(String matchingPassword) {
        System.out.println("Model Set Matching Password");
        this.matchingPassword = matchingPassword;
    }
}
