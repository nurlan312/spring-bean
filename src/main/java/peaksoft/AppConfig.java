package peaksoft;

import org.springframework.context.annotation.*;


@Configuration
public class AppConfig {
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name="catId")
    @Scope("prototype")
    public Cat getCat() {
        Cat cat = new Cat();
        cat.setName("Ak myshyk");
        cat.setAge(12);
        cat.setColor("White");
        cat.setWeight(20);
        return cat;
    }
}
