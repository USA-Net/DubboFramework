package com.trus.dubbo_common.Service;


import com.trus.dubbo_common.Domain.City;

public interface CityService {

    City findCityByName(String cityName);
}
