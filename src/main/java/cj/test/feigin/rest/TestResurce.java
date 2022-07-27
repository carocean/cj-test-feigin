package cj.test.feigin.rest;

import cj.life.ability.api.annotation.ApiResult;
import cj.life.middle.uc.domain.UcApp;
import cj.test.feigin.remote.FeignTest;
import io.swagger.annotations.Api;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/v1/test")
@Api(tags = {"测试"})
public class TestResurce {
    @Resource
    FeignTest feignTest;
    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/discovery")
    public void discovery() {
        System.out.println(discoveryClient);
    }

    @GetMapping("/getApp")
    @ApiResult
    public UcApp getApp(@RequestParam String appId) {
        return feignTest.getApp(appId);
    }

    @GetMapping("/listApp")
    @ApiResult
    public List<UcApp> listApp(@RequestParam int limit, @RequestParam long offset) {
        return feignTest.listApp(limit, offset).getData();
    }
}
