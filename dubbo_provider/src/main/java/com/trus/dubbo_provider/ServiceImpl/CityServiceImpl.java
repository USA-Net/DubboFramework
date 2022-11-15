package com.trus.dubbo_provider.ServiceImpl;



import com.trus.dubbo_common.Domain.City;
import com.trus.dubbo_common.Service.CityService;
import org.apache.dubbo.config.annotation.DubboService;


@DubboService(version = "v11")
class CityServiceImpl implements CityService {
    @Override
    public City findCityByName(String cityName) {
        return new City(1L,2L,"ds","guxiang");
    }
}
