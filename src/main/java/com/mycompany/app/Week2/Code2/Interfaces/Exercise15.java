package com.mycompany.app.Week2.Code2.Interfaces;

public class Exercise15 {
        // Define an abstract class
        abstract static class AbstractClass {
            void abstractMethod() {
                System.out.println("Abstract method");
            }
        }
    
        interface Interface1 {
            void method1();
            void method2();
        }
    
        interface Interface2 {
            void method3();
            void method4();
        }
    
        interface Interface3 {
            void method5();
            void method6();
        }
    
        // Inherit the abstract class into the derived class
        static class NewClass extends AbstractClass implements Interface1, Interface2, Interface3 {
            @Override
            public void method1() {
                System.out.println("Method 1");
            }
    
            @Override
            public void method2() {
                System.out.println("Method 2");
            }
    
            @Override
            public void method3() {
                System.out.println("Method 3");
            }
    
            @Override
            public void method4() {
                System.out.println("Method 4");
            }
    
            @Override
            public void method5() {
                System.out.println("Method 5");
            }
    
            @Override
            public void method6() {
                System.out.println("Method 6");
            }
    
            void newMethod() {
                System.out.println("New method");
            }
        }
}
