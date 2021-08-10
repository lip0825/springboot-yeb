package com.lp.server.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.lp.server.entity.Department;
import com.lp.server.entity.RespBean;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lp
 * @since 2021-07-27
 */
public interface IDepartmentService extends IService<Department> {

    /**
     * 查询所有部门
     * @return
     */
    List<Department> getAllDepartment();

    /**
     * 添加部门
     * @param department
     * @return
     */
    RespBean addDepartment(Department department);

    RespBean deleteDepartment(Integer id);
}
