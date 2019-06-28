package com.server.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.enums.StatusCode;
import com.model.entity.JdComputer;
import com.model.mapper.JdComputerMapper;
import com.reponse.DataResponse;
import com.service.JdService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * Description:
 *
 * @author:yh
 * @date:2019/6/25 22:56
 */
@Service
public class JdServiceImpl implements JdService {

    public static final Logger logger = LoggerFactory.getLogger(JdServiceImpl.class);

    @Autowired
    private JdComputerMapper jdComputerMapper;

    @Override
    public DataResponse findAll() {
        DataResponse response = new DataResponse(StatusCode.Success);
        try {
            List<JdComputer> list = jdComputerMapper.findAll();
            logger.info("查询返回信息："+ list);
            response.setData(list);
        }catch (Exception e){
            logger.error("JdserviceImpl---findAll方法异常" + e.getMessage());
            response = new DataResponse(StatusCode.Fail);
        }
        return response;
    }
}
