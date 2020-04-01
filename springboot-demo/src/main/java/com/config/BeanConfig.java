package com.config;

import com.Bean.DaiService;
import com.Bean.MeiService;
import com.Bean.PengService;
import com.Bean.ZhuoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author lzp
 * @version V1.0
 * @Classname BeanConfig
 * @Date 2020/4/1 8:56
 */
@Configuration
@Import({PengService.class, ZhuoService.class})
public class BeanConfig {
    @Bean
    public MeiService getMei(){
        return new MeiService();
    }

    @Bean
    @Conditional(MyBeanConditional.class)
    public DaiService getDai(){
        return new DaiService();
    }
}
