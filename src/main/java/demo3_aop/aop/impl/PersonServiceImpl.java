package demo3_aop.aop.impl;


import demo3_aop.aop.interfaces.PersonService;

public class PersonServiceImpl implements PersonService{

    private String user;

    public PersonServiceImpl() {
    }

    public PersonServiceImpl(String user) {
        this.user = user;
    }

    public void save() {
        System.out.println("执行了save()方法");
    }

    public String getUser() {
        return user;
    }

}
