package com.lp.server.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lp.server.entity.Department;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lp
 * @since 2021-07-27
 */
public interface DepartmentMapper extends BaseMapper<Department> {
    /**
     * 查询所有部门
     * @return
     */
    List<Department> getAllDepartment(Integer parentId);

    /**
     * 添加部门
     * @param department
     */
    void addDepartment(Department department);

    void deleteDepartment(Department department);
}
