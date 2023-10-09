package block1008;

/*
 *@Author:Hui
 *
 *@Date:2023/10/818:53
 *
 *Description:
 */
public class BlockTest {
    public static void main(String[] args) {
        //Person.eat();  //类加载只有一次，静态代码块也只会执行一次

        Person person = new Person(); //创建对象后，非静态代码块执行
        System.out.println(person.age);
        Person person1 = new Person(); //创建多个对象，非静态代码块也会多次执行





    }


}

class Person{
    static String name;
    int age;

    public void eat(){
        System.out.println("吃、");

    }

    public Person(){

    }

    //非静态代码块
    {
        System.out.println("非");
        age = 10;

    }

    //静态代码块
    static{
        System.out.println("我先来");
        name="我也来";
    }
}
