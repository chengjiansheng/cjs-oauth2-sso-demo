package com.cjs.sso.service;

import com.cjs.sso.entity.SysPermission;

import java.util.List;

/**
 * @author ChengJianSheng
 * @date 2019-02-12
 */
public interface PermissionService {

    List<SysPermission> findByUserId(Integer userId);

}
