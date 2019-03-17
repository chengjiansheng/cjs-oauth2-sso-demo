package com.cjs.sso.repository;

import com.cjs.sso.entity.SysPermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author ChengJianSheng
 * @date 2019-02-12
 */
public interface SysPermissionRepository extends JpaSpecificationExecutor<SysPermission>, JpaRepository<SysPermission, Integer> {

    @Query(value = "SELECT * FROM sys_permission WHERE id IN (:ids)", nativeQuery = true)
    List<SysPermission> findByIds(@Param("ids") List<Integer> ids);

}
