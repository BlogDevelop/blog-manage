package com.cll.mayj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
//import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

//import javax.validation.Validator;

/**
 * 增加国际化配置
 */
@SpringBootApplication
@EnableEurekaClient
public class BlogServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogServerApplication.class, args);
    }

    public ResourceBundleMessageSource getMessageSource(){
        ResourceBundleMessageSource rbms = new ResourceBundleMessageSource();
        rbms.setDefaultEncoding("UTF-8");
        rbms.setBasenames("i18n/ValidationMessage");
        return rbms;
    }

//    @Bean
//    public Validator getValidator() throws Exception{
//        LocalValidatorFactoryBean validatorFactoryBean = new LocalValidatorFactoryBean();
//        validatorFactoryBean.setValidationMessageSource(getMessageSource());
//        return validatorFactoryBean;
//    }
}
