package cn.tycoding.biz.service;

import cn.tycoding.biz.entity.TestEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface TestService extends IService<TestEntity> {

    List<TestEntity> findByTestId(Long id);
}
