package demo01;

public class UserDaoImpl implements UserDao {
    private String name;

    public UserDaoImpl() {
    }

    public UserDaoImpl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override

    public void saySpring() {
        System.out.println("hello Spring"+name);
    }
    public void init(){
        System.out.println("init......");
    }
    public void destory(){
        System.out.println("destory.....");

    }
}
