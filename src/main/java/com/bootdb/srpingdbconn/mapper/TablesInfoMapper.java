package com.bootdb.srpingdbconn.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TablesInfoMapper extends BaseMapper<String> {
//    @Select("SHOW TABLES")
    public List<String> showTables();
}
