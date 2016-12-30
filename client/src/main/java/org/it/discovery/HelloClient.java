package org.it.discovery;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("hello")
public interface HelloClient {

    @RequestMapping("/hello/{name}")
    String handshake(@PathVariable("name") String name);
}
