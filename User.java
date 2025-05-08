public class User {
    private String _name;
    private String _membership="No Value";
    int age;

    public User(){

    }
    public User(String name, String membership){ //constructor
        set_name(name);
        set_membership(membership);
    }

    void set_name(String name){ //setter
        _name = name;
    }
    void set_membership(String membership){//setter
        _membership =  membership;
    }
    void set_membership(Membership membership){ //Method Overloading
        _membership = membership.name();
    }
    String get_membership(){//getter
        return _membership;
    }
    String get_name(){ //getter
        return _name;
    }
}
