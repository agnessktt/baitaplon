package com.mycompany.app.Week2.Code2.ReusingClassess;

public class Exercise7 {
    public class A {
        private String aValue;

        public A(String aValue) {
            this.aValue = aValue;
            System.out.println("Call A" + aValue);
        }
    }

    public class B {
        private String bValue;

        public B(String bValue) {
            this.bValue = bValue;
            System.out.println("Call B" + bValue);
        }
    }

    public class C extends A {
        private B Instance;

        public C(String aValue, String bValue) {
            super(aValue);
            Instance = new B(bValue);
            System.out.println("Call C" + aValue + bValue);
        }
    }
}
