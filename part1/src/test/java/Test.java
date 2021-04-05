import com.hhdd.bean.Person;
import com.hhdd.bean.Person2;
import com.hhdd.bean.Student;
import com.hhdd.config.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

/**
 * @Author HuangLusong
 * @Date 2021/4/5 12:55
 */
public class Test {
    /**
     * 注册bean，通过@bean方式
     */
    @org.junit.Test
    public void test1() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println("容器种所有的组件名称如下：");
        List<String> names = Arrays.asList(definitionNames);
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("------------------------");
        System.out.println("获取person组件");
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println("person = " + person);
    }

    /**
     * 注册bean，通过扫描方式
     */
    @org.junit.Test
    public void test2() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println("容器种所有的组件名称如下：");
        List<String> names = Arrays.asList(definitionNames);
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("------------------------");
        System.out.println("获取person组件");
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println("person = " + person);
    }

    /**
     * 注册组件，@import方式之直接引入类
     */
    @org.junit.Test
    public void test3() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig3.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println("容器种所有的组件名称如下：");
        List<String> names = Arrays.asList(definitionNames);
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("------------------------");
        System.out.println("获取person组件");
        Person person = applicationContext.getBean(Person.class);
        System.out.println("person = " + person);
    }
    /**
     * 注册组件，@import方式之使用importSelector
     */
    @org.junit.Test
    public void test4() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig4.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println("容器种所有的组件名称如下：");
        List<String> names = Arrays.asList(definitionNames);
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("------------------------");
        System.out.println("获取person组件");
        Person person = applicationContext.getBean(Person.class);
        System.out.println("person = " + person);
    }

    /**
     * 注册组件，@import方式之使用ImportBeanDefinitionRegistrar
     */
    @org.junit.Test
    public void test5() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig5.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println("容器种所有的组件名称如下：");
        List<String> names = Arrays.asList(definitionNames);
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("------------------------");
        System.out.println("获取person组件");
        Person person = applicationContext.getBean(Person.class);
        System.out.println("person = " + person);
    }

    /**
     * 测试组件的属性赋值，基本类型赋值
     */
    @org.junit.Test
    public void test6(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DIConfig.class);
        System.out.println("--------获取Person2组件-----------");
        Person2 person = applicationContext.getBean(Person2.class);
        System.out.println("person = " + person);
    }

    /**
     * 测试属性赋值，autowired注入
     */
    @org.junit.Test
    public void test7(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DIConfig.class);
        System.out.println("-------获取student组件-----------");
        Student student = applicationContext.getBean(Student.class);
        System.out.println("student = " + student);
    }


}
