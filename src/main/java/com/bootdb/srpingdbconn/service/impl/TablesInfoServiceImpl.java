package com.bootdb.srpingdbconn.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bootdb.srpingdbconn.mapper.TablesInfoMapper;
import com.bootdb.srpingdbconn.service.TablesInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TablesInfoServiceImpl extends ServiceImpl<TablesInfoMapper, String> implements TablesInfoService {
    @Autowired
    private TablesInfoMapper tbmaper;

    @Override
    public List<String> getTables() {
        List<String> s = tbmaper.showTables();
        System.out.println("------------"+s);
        return s;
    }
}
