package com.sp.main.SecurityConfig;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncodePassword {

        public static void main(String[] args) {
            String rawPassword = "tanu123";
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            String encoded = encoder.encode(rawPassword);
            System.out.println("Encoded password: " + encoded);
        }
    }


