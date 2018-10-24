package demo3_aop.aop.impl;

import demo3_aop.aop.ITest;

public class ATest implements ITest {
    @Override
    public void doSomething() {
        System.out.println("do something");
    }
}
