package com.lp.server.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.lp.server.entity.Menu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lp
 * @since 2021-07-27
 */
public interface IMenuService extends IService<Menu> {

    List<Menu> getMenusByAdminId();

    List<Menu> getAllMenuWithRole();

    List<Menu> getAllMenus();
}
