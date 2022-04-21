public class StudyUser
{
    public static void main(String[] args)
    {
        StudyUser user1=new StudyUser(1);
        StudyUser user2=new StudyUser(2,"子俊",18,"男");
        StudyUser user3=new StudyUser(1);
    }
    int id;
    String name;
    int age;
    String sex;

    public StudyUser(int _id)
    {
        id = _id;
    }

    public StudyUser(int _id, String _name)
    {
        id = _id;
        name = _name;
    }

    public StudyUser(int _id,String _name,int _age,String _sex)
    {
        id = _id;
        name = _name;
        age = _age;
        sex=_sex;
    }
}
