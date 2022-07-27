package cj.test.feigin.remote;

import cj.life.ability.api.R;
import cj.life.middle.uc.domain.UcApp;
import cj.test.feigin.ITest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 发布用户信息查询相关的接口
 */
//指定url即跳过了注册中心
@FeignClient(value = "cj-life-middle-uc", url = "${life.feign.docker.external.url:}")
//@FeignClient(name= "cj-life-middle-uc")
public interface FeignTest extends ITest {

    /**
     * 增量更新用户信息
     */
    @RequestMapping("/api/v1/app/getApp")
    public UcApp getApp(@RequestParam String appId);

    @RequestMapping("/api/v1/app/listApp")
    public R<List<UcApp>> listApp(@RequestParam int limit, @RequestParam long offset);
}