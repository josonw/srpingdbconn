package com.bootdb.srpingdbconn.service;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface TablesInfoService extends IService<String> {
    public List<String> getTables();
}
