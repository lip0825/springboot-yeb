package com.lp.server.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.lp.server.entity.MenuRole;
import com.lp.server.entity.RespBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lp
 * @since 2021-07-27
 */
public interface IMenuRoleService extends IService<MenuRole> {

    RespBean updateMenuRole(Integer rid,Integer[] mids);
}
