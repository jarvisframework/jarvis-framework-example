package com.jarvis.example.modular.agv.mapper;

import com.jarvis.example.modular.agv.entity.AgvEntity;
import com.jarvis.framework.mybatis.mapper.LongIdSimpleEntityMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>AGV持久层</p>
 *
 * @author Doug Wang
 * @since 1.8, 2023-02-10 14:29:19
 */
@Mapper
public interface AgvMapper extends LongIdSimpleEntityMapper<AgvEntity> {

}
