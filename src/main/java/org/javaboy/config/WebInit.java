package org.javaboy.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 *@ClassName:WebInit
 *@Author:yezongzhen
 *@Date:2020/8/15 11:19
 *@Description:
 *@Version:1.0
 **/
@ComponentScan(basePackages = "org.javaboy")
public class WebInit implements WebApplicationInitializer {
    public void onStartup(ServletContext servletContext) throws ServletException {
        //先加载SpringMvc的配置文件
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringMVCConfig.class);

        //添加 DispatcherServlet
        ServletRegistration.Dynamic springmvc = servletContext.addServlet("springmvc",new DispatcherServlet(ctx));

        // 给DispatcherServlet 添加路径映射
        springmvc.addMapping("/");
        //给DispatcherServlet 添加启动时机
        springmvc.setLoadOnStartup(1);
    }
}
