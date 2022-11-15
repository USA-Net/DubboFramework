package com.trus.dubbo_provider.ServiceImpl;

import com.trus.dubbo_common.Service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Qualifier("siteServlceImpl")
    @Autowired
    SiteService SiteServiceImplV2;

    @RequestMapping("/getUser/{username}")
    public String getUser(@PathVariable("username") String username){

        String name = SiteServiceImplV2.getName(username);
        return name;
    }
}
