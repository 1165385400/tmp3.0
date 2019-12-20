package com.example.rtu.controller;



import com.example.rtu.bean.BeanTmp;
import com.example.rtu.mapper.BeanTmpMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(" 注册  ")
public class ControllerBean {

    @Autowired
    private BeanTmpMapper beanTmpMapper;

    @ApiOperation(value = "插入信息",notes = "提交参数：{\"rtu_cd\":\"1233444\",\"regedit_date\":\"11222222222\",\"project_id\":\"11111111\",\"user_id\":\"11111111\"}")
    @ResponseBody
    @PostMapping("/insert")
    public int insertTmp(BeanTmp beanTmp){

        int i = beanTmpMapper.insertTmp(beanTmp);

        return i;


             }

/*    @ResponseBody
    @RequestMapping("/select")

    public BeanTmp selectTmp(){

        BeanTmp beanTmp = beanTmpMapper.selectTmp();

        return beanTmp;

    }

*/
}
