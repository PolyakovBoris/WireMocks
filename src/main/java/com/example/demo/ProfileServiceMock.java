package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class ProfileServiceMock implements ProfileService{
    @Override
    public Profile getProfile() {
        // имитируем обращение к БД
        return new Profile(
                "Иван",
                "Иванов",
                "2023-04-09"
        );
    }
    @Override
    public Profile createProfile(String login, String passwd) {
        CurrentDate date = new CurrentDate();
        return new Profile(
                login,
                passwd,
                date.getCurrentDate()
        );
    }

}
