package cj.test.feigin.rest;

import cj.test.feigin.remote.FeignTest;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class TestResurce {
    @Resource
    FeignTest feignTest;
    @Resource
    private DiscoveryClient discoveryClient;
    @GetMapping("/discovery")
    public void discovery() {
        System.out.println(discoveryClient);
    }
    @GetMapping("/get-all")
    public Object getAll(){
        return feignTest.getAll();
    }

}
