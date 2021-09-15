package cn.tycoding.biz.mapper;

import cn.tycoding.biz.entity.TestEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;


public interface TestMapper extends BaseMapper<TestEntity> {
    List<TestEntity> findByTestId(Long id);
}
