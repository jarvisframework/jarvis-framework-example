package com.jarvis.example.modular.agv.entity;

import com.jarvis.framework.core.entity.AbstractLongIdEntity;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Table;

/**
 * <p>AGV实体类</p>
 *
 * @author Doug Wang
 * @since 1.8, 2023-02-09 18:22:14
 */
@Data
@ApiModel("AGV表")
@Table(name = "agv")
@EqualsAndHashCode(callSuper = true)
public class AgvEntity extends AbstractLongIdEntity {
    private String agvCode;
    private String brand;
    private String controlType;
    private String functionType;
    private String status;
    private String protocolId;
    private String protocolName;
    private String mapId;
    private String workAreaType;
    private String ipAddress;
    private String port;
    private String loadCapacity;
    private String enduranceTime;
    private String maxDeviation;
    private String remark;
}
