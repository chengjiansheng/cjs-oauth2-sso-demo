package com.cjs.sso.service;

import com.cjs.sso.entity.SysUser;

/**
 * @author ChengJianSheng
 * @date 2019-02-12
 */
public interface UserService {

    SysUser getByUsername(String username);
}
