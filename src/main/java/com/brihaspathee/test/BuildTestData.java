package com.brihaspathee.test;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Utility class to build test data for a given test method.
 * Fully compatible with Java 25 and Spring.
 *
 * @param <T> Type of the test data object
 */
@Component
public class BuildTestData<T> {

    /**
     * Builds a list of test data for the given method in the test class.
     *
     * @param methodName The name of the test method
     * @param testClass  The test class containing test methods and data
     * @return List of test data objects
     */
    public List<T> buildData(String methodName, TestClass<T> testClass) {
        // Find the test method that matches the given method name
        Optional<TestMethod<T>> optionalTestMethod = testClass.getTestMethods().stream()
                .filter(tm -> tm.getTestMethodName().equals(methodName))
                .findFirst();

        if (optionalTestMethod.isEmpty()) {
            throw new IllegalArgumentException("No test method found with name: " + methodName);
        }

        TestMethod<T> testMethod = optionalTestMethod.get();

        // Get the test data objects for the method
        List<TestData<T>> userTestData = testMethod.getTestData();

        // Map TestData<T> -> T explicitly using a lambda and collect into an ArrayList
        return userTestData.stream()
                .map(td -> td.getTestData())
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
