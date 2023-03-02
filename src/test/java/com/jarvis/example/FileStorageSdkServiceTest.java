package com.jarvis.example;

import com.jarvis.platform.filestorage.sdk.FileStorageSdkService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author Doug Wang
 * @since 1.8, 2023-02-28 14:15:36
 */
@SpringBootTest
@WebAppConfiguration
public class FileStorageSdkServiceTest {

    @Autowired
    private FileStorageSdkService fileStorageSdkService;

    @Test
    void uploadTest() {
        fileStorageSdkService.upload("jarvis-type", "sh001/2000/1/001/xxx.jpg", "C:\\Users\\Doug\\Downloads\\IMS状态机.jpg");
    }

    @Test
    void deleteTest() {
        fileStorageSdkService.delete("jarvis-type", "sh001/2000/1/001/xxx.pdf");
    }

}
