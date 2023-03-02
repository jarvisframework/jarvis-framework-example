package com.jarvis.example.modular.file.mapper;

import com.jarvis.example.modular.file.entity.FileDynamic;
import com.jarvis.framework.mybatis.mapper.LongIdDynamicEntityMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Doug Wang
 * @since 1.8, 2023-03-01 15:34:34
 */
@Mapper
public interface FileDynamicMapper extends LongIdDynamicEntityMapper<FileDynamic> {

}
