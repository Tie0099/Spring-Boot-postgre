package com.example.SSOTEST.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SSOTEST.entity.SSOUserTest;
import com.example.SSOTEST.repository.SSOUserTestRepository;

@Service
public class SSOUserTestService {

    @Autowired
    private SSOUserTestRepository repository;

    public SSOUserTest saveSSOUserTest(SSOUserTest userTest) {
        userTest.setTokenid(generateToken(userTest));
        return repository.save(userTest);
    }

    private String generateToken(SSOUserTest userTest) {
        return "dummy-token";
    }
}
