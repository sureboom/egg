package com.ls.checkin;

import com.ls.checkin.mapper.CheckRecordMapper;
import com.ls.checkin.mapper.EmpStateMapper;
import com.ls.checkin.mapper.EmployerMapper;
import com.ls.checkin.mapper.UserMapper;
import com.ls.checkin.service.CheckInOutService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CheckinApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private CheckRecordMapper checkRecordMapper;

    @Autowired
    private EmployerMapper employerMapper;

    @Autowired
    private EmpStateMapper empStateMapper;

    @Autowired
    private CheckInOutService checkInOutService;

    @Test
    void contextLoads() {
    }

    @Test
    public void test(){
        userMapper.selectList(null).forEach(System.out::println);
    }

    @Test
    public void test01(){
        checkRecordMapper.selectList(null).forEach(System.out::println);
    }

    @Test
    public void test02(){
        employerMapper.selectList(null).stream().forEach(System.out::println);
    }

    @Test
    public void test03(){
        empStateMapper.selectList(null).stream().forEach(System.out::println);
    }

    @Test
    public void test04(){
        checkInOutService.signInOrOut(1L,2);
    }

    @Test
    public void test05(){
        checkInOutService.queryAllSignRecord();
    }

    @Test
    public void test06(){
        checkInOutService.querySignRecordByAccountOrType("2021229033" , null).stream().forEach(System.out::println);
    }

    @Test
    public void test07(){

    }


}
