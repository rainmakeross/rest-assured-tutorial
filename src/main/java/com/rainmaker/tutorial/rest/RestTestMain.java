package com.rainmaker.tutorial.rest;


import com.rainmaker.tutorial.rest.chain.LearnCodeGetPostTest;
import com.rainmaker.tutorial.rest.chain.LearnCodePutDeleteTest;

import java.util.logging.Logger;

public class RestTestMain {
    private static Logger logger = Logger.getLogger(RestTestMain.class.getName());
    private static String mainUrl = "http://rest.learncode.academy/api/johnbob/friends";

    public static void main(String[] args){
        LearnCodeGetPostTest learnCodeGetPostTest = new LearnCodeGetPostTest();
        LearnCodePutDeleteTest learnCodePutDeleteTest = new LearnCodePutDeleteTest();
        learnCodeGetPostTest.setSuccessor(learnCodePutDeleteTest);

        learnCodeGetPostTest.urlTest(mainUrl);
    }
}
