package com.jarvis.example.modular.file.entity;

import com.jarvis.framework.core.entity.LongIdDynamicEntity;

import javax.persistence.Table;

/**
 * @author Doug Wang
 * @since 1.8, 2023-03-01 15:30:38
 */
@Table(name = "file_stringid")
public class FileDynamic extends LongIdDynamicEntity {

    private static final long serialVersionUID = 6677948996078189991L;

    @Override
    public String tableName() {
        return "file_stringid";
    }
}
