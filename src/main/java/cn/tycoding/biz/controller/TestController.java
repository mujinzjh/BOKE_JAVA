package cn.tycoding.biz.controller;


import cn.tycoding.biz.service.TestService;
import cn.tycoding.common.annotation.Log;
import cn.tycoding.common.constants.CommonConstant;
import cn.tycoding.common.controller.BaseController;
import cn.tycoding.common.utils.R;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(CommonConstant.BASE_API + "/test")
@Api(value = "TestController", tags = {"测试功能接口"})
public class TestController extends BaseController {
    @Autowired
    private TestService testService;

    @GetMapping("/{id}")
    @Log("获取测试信息")
    public R findByTestId(@PathVariable Long id) {return new R<>(testService.getById(id));}

}
