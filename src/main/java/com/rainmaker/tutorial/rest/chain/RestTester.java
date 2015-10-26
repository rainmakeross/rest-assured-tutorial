package com.rainmaker.tutorial.rest.chain;


abstract class RestTester {
    protected RestTester successor;

    public void setSuccessor(RestTester successor) {
        this.successor = successor;
    }

    abstract public void urlTest(String URL);
}
