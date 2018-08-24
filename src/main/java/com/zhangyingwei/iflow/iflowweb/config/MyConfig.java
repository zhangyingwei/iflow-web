package com.zhangyingwei.iflow.iflowweb.config;

import com.github.zhangyingwei.solid.config.FileTemplateResourceLoader;
import com.github.zhangyingwei.solid.config.SolidConfiguration;
import com.github.zhangyingwei.solid.spring.SolidSpringTemplateResolver;
import com.github.zhangyingwei.solid.template.TemplateResolver;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

@Configuration
public class MyConfig {

    private String classPath;

    public MyConfig() {
        ClassPathResource resource = new ClassPathResource("");
        try {
            String path = resource.getFile().getPath();
            this.classPath = path;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Bean(name = "solidConfiguration")
    public SolidConfiguration templateBuilder(ApplicationContext ctx) throws IOException {
        SolidConfiguration configuration = new SolidConfiguration(
                new FileTemplateResourceLoader(this.classPath.concat("/templates"))
        );
        return configuration;
    }

    @Bean
    public SolidSpringTemplateResolver getViewResolver(@Qualifier("solidConfiguration") SolidConfiguration configuration) {
        TemplateResolver templateResolver = new TemplateResolver(configuration);
        templateResolver.setSuffix(".html");
//        templateResolver.setPrefix("templates/tale");
        return new SolidSpringTemplateResolver(templateResolver);
    }
}