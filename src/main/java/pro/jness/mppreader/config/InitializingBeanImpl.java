package pro.jness.mppreader.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.nio.file.Files;

@Component
public class InitializingBeanImpl implements InitializingBean {

    private final AppProperties appProperties;

    @Autowired
    public InitializingBeanImpl(AppProperties appProperties) {
        this.appProperties = appProperties;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        if (appProperties.getUploadPath() == null) {
            appProperties.setUploadPath(Files.createTempDirectory("mpp-upload").toString());
        }
    }
}
