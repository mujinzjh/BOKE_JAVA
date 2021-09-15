package cn.tycoding.biz.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import java.io.Serializable;

@Data
@TableName(value = "tb_test")
public class TestEntity implements Serializable {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String test;
}
