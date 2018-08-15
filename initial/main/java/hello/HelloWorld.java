package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
        LocalTime currenttime = new LocalTime();
        System.out.println("current time is:" + currenttime);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
