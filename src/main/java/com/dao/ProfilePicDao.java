package com.dao;

import com.model.ProfilePic;

public interface ProfilePicDao {


void uploadProfilePic(ProfilePic profilePic);

ProfilePic getImage(String email);
}
