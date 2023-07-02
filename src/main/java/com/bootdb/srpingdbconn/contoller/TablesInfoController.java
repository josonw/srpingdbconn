package com.bootdb.srpingdbconn.contoller;


import com.bootdb.srpingdbconn.service.TablesInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TablesInfoController {
    @Autowired
    private TablesInfoService  TablesInfoService;
    @RequestMapping("/get")
    public  List<String> getTables(){
        List<String> tables = TablesInfoService.getTables();

        return  tables;
    }
}
