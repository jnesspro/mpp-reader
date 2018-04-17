package pro.jness.mppreader.config;

import net.sf.mpxj.mpp.MPPReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public MPPReader mppReader() {
        return new MPPReader();
    }
}
