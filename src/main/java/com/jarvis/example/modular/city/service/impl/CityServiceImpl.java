package com.jarvis.example.modular.city.service.impl;

import com.jarvis.example.modular.city.entity.City;
import com.jarvis.example.modular.city.mapper.CityMapper;
import com.jarvis.example.modular.city.service.CityService;
import com.jarvis.framework.core.entity.BaseSimpleEntity;
import com.jarvis.framework.search.EntityQuery;
import com.jarvis.framework.web.service.impl.LongIdSimpleEntityServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Doug Wang
 * @since 1.8, 2023-03-01 14:43:52
 */
@Slf4j
@Service
public class CityServiceImpl extends LongIdSimpleEntityServiceImpl<City, CityMapper> implements CityService {

    /**
     * @see com.jarvis.example.modular.city.service.CityService#queryByName(java.lang.String)
     */
    @Override
    public List<City> queryByName(String name) {
        if (log.isDebugEnabled()) {
            log.debug("name = {}", name);
        }
        return getBaseMapper().queryByName(name);
    }

    @Override
    public List<City> queryStatesByName(String name) {
        return null;
    }

    /**
     * @see com.jarvis.framework.web.service.LongIdSimpleEntityService#insert(BaseSimpleEntity)
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean insert(City entity) {
        return super.insert(entity);
    }

    void t() {
        /**
         * SELECT
         * 	*
         * FROM
         * 	city
         * WHERE
         * 	state =?
         * 	AND (name LIKE ? OR name LIKE ?)
         * 	AND created_time > ?
         * ORDER BY
         * 	name DESC,
         * 	created_time ASC
         */
        final EntityQuery<City> criteriaQuery = createCriteriaQuery();
        criteriaQuery.filter(f -> {
            f.equal(City::getState, "CN")
                    .orSubCondition()
                    .like(City::getName, "上海")
                    .like(City::getName, "南京")
                    .endSubCondition()
                    .greaterThan(City::getCreatedTime, LocalDateTime.now());
        }).desc(City::getName).asc(City::getCreatedTime);
    }
}
