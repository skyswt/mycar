package cn.hyperchain.dao;

import cn.hyperchain.pojo.AdminRoleMenuExample;
import cn.hyperchain.pojo.AdminRoleMenuKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminRoleMenuMapper {
    int countByExample(AdminRoleMenuExample example);

    int deleteByExample(AdminRoleMenuExample example);

    int deleteByPrimaryKey(AdminRoleMenuKey key);

    int insert(AdminRoleMenuKey record);

    int insertSelective(AdminRoleMenuKey record);

    List<AdminRoleMenuKey> selectByExample(AdminRoleMenuExample example);

    int updateByExampleSelective(@Param("record") AdminRoleMenuKey record, @Param("example") AdminRoleMenuExample example);

    int updateByExample(@Param("record") AdminRoleMenuKey record, @Param("example") AdminRoleMenuExample example);
}