package com.example.Trading.service;

import com.example.Trading.model.TwoFactorOTP;
import com.example.Trading.model.User;

public interface TwoFactorOtpService {


    TwoFactorOTP createTwoFactorOtp(User user,String otp,String jwt);

    TwoFactorOTP findByUser(Long userId);

    TwoFactorOTP findById(String id);

    boolean verifyTwoFactorOtp(TwoFactorOTP twoFactorOTP,String otp);

    void deleteTwoFactorOtp(TwoFactorOTP twoFactorOTP);
}
