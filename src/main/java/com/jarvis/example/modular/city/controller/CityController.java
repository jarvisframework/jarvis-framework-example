package com.jarvis.example.modular.city.controller;

import com.jarvis.example.modular.city.entity.City;
import com.jarvis.example.modular.city.mapper.CityMapper;
import com.jarvis.example.modular.city.service.CityService;
import com.jarvis.framework.function.Getter;
import com.jarvis.framework.search.CriteriaQuery;
import com.jarvis.framework.web.controller.LongIdSimpleEntityController;
import com.jarvis.framework.web.rest.RestResponse;
import com.jarvis.framework.web.util.SwaggerAipHttpMethod;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Doug Wang
 * @since 1.8, 2023-03-01 14:53:36
 */
@Api(tags = "城市维护")
@RestController
@RequestMapping("/city")
public class CityController extends LongIdSimpleEntityController<City, CityMapper, CityService> {

    @GetMapping("/state-list")
    @ApiOperation(value = "根据名称获取城市列表", httpMethod = SwaggerAipHttpMethod.GET)
    public RestResponse<List<City>> queryStatesByName(String name) {
        return RestResponse.success(getService().queryStatesByName(name));
    }

    /**
     * 相当于 and （name like ? or country like ?）
     * @see com.jarvis.framework.web.controller.BaseSimpleEntityController#keywordFields()
     */
    @Override
    protected List<Getter<City>> keywordFields() {
        final List<Getter<City>> arrayList = new ArrayList<>();
        arrayList.add(City::getName);
        arrayList.add(City::getCountry);
        return arrayList;
    }

    @Override
    protected void processPageCriterion(CriteriaQuery<Getter<City>> criterion) {
        criterion.filter(condition -> {
            return condition.equal(City::getCountry, "中国");
        }).asc(City::getCreatedTime);
    }
}
