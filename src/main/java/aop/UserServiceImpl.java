package aop;

public class UserServiceImpl implements UserService {

    @Override
    public String getName(int id) {
        return "tom";
    }

    @Override
    public Integer getAge(int id) {
        return 10;
    }
}
