package tests;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestExecutor {
    public static void start(CalculatorTest test){
        try {
            Class someClass = test.getClass();
            CalculatorTest class1 = (CalculatorTest) someClass.newInstance();
            for (Method m : class1.getClass().getDeclaredMethods()) {
                if (m.isAnnotationPresent(BeforeSuite.class)) {
                    m.invoke(class1);
                }
                else if (m.isAnnotationPresent(Test.class)) {
                    System.out.println(m.invoke(class1,1,2,3));
                }
                else if (m.isAnnotationPresent(AfterSuite.class)) {
                    m.invoke(class1);
                }
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CalculatorTest test = new CalculatorTest();
        start(test);
    }
}
