package com.neuralgalaxy.ngiqdeviceserver.api;


import com.neuralgalaxy.ngiqdeviceserver.api.model.UserModel;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
public interface UserService {

    String getUserName(Long id);

    UserModel addUser(UserModel user);
}
