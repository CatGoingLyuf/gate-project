package com.lyuf.demo.util;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DefaultRibbonConfig {
    // 全局Ribbon负载均衡算法为Random
    // 但是只要起了全局设置，单个的设置就会失效

    @Bean
    public IRule defaultRandomRule(){
        return new RandomRule();
    }

}
