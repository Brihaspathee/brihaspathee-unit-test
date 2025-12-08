package com.brihaspathee.test;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 11, November 2025
 * Time: 11:35
 * Project: sapphire
 * Package Name: com.brihaspathee.test
 * To change this template use File | Settings | File and Code Template
 */
public class TestData<E> {

    /**
     * Unique test case id created for the test case
     */
    private String testCaseId;

    /**
     * A short description of the test case
     */
    private String testCaseDescription;

    /**
     * The name of the service for which the test case is executed
     */
    private String serviceName;

    /**
     * Test data
     */
    private E testData;

    public String getTestCaseId() {
        return testCaseId;
    }

    public void setTestCaseId(String testCaseId) {
        this.testCaseId = testCaseId;
    }

    public String getTestCaseDescription() {
        return testCaseDescription;
    }

    public void setTestCaseDescription(String testCaseDescription) {
        this.testCaseDescription = testCaseDescription;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public E getTestData() {
        return testData;
    }

    public void setTestData(E testData) {
        this.testData = testData;
    }

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "TestData{" +
                "testCaseDescription='" + testCaseDescription + '\'' +
                ", testData=" + testData +
                '}';
    }
}
