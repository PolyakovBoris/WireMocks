package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.xml.crypto.Data;

@RestController
@RequestMapping(value = "/profiles")
public class ProfileController {
    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping()
    public Profile getProfile() {
        return profileService.getProfile();
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Profile createProfile(@Valid @RequestBody ProfileRequest request){
        return profileService.createProfile(request.login(), request.passwd());
    }

}
