package com;

import com.Bean.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author lzp
 * @version V1.0
 * @Classname com.App
 * @Date 2020/4/1 8:40
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);
        //@service加载
        //Liuservice的beandefinition对象，对设置的拦截了，置换成chunservice。
//        LiuService liuService = context.getBean(LiuService.class);
//        System.out.println(liuService);
        //配置文件中@bean加载
        MeiService meiService = context.getBean(MeiService.class);
        System.out.println(meiService);
        //PengService、ZhuoService 使用@import加载
        PengService pService = context.getBean(PengService.class);
        System.out.println(pService);
        ZhuoService zService = context.getBean(ZhuoService.class);
        System.out.println(zService);
        //BeanFactoryPostProcessor拦截替换加载
        ChunService cService = context.getBean(ChunService.class);
        System.out.println(cService);
        //配置类中@bean+@conditional加载，@conditional标注的condition的实现类，match方法返回true，则加载，否则不加载。
        DaiService dService = context.getBean(DaiService.class);
        System.out.println(dService);
    }
}
