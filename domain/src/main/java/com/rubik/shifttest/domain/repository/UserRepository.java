package com.rubik.shifttest.domain.repository;

import com.rubik.shifttest.domain.models.UserRegisterCredential;

public interface UserRepository {
    boolean saveUserRegisterCredential(UserRegisterCredential userRegisterCredential);
    UserRegisterCredential getUserRegisterCredential();
}