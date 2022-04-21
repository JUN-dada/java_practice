public class User
{
    public static void main(String[] args)
    {
    User user1 = new User();
    User user2 = new User(1001);
    User user3 = new User(1002,"子俊","1129491453");
    }
    int id;
    String userName;
    String PassWord;

    User()
    {

    }
    public User(int _id)
    {
        id = _id;
    }

    public User(int _id, String _userName,String _passWord)
    {
    id =_id;
    userName=_userName;
    _passWord=_passWord;
    }

}
