package com.lp.server.utils;

import com.lp.server.entity.Admin;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

/**
 * @description: 操作员工具类
 * @author: lp
 * @create: 2021-08-09
 **/
@Component
public class AdminUtils {

    public Admin getLoginAdmin(){
        return (Admin)(SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }
}
