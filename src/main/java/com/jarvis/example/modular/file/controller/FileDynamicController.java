package com.jarvis.example.modular.file.controller;

import com.jarvis.example.modular.file.entity.FileDynamic;
import com.jarvis.example.modular.file.mapper.FileDynamicMapper;
import com.jarvis.example.modular.file.service.FileDynamicService;
import com.jarvis.framework.core.exception.BusinessException;
import com.jarvis.framework.search.DynamicEntityQuery;
import com.jarvis.framework.web.controller.LongIdDynamicEntityController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * @author Doug Wang
 * @since 1.8, 2023-03-01 15:46:25
 */
@Api(tags = "动态表测试类")
@RestController
@RequestMapping("/dynamic/file")
public class FileDynamicController extends LongIdDynamicEntityController<FileDynamic, FileDynamicMapper, FileDynamicService> {

    @Override
    protected String getTableName(Long tableId) {
        if (Objects.isNull(tableId)) {
            throw new BusinessException("参数tableId不能为空");
        }
        return "file_stringid";
    }

    @Override
    protected void processPageCriterion(DynamicEntityQuery criterion) {
        criterion.filter(condition -> {
            return condition.equal("status", 20);
        }).asc("archive_no");

    }
}
