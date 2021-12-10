package lzh.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//在内嵌Tomcat开发或部署, 下面写法最简单.
//@SpringBootApplication
//public class App
//{
//    public static void main( String[] args )
//    {
//        SpringApplication.run(App.class, args);
//    }
//}

// 要在外置Tomcat上部署, 需要继承SpringBootServletInitializer, 并重写configure()方法.
// 需要说明的是, 这种写法对内置Tomcat也同样支持.
@SpringBootApplication
public class App extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(App.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }

}
