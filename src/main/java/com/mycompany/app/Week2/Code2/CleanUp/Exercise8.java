package com.mycompany.app.Week2.Code2.CleanUp;

import com.mycompany.app.Debug.Debug;

public class Exercise8 {
    Debug debug = new Debug();

    public void method1() {
        debug.debug("method1");

        method2();

        this.method2();
    }

    public void method2() {
        debug.debug("method2");
    }
}
