package com.jarvis.example.modular.test.service;

import com.jarvis.example.modular.agv.entity.AgvEntity;
import com.jarvis.example.modular.agv.service.AgvService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.util.Assert;

@SpringBootTest
@WebAppConfiguration
class AgvServiceTest {

    @Autowired
    private AgvService agvService;

    @Test
    void testGetById() {
        AgvEntity agv = agvService.getById(100L);
        Assert.notNull(agv);
    }
}
