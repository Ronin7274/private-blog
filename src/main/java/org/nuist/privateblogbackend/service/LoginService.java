package org.nuist.privateblogbackend.service;

import org.nuist.privateblogbackend.dao.pojo.SysUser;
import org.nuist.privateblogbackend.vo.Result;
import org.nuist.privateblogbackend.vo.params.LoginParam;


public interface LoginService {
    /**
     * 登录
     * @param loginParam
     * @return
     */
    Result login(LoginParam loginParam);

    /**
     * 验证token
     * @param token
     * @return
     */
    SysUser checkToken(String token);

    /**
     * 注销
     * @param token
     * @return
     */
    Result logout(String token);
}
