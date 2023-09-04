package com.example.demo;

public interface ProfileService {
    Profile getProfile();
    Profile createProfile(String login, String passwd);
}
