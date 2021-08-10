package com.lp.server.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lp.server.entity.AdminRole;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lp
 * @since 2021-07-27
 */
public interface AdminRoleMapper extends BaseMapper<AdminRole> {

    Integer addAdminRole(@Param("adminId") Integer adminId, @Param("rids") Integer[] rids);
}
