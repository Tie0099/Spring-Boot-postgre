package com.example.SSOTEST.controller;


import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SSOTEST.entity.SSOUserTest;
import com.example.SSOTEST.model.ResponseMessage;
import com.example.SSOTEST.model.SSOUserTestRequest;
import com.example.SSOTEST.service.SSOUserTestService;

@RestController
@RequestMapping("/apitest")
public class SSOUserTestController {

    @Autowired
    private SSOUserTestService service;

    @PostMapping("/gentoken")
    public ResponseEntity<?> generateToken(@RequestBody SSOUserTestRequest userTestRequest) {
        try {
            SSOUserTest userTest = new SSOUserTest();
            
            userTest.setSsotype(userTestRequest.getSsotype());
            userTest.setSystemid(userTestRequest.getSystemid());
            userTest.setSystemname(userTestRequest.getSystemname());
            userTest.setSystemtransactions(userTestRequest.getSystemtransactions());
            userTest.setSystemprivileges(userTestRequest.getSystemprivileges());
            userTest.setSystemusergroup(userTestRequest.getSystemusergroup());
            userTest.setSystemlocationgroup(userTestRequest.getSystemlocationgroup());
            userTest.setUserid(userTestRequest.getUserid());
            userTest.setUserfullname(userTestRequest.getUserfullname());
            userTest.setUserrdofficecode(userTestRequest.getUserrdofficecode());
            userTest.setUserofficecode(userTestRequest.getUserofficecode());
            userTest.setClientlocation(userTestRequest.getClientlocation());
            userTest.setLocationmachinenumber(userTestRequest.getLocationmachinenumber());
            userTest.setTokenid(userTestRequest.getTokenid());
            
            userTest.setRequestDate(LocalDateTime.now());
    
            SSOUserTest savedUserTest = service.saveSSOUserTest(userTest);
            
            if (savedUserTest != null) {
                return ResponseEntity.ok().body(
                    new ResponseMessage("I07000", "ทำการเรียบร้อยแล้ว", savedUserTest.getUserid(), savedUserTest.getTokenid())
                );
            } else {
                return ResponseEntity.status(400).body(new ResponseMessage("E000001", "ไม่สามารถบันทึกข้อมูลลงฐานข้อมูลได้", "", ""));
            }
        } catch (Exception e) {
            return ResponseEntity.status(500).body(new ResponseMessage("E000001", "ไม่สามารถเชื่อมต่อฐานข้อมูลได้", "", ""));
        }
    }
    
}
