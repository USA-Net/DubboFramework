package com.trus.dubbo_consumer.Controller;


import com.trus.dubbo_common.Domain.City;
import com.trus.dubbo_common.Service.CityService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class DubboConsumer1 {

//    @DubboReference(version = "v1")
//    private SiteService siteService;
//
//    @GetMapping("getName")
//    public String getName(String name)
//    {
//        return siteService.getName(name);
//    }
//

    @DubboReference(version = "v1")
    private CityService cityService;

    public void printCity(){
        String cityName = "OPOP";
        City city = cityService.findCityByName(cityName);
        System.out.println(city.toString());
    }



}
