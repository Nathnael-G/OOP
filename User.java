public class User {
    private String _name;
    private String _membership="Bronze";
    int age;

    public String toString(){//method overiding when we remove the attibutes to the users and leave it to u and u2 in println it defaults to toString so we over ride it.
        return get_name() + " " + get_membership();

    }

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
