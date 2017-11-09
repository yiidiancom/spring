package com.yiidian.domain;

import java.io.Serializable;
/**
 * 
 * @author http://www.yiidian.com
 *
 */
public class Customer implements Serializable{
	    private boolean testEqual;
	 
	    private boolean testNotEqual;
	 
	    private boolean testLessThan;
	 
	    private boolean testLessThanOrEqual;
	 
	    private boolean testGreaterThan;
	 
	    private boolean testGreaterThanOrEqual;
	 
	    private boolean testAnd;
	 
	    private boolean testOr;
	 
	    private boolean testNot;
	 
	    private double testAdd;
	 
	    private String testAddString;
	 
	    private double testSubtraction;
	 
	    private double testMultiplication;
	 
	    private double testDivision;
	 
	    private double testModulus ;
	 
	    private double testExponentialPower;
	 
	    @Override
	    public String toString() {
	        return "Customer [testEqual=" + testEqual + ", testNotEqual="
	                + testNotEqual + ", testLessThan=" + testLessThan
	                + ", testLessThanOrEqual=" + testLessThanOrEqual
	                + ", testGreaterThan=" + testGreaterThan
	                + ", testGreaterThanOrEqual=" + testGreaterThanOrEqual
	                + ", testAnd=" + testAnd + ", testOr=" + testOr + ", testNot="
	                + testNot + ", testAdd=" + testAdd + ", testAddString="
	                + testAddString + ", testSubtraction=" + testSubtraction
	                + ", testMultiplication=" + testMultiplication
	                + ", testDivision=" + testDivision + ", testModulus="
	                + testModulus + ", testExponentialPower="
	                + testExponentialPower + "]";
	    }

		public void setTestEqual(boolean testEqual) {
			this.testEqual = testEqual;
		}

		public void setTestNotEqual(boolean testNotEqual) {
			this.testNotEqual = testNotEqual;
		}

		public void setTestLessThan(boolean testLessThan) {
			this.testLessThan = testLessThan;
		}

		public void setTestLessThanOrEqual(boolean testLessThanOrEqual) {
			this.testLessThanOrEqual = testLessThanOrEqual;
		}

		public void setTestGreaterThan(boolean testGreaterThan) {
			this.testGreaterThan = testGreaterThan;
		}

		public void setTestGreaterThanOrEqual(boolean testGreaterThanOrEqual) {
			this.testGreaterThanOrEqual = testGreaterThanOrEqual;
		}

		public void setTestAnd(boolean testAnd) {
			this.testAnd = testAnd;
		}

		public void setTestOr(boolean testOr) {
			this.testOr = testOr;
		}

		public void setTestNot(boolean testNot) {
			this.testNot = testNot;
		}

		public void setTestAdd(double testAdd) {
			this.testAdd = testAdd;
		}

		public void setTestAddString(String testAddString) {
			this.testAddString = testAddString;
		}

		public void setTestSubtraction(double testSubtraction) {
			this.testSubtraction = testSubtraction;
		}

		public void setTestMultiplication(double testMultiplication) {
			this.testMultiplication = testMultiplication;
		}

		public void setTestDivision(double testDivision) {
			this.testDivision = testDivision;
		}

		public void setTestModulus(double testModulus) {
			this.testModulus = testModulus;
		}

		public void setTestExponentialPower(double testExponentialPower) {
			this.testExponentialPower = testExponentialPower;
		}
}
	