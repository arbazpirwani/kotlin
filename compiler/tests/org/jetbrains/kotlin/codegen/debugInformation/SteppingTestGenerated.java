/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.codegen.debugInformation;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/debug/stepping")
@TestDataPath("$PROJECT_ROOT")
@RunWith(BlockJUnit4ClassRunner.class)
public class SteppingTestGenerated extends AbstractSteppingTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM, testDataFilePath);
    }

    @Test
    public void testAllFilesPresentInStepping() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/debug/stepping"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM, true);
    }

    @Test
    @TestMetadata("callableReference.kt")
    public void testCallableReference() throws Exception {
        runTest("compiler/testData/debug/stepping/callableReference.kt");
    }

    @Test
    @TestMetadata("conjunction.kt")
    public void testConjunction() throws Exception {
        runTest("compiler/testData/debug/stepping/conjunction.kt");
    }

    @Test
    @TestMetadata("for.kt")
    public void testFor() throws Exception {
        runTest("compiler/testData/debug/stepping/for.kt");
    }

    @Test
    @TestMetadata("functionInAnotherFile.kt")
    public void testFunctionInAnotherFile() throws Exception {
        runTest("compiler/testData/debug/stepping/functionInAnotherFile.kt");
    }

    @Test
    @TestMetadata("if.kt")
    public void testIf() throws Exception {
        runTest("compiler/testData/debug/stepping/if.kt");
    }

    @Test
    @TestMetadata("IfTrueThenFalse.kt")
    public void testIfTrueThenFalse() throws Exception {
        runTest("compiler/testData/debug/stepping/IfTrueThenFalse.kt");
    }

    @Test
    @TestMetadata("inlineCallableReference.kt")
    public void testInlineCallableReference() throws Exception {
        runTest("compiler/testData/debug/stepping/inlineCallableReference.kt");
    }

    @Test
    @TestMetadata("inlineNamedCallableReference.kt")
    public void testInlineNamedCallableReference() throws Exception {
        runTest("compiler/testData/debug/stepping/inlineNamedCallableReference.kt");
    }

    @Test
    @TestMetadata("namedCallableReference.kt")
    public void testNamedCallableReference() throws Exception {
        runTest("compiler/testData/debug/stepping/namedCallableReference.kt");
    }

    @Test
    @TestMetadata("recursion.kt")
    public void testRecursion() throws Exception {
        runTest("compiler/testData/debug/stepping/recursion.kt");
    }

    @Test
    @TestMetadata("throwException.kt")
    public void testThrowException() throws Exception {
        runTest("compiler/testData/debug/stepping/throwException.kt");
    }
}
