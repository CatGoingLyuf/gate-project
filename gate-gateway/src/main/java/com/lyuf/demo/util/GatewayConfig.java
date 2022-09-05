//package com.lyuf.demo.util;
//
//import lombok.extern.slf4j.Slf4j;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.logging.Logger;
//
///**
// * @Author lyuf
// * @Date 2022/9/5 10:18
// * @Version 1.0
// */
//@Slf4j
//@Configuration
//public class GatewayConfig {
//
////    @Value("${spring.application.name}")
////    private String appName;
//    @Bean
//    public RouteLocator routes(RouteLocatorBuilder builder) {
//        log.info("网关配置");
//        return builder.routes()
//                .route("demo-test", r -> r.path("/demo")
//                        .filters(f->f.addRequestParameter("param","appName"))
//                        .uri("lb://demo-test/"))
//                .build();
//    }
//}
