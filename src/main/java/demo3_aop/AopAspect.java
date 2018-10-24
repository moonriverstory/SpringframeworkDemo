package demo3_aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class AopAspect {

    public void doPPBefore(JoinPoint jp) {
        System.out.println("do before");
    }

    /**
     * 目标方法调用之后执行的代码
     * 因为方法可能会出现异常，所以不能返回方法的返回值
     *
     * @param jp
     */
    public void doPPAfter(JoinPoint jp) {
        System.out.println("do pp after");
    }

    /**
     * 后置返回通知：目标方法正常结束后执行的代码
     *
     * @param jp
     * @param result
     */
    public void doAfterReturning(JoinPoint jp, String result) {
        System.out.println("===========执行后置通知============");
        System.out.println("返回值result===================" + result);
    }

    /**
     * 异常通知：目标方法抛出异常时执行的代码
     *
     * @param jp
     * @param ex
     */
    public void doAfterThrowing(JoinPoint jp, Exception ex) {
        System.out.println("===========执行异常通知============");
    }

    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("======执行环绕通知开始=========");
        // 调用方法的参数
        Object[] args = pjp.getArgs();
        // 调用的方法名
        String method = pjp.getSignature().getName();
        // 获取目标对象
        Object target = pjp.getTarget();
        // 执行完方法的返回值
        // 调用proceed()方法，就会触发切入点方法执行
        Object result = pjp.proceed();
        System.out.println("输出,方法名：" + method + ";目标对象：" + target + ";返回值：" + result);
        System.out.println("======执行环绕通知结束=========");
        return result;
    }

}
