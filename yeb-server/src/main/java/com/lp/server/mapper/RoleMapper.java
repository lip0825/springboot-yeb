package com.lp.server.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lp.server.entity.RespBean;
import com.lp.server.entity.Role;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lp
 * @since 2021-07-27
 */
public interface RoleMapper extends BaseMapper<Role> {
    /**
     * 根据用户id获取权限列表
     * @param adminId
     * @return
     */
    List<Role> getRoles(Integer adminId);

}
