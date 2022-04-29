package cj.test.feigin.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 发布用户信息查询相关的接口
 */
//指定url即跳过了注册中心
//@FeignClient(value = "cj-life-middle-uc",url = "localhost:8080")
@FeignClient(name= "cj-life-middle-uc")
public interface FeignTest {

    /**
     * 增量更新用户信息
     */
    @RequestMapping("/uc/api/v2/test/get-all")
    public Object getAll();
}