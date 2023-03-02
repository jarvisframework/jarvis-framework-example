package com.jarvis.example.modular.agv.service.impl;

import com.jarvis.example.modular.agv.entity.AgvEntity;
import com.jarvis.example.modular.agv.mapper.AgvMapper;
import com.jarvis.example.modular.agv.service.AgvService;
import com.jarvis.framework.web.service.impl.LongIdSimpleEntityServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * <p>AGV业务接口实现</p>
 *
 * @author Doug Wang
 * @since 1.8, 2023-02-10 14:41:21
 */
@Slf4j
@Service
public class AgvServiceImpl extends LongIdSimpleEntityServiceImpl<AgvEntity, AgvMapper> implements AgvService {

}
