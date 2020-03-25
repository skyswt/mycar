package cn.hyperchain.service;

import cn.hyperchain.dto.DataGridResult;
import cn.hyperchain.dto.QueryDTO;
import cn.hyperchain.pojo.SysUser;
import org.apache.poi.ss.usermodel.Workbook;

import java.util.List;

public interface SysUserService {
    public List<SysUser> findAll();
    public DataGridResult findUserByPage(QueryDTO queryDTO);
    public Workbook exportUser();
    public SysUser findByUsername(String username);
}
