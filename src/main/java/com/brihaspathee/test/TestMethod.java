package com.brihaspathee.test;

import java.util.List;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 11, November 2025
 * Time: 11:34
 * Project: sapphire
 * Package Name: com.brihaspathee.test
 * To change this template use File | Settings | File and Code Template
 */
public class TestMethod<E> {

    private String testMethodName;

    private List<TestData<E>> testData;

    public void setTestMethodName(String testMethodName) {
        this.testMethodName = testMethodName;
    }

    public void setTestData(List<TestData<E>> testData) {
        this.testData = testData;
    }

    public String getTestMethodName() {
        return testMethodName;
    }

    public List<TestData<E>> getTestData() {
        return testData;
    }

    @Override
    public String toString() {
        return "TestMethod{" +
                "testMethodName='" + testMethodName + '\'' +
                ", testData=" + testData +
                '}';
    }
}
