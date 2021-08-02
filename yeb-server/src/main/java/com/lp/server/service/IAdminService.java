package com.lp.server.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.lp.server.entity.Admin;
import com.lp.server.entity.RespBean;
import com.lp.server.entity.Role;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lp
 * @since 2021-07-27
 */
public interface IAdminService extends IService<Admin> {
    /**
     * 登录之后返回token
     * @param username
     * @param password
     * @param request
     * @return
     */
    RespBean login(String username, String password, String code,HttpServletRequest request);

    Admin getAdminByUserName(String username);

    /**
     * 根据用户id获取权限列表
     * @param adminId
     * @return
     */
    List<Role> getRoles(Integer adminId);
}
