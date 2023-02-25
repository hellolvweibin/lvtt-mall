/*
 *@Project ：lvtt-mall
 *@Author  ：Levi_Bee
 *@Date    ：2023/2/25 4:35 下午
 */

package com.lvtt.mall.tiny.service;

import com.lvtt.mall.tiny.mbg.model.UmsAdmin;
import com.lvtt.mall.tiny.mbg.model.UmsPermission;

import java.util.List;

/**
 * 后台管理Service
 * @author levi_bee
 */
public interface UmsAdminService {
    /**
     * @param username 用户名
     * 根据用户名获取后台管理员
     */
    UmsAdmin getAdminByUsername(String username);
    /**
     * @param umsAdminParam 用户
     * 注册功能
     */
    UmsAdmin register(UmsAdmin umsAdminParam);
    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username, String password);

    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     */
    List<UmsPermission> getPermissionList(Long adminId);

}
