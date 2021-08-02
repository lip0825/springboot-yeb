package com.lp.server.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lp.server.entity.Role;
import com.lp.server.mapper.RoleMapper;
import com.lp.server.service.IRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lp
 * @since 2021-07-27
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
