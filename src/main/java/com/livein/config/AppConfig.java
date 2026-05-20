package com.livein.config;

import com.livein.Aliean;
import com.livein.Computer;
import com.livein.Desktop;
import com.livein.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.livein")
public class AppConfig {
////    @Bean(name={"hero","villen"})
//    @Bean
//    public Aliean aliean(@Qualifier("laptop") Computer com){
//        Aliean obj=new Aliean();
//        obj.setAge(25);
//        obj.setCom(com);
//        return obj;
//    }
//    @Bean
////    @Scope(value = "prototype")
////    @Primary
//    public Desktop desktop(){
//        return new Desktop();
//    }
//    @Bean
//    public Laptop laptop(){
//        return new Laptop();
//    }
}
