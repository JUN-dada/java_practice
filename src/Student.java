public class Student
{
    public static void main(String[] args)
    {
        Computer computer=new Computer();
        computer.brand="联想";
        computer.price=6000;

        Computer computer2=new Computer();
        computer2.brand="戴尔";
        computer2.price=7000;

        Student student1=new Student();
        student1.id=01;
        student1.name="张三";
        student1.computer=computer;
        student1.study();
    }
    int id;
    String name;
    int age;
    Computer computer;
    public void study()
    {
        System.out.println("我正在学习，我使用的电脑品牌为"+computer.brand);
    }
}
