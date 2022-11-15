package com.trus.dubbo_common.Domain;


import lombok.Data;

import java.io.Serializable;

@Data
public class City implements Serializable {
    /**
     *
     */
    private Long id;

    private Long provinceId;

    private String cityName;

    private String Description;

    public City(Long id, Long provinceId, String cityName, String description) {
        this.id = id;
        this.provinceId = provinceId;
        this.cityName = cityName;
        Description = description;
    }
}
