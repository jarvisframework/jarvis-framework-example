package com.jarvis.example.modular.agv.service;

import com.jarvis.example.modular.agv.entity.AgvEntity;
import com.jarvis.example.modular.agv.mapper.AgvMapper;
import com.jarvis.framework.web.service.LongIdSimpleEntityService;

/**
 * <p>AGV业务接口</p>
 *
 * @author Doug Wang
 * @since 1.8, 2023-02-10 14:39:52
 */
public interface AgvService extends LongIdSimpleEntityService<AgvEntity, AgvMapper> {
}
