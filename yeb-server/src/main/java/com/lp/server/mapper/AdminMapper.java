package com.lp.server.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lp.server.entity.Admin;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lp
 * @since 2021-07-27
 */
public interface AdminMapper extends BaseMapper<Admin> {
    /**
     * 根据关键词获取所有操作员
     * @param id
     * @param keywords
     * @return
     */
    List<Admin> getAdminByKey(Integer id, String keywords);
}
