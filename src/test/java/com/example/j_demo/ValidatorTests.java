package com.example.j_demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidatorTests {
    Validator validator;

    @BeforeEach
    void freshObject() {
        validator = new Validator();
    }
    @Test
    void validatingPhoneNumberFalseNot0() {
        String phoneNumber = "1234567";
        boolean result = Validator.isPhoneNumberValid(phoneNumber);
        Assertions.assertFalse(result);
    }
    @Test
    void validatingPhoneNumberFalseLess6() {
        String phoneNumber = "01234";
        boolean result = Validator.isPhoneNumberValid(phoneNumber);
        Assertions.assertFalse(result);
    }
    @Test
    void validatingPhoneNumberFalseMore10() {
        String phoneNumber = "01234567890";
        boolean result = Validator.isPhoneNumberValid(phoneNumber);
        Assertions.assertFalse(result);
    }
    @Test
    void validatingPhoneNumberTrue() {
        String phoneNumber = "0123456789";
        boolean result = Validator.isPhoneNumberValid(phoneNumber);
        Assertions.assertTrue(result);
    }
    @Test
    void validatingEmailFalse() {
        String email = "email.email";
        boolean result = Validator.isEmailValid(email);
        Assertions.assertFalse(result);
    }
}
