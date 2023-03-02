package com.jarvis.example.modular.city.service;

import com.jarvis.example.modular.city.entity.City;
import com.jarvis.example.modular.city.mapper.CityMapper;
import com.jarvis.framework.web.service.LongIdSimpleEntityService;

import java.util.List;

/**
 * @author Doug Wang
 * @since 1.8, 2023-03-01 14:41:53
 */
public interface CityService extends LongIdSimpleEntityService<City, CityMapper> {

    /**
     * 根据名称查询
     *
     * @param name 名称
     * @return 城市列表
     */
    List<City> queryByName(String name);

    /**
     * 根据名称获取州列表
     *
     * @param name 名称
     * @return 州列表
     */
    List<City> queryStatesByName(String name);

}
