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
            
            userTest.setSsotype(userTestRequest.getSsoType());
            userTest.setSystemid(userTestRequest.getSystemId());
            userTest.setSystemname(userTestRequest.getSystemName());
            userTest.setSystemtransactions(userTestRequest.getSystemTransactions());
            userTest.setSystemprivileges(userTestRequest.getSystemPrivileges());
            userTest.setSystemusergroup(userTestRequest.getSystemUserGroup());
            userTest.setSystemlocationgroup(userTestRequest.getSystemLocationGroup());
            userTest.setUserid(userTestRequest.getUserId());
            userTest.setUserfullname(userTestRequest.getUserFullName());
            userTest.setUserrdofficecode(userTestRequest.getUserRdOfficeCode());
            userTest.setUserofficecode(userTestRequest.getUserRdOfficeCode());
            userTest.setClientlocation(userTestRequest.getClientLocation());
            userTest.setLocationmachinenumber(userTestRequest.getLocationMachineNumber());
            userTest.setTokenid(userTestRequest.getTokenId());
            
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
