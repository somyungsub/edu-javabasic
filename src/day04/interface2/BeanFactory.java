package day04.interface2;

public class BeanFactory {

    public TV getBean(String beanName) {
        if ("samsung".equals(beanName)) {
            return new SamsungTV();
        } else if ("lg".equals(beanName)) {
            return new LgTV();
        } else {
            return null;
        }
    }

}
