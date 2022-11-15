package com.trus.dubbo_provider.ServiceImpl;

import com.trus.dubbo_common.Service.SiteService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

@DubboService(version = "v1")
@Service
public class SiteServlceImpl implements SiteService {
    @Override
    public String getName(String name) {
        return "U are "+name;
    }





}
