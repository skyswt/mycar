package cn.hyperchain.service;

import java.util.List;

public interface RoleService {
    public List<String> findRolsByUserID(Long userId);
}
