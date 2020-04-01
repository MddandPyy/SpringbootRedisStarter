package com.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/**
 * @author lzp
 * @version V1.0
 * @Classname LiuRedisProperties
 * @Date 2020/4/1 13:26
 */
@Component
@ConfigurationProperties(prefix = "liu.redis")
public class LiuRedisProperties {

    private String host;

    private String password;

    private int port;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
