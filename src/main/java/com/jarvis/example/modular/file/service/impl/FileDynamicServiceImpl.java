package com.jarvis.example.modular.file.service.impl;

import com.jarvis.example.modular.file.entity.FileDynamic;
import com.jarvis.example.modular.file.mapper.FileDynamicMapper;
import com.jarvis.example.modular.file.service.FileDynamicService;
import com.jarvis.framework.mybatis.util.SnowflakeIdGeneratorUtil;
import com.jarvis.framework.search.DynamicEntityQuery;
import com.jarvis.framework.web.service.impl.LongIdDynamicEntityServiceImpl;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Doug Wang
 * @since 1.8, 2023-03-01 15:39:09
 */
@Component
public class FileDynamicServiceImpl extends LongIdDynamicEntityServiceImpl<FileDynamic, FileDynamicMapper> implements FileDynamicService {

    @Override
    public String getTableName(Long tableId) {
        return null;
    }

    void t() {
        /**
         * SELECT
         * 	id,
         * 	title_proper,
         * 	fonds_code
         * FROM
         * 	t_a00_wsda_00_0f
         * WHERE
         * 	fonds_code = 'SH001'
         * 	AND ( title_proper LIKE '%%' OR archival_code LIKE '%%' )
         * 	AND year_code > 2020
         * ORDER BY
         * 	year_code DESC,
         * 	archival_code ASC
         */
        final DynamicEntityQuery dynamicEntityQuery = new DynamicEntityQuery();
        // 查询字段
        dynamicEntityQuery.columns("id", "title_proper", "fonds_code")
                // 表名
                .tableName("t_a00_wsda_00_0f")
                // 条件
                .filter(f -> {
                    // 添加条件
                    // 等价于fonds_code = ？ AND ( title_proper LIKE ？ OR archival_code LIKE ？ )
                    f.equal("fonds_code", "SH001")
                    .orSubCondition()
                    .like("title_proper", "上海")
                    .like("archival_code","20")
                    .endSubCondition()
                    .greaterThan("", 2020);
        }).desc("year_code").asc("archival_code");

        List<?> list = queryBy(dynamicEntityQuery);

        long id = SnowflakeIdGeneratorUtil.getInstance().nextId();
        // t_ar_wsda_file
        Long tableId = 1523189410361786368L;
        getById(tableId, id);
    }

}
