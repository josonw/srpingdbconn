package com.bootdb.srpingdbconn;


import com.bootdb.srpingdbconn.mapper.TablesInfoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class FunctionTest {

    @Autowired
    private TablesInfoMapper tablesInfoMapper;

    @Test
    public void testselect(){
        List<String> strings = tablesInfoMapper.showTables();
        System.out.println(strings);


    }
}
