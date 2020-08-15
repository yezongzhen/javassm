package org.javaboy.config;/**
 * @Description:
 * @Author: YangYong
 * @Date: 2020/8/15 10:52
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 *@ClassName:SpringConfig
 *@Description: @Configuration:注解表示这个是一个配置类，在这里配置的作用类似于 applicationContext.xml
 *               @ComponentScan:注解表示配置包扫描，里面的属性和xml配置中的属性都是一一对应的，useDefaultFilters表示使用默认的过滤器，然后又除去Controller注解，即在Spring容器中扫描除了Controller其他的Bean
 *
 *@Author:yzz
 *@Date:2020/8/15 10:52
 *@Version:1.0
 **/
@Configuration
@ComponentScan(basePackages = "org.javaboy",useDefaultFilters = true,excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class)})
public class SpringConfig {
}
