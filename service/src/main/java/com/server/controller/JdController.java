package com.server.controller;

import com.enums.StatusCode;
import com.reponse.DataResponse;
import com.service.JdService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author:yh
 * @date:2019/6/25 22:22
 */
@RestController
public class JdController {

    public static final Logger logger = LoggerFactory.getLogger(JdController.class);

    @Autowired
    private JdService jdService;

    @RequestMapping(value = "/requestOne",method = RequestMethod.GET)
    public DataResponse requestOne(){
        DataResponse response;
        try {
            response = jdService.findAll();
        }catch (Exception e){
            logger.error("requestFirst方法调用异常：" + e.getMessage());
            response = new DataResponse(StatusCode.Fail);
        }
        return response;
    }
}
