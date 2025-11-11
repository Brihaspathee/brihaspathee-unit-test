package com.brihaspathee.test;

import java.util.List;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 11, November 2025
 * Time: 11:33
 * Project: sapphire
 * Package Name: com.brihaspathee.test
 * To change this template use File | Settings | File and Code Template
 */
public class TestClass<E> {

    private String testClassName;

    private List<TestMethod<E>> testMethods;

    public String getTestClassName() {
        return testClassName;
    }

    public void setTestClassName(String testClassName) {
        this.testClassName = testClassName;
    }

    public List<TestMethod<E>> getTestMethods() {
        return testMethods;
    }

    public void setTestMethods(List<TestMethod<E>> testMethods) {
        this.testMethods = testMethods;
    }

    @Override
    public String toString() {
        return "TestClass{" +
                "testClassName='" + testClassName + '\'' +
                ", testMethods=" + testMethods +
                '}';
    }
}
