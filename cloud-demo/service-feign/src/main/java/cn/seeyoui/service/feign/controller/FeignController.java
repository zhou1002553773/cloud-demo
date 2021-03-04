package cn.seeyoui.service.feign.controller;

import cn.seeyoui.service.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private FeignService feignService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return feignService.sayHiFromClientOne( name );
    }
}
