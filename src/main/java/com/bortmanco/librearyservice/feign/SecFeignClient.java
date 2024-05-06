package com.bortmanco.librearyservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("sec-service")
public interface SecFeignClient {

    @RequestMapping(method = RequestMethod.POST, value = "api/auth/validateToken")
    boolean validateToken(@RequestHeader("token") String token);


}
