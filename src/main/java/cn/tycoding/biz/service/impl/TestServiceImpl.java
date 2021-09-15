package cn.tycoding.biz.service.impl;


import cn.tycoding.biz.entity.TestEntity;
import cn.tycoding.biz.mapper.TestMapper;
import cn.tycoding.biz.service.TestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tycoding
 * @date 2020/6/27
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, TestEntity> implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<TestEntity> findByTestId(Long id) {
        return testMapper.findByTestId(id);
    }


}
