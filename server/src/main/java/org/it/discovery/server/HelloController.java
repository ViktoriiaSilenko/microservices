package org.it.discovery.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletRequest;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private ServletRequest servletRequest;

    @RequestMapping("/{name}")
    public String getHello(@PathVariable("name") String name) {

        return "Hello " + name + " from " + servletRequest.getRemoteHost() + ":" +servletRequest.getRemotePort();
    }

}
