package cn.hyperchain.service.impl;

import cn.hyperchain.dao.SysRoleMapper;
import cn.hyperchain.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public List<String> findRolsByUserID(Long userId) {
        return sysRoleMapper.findRolesByUserId(userId);
    }
}
