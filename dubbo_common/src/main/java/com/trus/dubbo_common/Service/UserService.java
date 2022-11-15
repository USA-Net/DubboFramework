package com.trus.dubbo_common.Service;

import com.trus.dubbo_common.Domain.User;
import java.util.List;

public interface UserService {
    /**
     * 查询所有的用户数据
     *
     * @return
     */
    public List<User> queryAll();
}