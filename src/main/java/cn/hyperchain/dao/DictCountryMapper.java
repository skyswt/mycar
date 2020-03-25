package cn.hyperchain.dao;

import cn.hyperchain.pojo.DictCountry;
import cn.hyperchain.pojo.DictCountryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictCountryMapper {
    int countByExample(DictCountryExample example);

    int deleteByExample(DictCountryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DictCountry record);

    int insertSelective(DictCountry record);

    List<DictCountry> selectByExample(DictCountryExample example);

    DictCountry selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DictCountry record, @Param("example") DictCountryExample example);

    int updateByExample(@Param("record") DictCountry record, @Param("example") DictCountryExample example);

    int updateByPrimaryKeySelective(DictCountry record);

    int updateByPrimaryKey(DictCountry record);
}