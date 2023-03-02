package com.jarvis.example.modular.city.entity;

import com.jarvis.framework.core.entity.AbstractLongIdEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Table;

/**
 * @author Doug Wang
 * @since 1.8, 2023-03-01 13:48:21
 */
@Setter
@Getter
@ToString
@ApiModel("城市")
@Table(name = "city")
public class City extends AbstractLongIdEntity {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = -4959380403194587281L;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("州")
    private String state;

    @ApiModelProperty("国家")
    private String country;

}
