package com.livein.config;

import com.livein.Aliean;
import com.livein.Computer;
import com.livein.Desktop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
//    @Bean(name={"hero","villen"})
    @Bean
    public Aliean aliean(Computer com){
        Aliean obj=new Aliean();
        obj.setAge(25);
        obj.setCom(com);
        return obj;
    }
    @Bean
//    @Scope(value = "prototype")
    public Desktop desktop(){
        return new Desktop();
    }
}
