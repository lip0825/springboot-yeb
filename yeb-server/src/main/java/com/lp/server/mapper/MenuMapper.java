package com.lp.server.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lp.server.entity.Menu;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lp
 * @since 2021-07-27
 */
public interface MenuMapper extends BaseMapper<Menu> {

    List<Menu> getMenusByAdminId(Integer id);

    List<Menu> getAllMenuWithRole();
}
