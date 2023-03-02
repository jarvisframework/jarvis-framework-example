package com.jarvis.example.modular.agv.controller;

import com.jarvis.example.modular.agv.entity.AgvEntity;
import com.jarvis.example.modular.agv.mapper.AgvMapper;
import com.jarvis.example.modular.agv.service.AgvService;
import com.jarvis.framework.function.Getter;
import com.jarvis.framework.search.CriteriaQuery;
import com.jarvis.framework.web.controller.LongIdSimpleEntityController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>AGV控制层</p>
 *
 * @author Doug Wang
 * @since 1.8, 2023-02-10 14:46:57
 */
@Api("AGV")
@RestController
@RequestMapping("/agv")
public class AgvController extends LongIdSimpleEntityController<AgvEntity, AgvMapper, AgvService> {

    @Override
    protected CriteriaQuery<Getter<AgvEntity>> criteriaQuery(CriteriaQuery<Getter<AgvEntity>> criterion, String keyword) {
        return super.criteriaQuery(criterion, keyword);
    }

    @Override
    protected List<Getter<AgvEntity>> keywordFields() {
        return super.keywordFields();
    }

    @Override
    protected void processPageCriterion(CriteriaQuery<Getter<AgvEntity>> criterion) {
        super.processPageCriterion(criterion);
    }

    @Override
    protected void processKeywordCriterion(CriteriaQuery<Getter<AgvEntity>> criterion, String keyword) {
        super.processKeywordCriterion(criterion, keyword);
    }
}
