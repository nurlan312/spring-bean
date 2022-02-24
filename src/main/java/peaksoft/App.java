package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class, Cat.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(bean1.getMessage());
        System.out.println("Ссылаются ли на один и тот же объект: " + (bean == bean1));

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        Cat cat1 = applicationContext.getBean("catId", Cat.class);
        Cat cat2 = applicationContext.getBean("catId", Cat.class);
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println("Ссылаются ли на один и тот же объект: " + (cat1 == cat2));
    }
}
