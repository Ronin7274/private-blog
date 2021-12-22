package org.nuist.privateblogbackend.service;

import org.nuist.privateblogbackend.dao.pojo.SysUser;
import org.nuist.privateblogbackend.vo.Result;
import org.nuist.privateblogbackend.vo.UserVo;

public interface SysUserService {
    SysUser findUserById(Long id);

    SysUser findUser(String account, String password);

    Result findUserInfoByToken(String token);

    SysUser findUserByAccount(String account);

    void save(SysUser sysUser);

    UserVo findUserVoById(Long authorId);
}
