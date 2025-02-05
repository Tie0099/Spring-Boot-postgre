package com.example.SSOTEST.repository;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SSOTEST.entity.SSOUserTest;

@Repository
public interface SSOUserTestRepository extends JpaRepository<SSOUserTest, LocalDateTime> {
    // สามารถเพิ่ม query methods ถ้าจำเป็น
}
