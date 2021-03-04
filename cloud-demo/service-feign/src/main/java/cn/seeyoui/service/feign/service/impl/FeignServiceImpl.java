package cn.seeyoui.service.feign.service.impl;

import cn.seeyoui.service.feign.service.FeignService;
import org.springframework.stereotype.Component;

@Component
public class FeignServiceImpl implements FeignService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
