package com.sem4.Model.ModelDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserDAO {

    @Autowired
    private PasswordEncoder passwordEncoder;
}
