package com.cjs.sso.service.impl;

import com.cjs.sso.entity.SysUser;
import com.cjs.sso.repository.SysUserRepository;
import com.cjs.sso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ChengJianSheng
 * @date 2019-02-12
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SysUserRepository sysUserRepository;

    @Override
    public SysUser getByUsername(String username) {
        return sysUserRepository.findByUsername(username);
    }
}
