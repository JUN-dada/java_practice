public class StudyUser2
{

    public static void main(String[] args)
    {
    StudyUser2 study = new StudyUser2(001,"zijun","1129491453@qq.com","12345678","124");
    }
    int id;
    String name;
    String email;
    String password;
    String phone;

    public StudyUser2(int _id ,String _name ,String _email ,String _password ,String _phone)
    {
        id = _id;
        email=_email;
        password=_password;
        phone=_phone;
    }
}
