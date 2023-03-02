package com.jarvis.example.modular.city.mapper;

import com.jarvis.example.modular.city.entity.City;
import com.jarvis.framework.mybatis.mapper.LongIdSimpleEntityMapper;
import com.jarvis.framework.search.Page;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Doug Wang
 * @since 1.8, 2023-03-01 13:57:05
 */
@Mapper
public interface CityMapper extends LongIdSimpleEntityMapper<City> {

    /**
     * 根据名称查询
     *
     * @param name 名称
     * @param page 分页
     * @return 城市列表
     */
    List<City> queryByName(Page page, String name);


    /**
     * 根据名称查询
     *
     * @param name 名称
     * @return 城市列表
     */
    List<City> queryByName(String name);

}
