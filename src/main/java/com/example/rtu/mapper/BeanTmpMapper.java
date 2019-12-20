package com.example.rtu.mapper;

import com.example.rtu.bean.BeanTmp;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface BeanTmpMapper {

    //注册RTU
    @Insert("insert into b_rtu_regedit(rtu_cd,regedit_date,project_id,user_id) values (#{rtu_cd},#{regedit_date},#{project_id},#{user_id})" )
    public int insertTmp(BeanTmp beanTmp);


    //更改RTU

/*
    //查找RTU
    @Select("select * from b_rtu_regedit")
    public BeanTmp selectTmp();
    */

}
