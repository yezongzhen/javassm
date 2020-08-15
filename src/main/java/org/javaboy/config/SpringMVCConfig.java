package org.javaboy.config;/**
 * @Description:
 * @Author: YangYong
 * @Date: 2020/8/15 11:13
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.*;

import java.util.List;

/**
 *@ClassName:SpringMVCConfig
 *@Author:yezongzhen
 *@Date:2020/8/15 11:13
 *@Description:
 *@Version:1.0
 **/
@Configuration
@ComponentScan(basePackages = "org.javaboy",useDefaultFilters = true)
public class SpringMVCConfig  {

//
//    @Override
//    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
//        super.addResourceHandlers(registry);
//    }
//
//    @Override
//    protected void configureViewResolvers(ViewResolverRegistry registry) {
//        super.configureViewResolvers(registry);
//    }
//
//    @Override
//    protected void addViewControllers(ViewControllerRegistry registry) {
//        super.addViewControllers(registry);
//    }
//
//    @Override
//    protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        super.configureMessageConverters(converters);
//    }
}
