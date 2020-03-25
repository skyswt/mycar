package cn.hyperchain.service;

import cn.hyperchain.dto.DataGridResult;
import cn.hyperchain.dto.QueryDTO;
import cn.hyperchain.pojo.SysMenu;
import cn.hyperchain.utils.R;

import java.util.List;

public interface MenuService {
    public DataGridResult findMenu(QueryDTO queryDTO);

    public R deleteMenu(List<Long> ids);

    public R selectMenu();

    public R saveMenu(SysMenu sysMenu);

    public R findMenuById(Long menuId);

    public R updateMenu(SysMenu sysMenu);

    public List<String> findPermsByUserId(Long userId);

    public R findUserMenu(Long userId);

}
