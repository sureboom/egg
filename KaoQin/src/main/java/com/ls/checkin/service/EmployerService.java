package com.ls.checkin.service;

import com.ls.checkin.vo.QueryEmpInfoResp;
import com.ls.checkin.vo.QueryEmpStateResp;
import com.ls.checkin.entity.Employer;

import java.util.List;

public interface EmployerService {

    /**
     * 查询全部员工信息
     * @return
     */
    List<QueryEmpInfoResp> queryAllEmployeeInfo();

    /**
     * 根据id查询员工信息
     * @param empId
     * @return
     */
    Employer queryEmpInfoById(long empId);

    /**
     * 根据账号查询员工
     * @param account
     * @return
     */
    Employer findByAccount(String account);

    /**
     * 查询全部经理信息
     * @return
     */
    List<QueryEmpInfoResp> queryAllEmployerInfo();

    /**
     * 登录，登录后返回该员工信息
     * @param account
     * @param password
     * @return
     */
    Employer login(String account , String password);

    /**
     * 新增员工信息，
     * @param employer
     * @return
     */
    boolean insertEmpInfo(Employer employer);

    /**
     * 查询公司全部人员的状态
     * @return
     */
    List<QueryEmpStateResp> queryEmpState();

    /**
     * 查询当前用户的状态
     * @param empId
     * @return
     */
    Integer queryEmpStateById(long empId);

    /**
     * 修改员工密码
     * @param empId
     * @return
     */
    Boolean updatePassword(long empId,String password);


    /**
     * 更新员工信息（手机号、邮箱、头像）
     *
     * @param employer 更新后的员工对象
     * @return 是否更新成功
     */
    boolean updateInfo(Employer employer);


}
