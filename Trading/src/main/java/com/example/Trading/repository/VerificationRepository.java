package com.example.Trading.repository;

import com.example.Trading.model.VerificationCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationRepository extends JpaRepository<VerificationCode,Long> {

     VerificationCode findByUserId(Long userId);
}
