package com.baidu.springbootdemo.dao;

import com.example.demo.dao.ysxAgentProductBean;

public interface ysxAgentProductBeanMapper {
    int deleteByPrimaryKey(Long agentProductId);

    int insert(ysxAgentProductBean record);

    int insertSelective(ysxAgentProductBean record);

    ysxAgentProductBean selectByPrimaryKey(Long agentProductId);

    int updateByPrimaryKeySelective(ysxAgentProductBean record);

    int updateByPrimaryKeyWithBLOBs(ysxAgentProductBean record);

    int updateByPrimaryKey(ysxAgentProductBean record);
}