package com.rainmaker.tutorial.rest;


import java.util.logging.Logger;

public class RestTestMain {
    private static Logger logger = Logger.getLogger(RestTestMain.class.getName());

    public static void main(String[] args){
        logger.info("Testing single user GET");
        LearnCodeRestAssured.testGetSingleUser();

        logger.info("Testing single user POST");
        LearnCodeRestAssured.testPostSingleUser();

        logger.info("Testing single user PUT");
        LearnCodeRestAssured.testPutSingleUser();

        logger.info("Testing single user DELETE");
        LearnCodeRestAssured.testDeleteSingleUser();
    }
}
