package cn.hyperchain.controller;

import cn.hyperchain.dto.DataGridResult;
import cn.hyperchain.dto.QueryDTO;
import cn.hyperchain.log.MyLog;
import cn.hyperchain.pojo.SysMenu;
import cn.hyperchain.service.MenuService;
import cn.hyperchain.utils.R;
import cn.hyperchain.utils.ShiroUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MenuController {

    @Autowired
    private MenuService menuService;

    @MyLog("菜单列表")
    @RequestMapping("/sys/menu/list")
    @ResponseBody
    @RequiresPermissions("sys:menu:list")
    public DataGridResult findMenu(QueryDTO queryDTO){
        return menuService.findMenu(queryDTO);
    }
    @MyLog("菜单删除")
    @RequestMapping("/sys/menu/del")
    @ResponseBody
    public R deleteMenu(@RequestBody List<Long> ids){
        return menuService.deleteMenu(ids);
    }

    @RequestMapping("/sys/menu/select")
    @ResponseBody
    public R selectMenu(){
        return menuService.selectMenu();
    }

    @RequestMapping("/sys/menu/save")
    @ResponseBody
    public R saveMenu(@RequestBody SysMenu sysMenu){
        return menuService.saveMenu(sysMenu);
    }


    @RequestMapping("/sys/menu/info/{menuId}")
    @ResponseBody
    public R findMenuById(@PathVariable("menuId") Long menuId){
        return menuService.findMenuById(menuId);
    }

    @RequestMapping("/sys/menu/update")
    @ResponseBody
    public R updateMenu(@RequestBody SysMenu sysMenu){
        return menuService.updateMenu(sysMenu);
    }

    @RequestMapping("/sys/menu/user")
    @ResponseBody
    public R userMenu(){
        long userId = ShiroUtils.getUserId();
        return menuService.findUserMenu(userId);
    }

}
