package com.trus.dubbo_consumer.Controller;


import com.trus.dubbo_common.Service.SiteService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserTest {



    @DubboReference(version = "v1")
    SiteService SiteService1;

    @DubboReference(version = "v2")
    SiteService SiteService2;

    @RequestMapping("/map1/{name}")
    public String getName1(@PathVariable("name") String name)
    {

        String name0 = SiteService1.getName(name);

//
//        List<User> users = userService.queryAll();
//        for (User user : users) {
//            System.out.println(user);
//        }

        return name0;

    }

    @RequestMapping("/map2/{name}")
    public String getName2(@PathVariable("name") String name)
    {

        String name0 = SiteService2.getName(name);

//
//        List<User> users = userService.queryAll();
//        for (User user : users) {
//            System.out.println(user);
//        }

        return name0;

    }

}
