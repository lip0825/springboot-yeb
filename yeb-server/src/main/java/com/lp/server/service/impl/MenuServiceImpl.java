package com.lp.server.service.impl;

import com.lp.server.entity.Admin;
import com.lp.server.entity.Menu;
import com.lp.server.mapper.MenuMapper;
import com.lp.server.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lp
 * @since 2021-07-27
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    /**
     * 通过用户Id获取菜单列表
     * @return
     */
    @Override
    public List<Menu> getMenusByAdminId() {
        Integer id = ((Admin)(SecurityContextHolder.getContext().getAuthentication().getPrincipal())).getId();
        ValueOperations<String,Object> valueOperations = redisTemplate.opsForValue();
        //查询缓存中是否有数据
        List<Menu> menus = (List<Menu>) valueOperations.get("menu_" + id);
        if (CollectionUtils.isEmpty(menus)){
            menus = menuMapper.getMenusByAdminId(id);
            valueOperations.set("menu_"+id,menus);
        }
        return menus;
    }

    /**
     * 通过角色获取菜单列表
     * @return
     */
    @Override
    public List<Menu> getAllMenuWithRole() {
        return menuMapper.getAllMenuWithRole();
    }

    @Override
    public List<Menu> getAllMenus() {
        return menuMapper.getAllMenus();
    }
}
