package com.rainmaker.tutorial.rest.chain;

import java.util.logging.Logger;

import static com.jayway.restassured.RestAssured.given;


public class LearnCodePutDeleteTest extends RestTester{
    private static String URL;
    private static Logger logger = Logger.getLogger(LearnCodePutDeleteTest.class.getName());


    private static void testPutSingleUser() {
        logger.info("testPutSingleUser");
        given().parameters("name", "Billy Bob Rest Test", "age", "43").
                expect().
                statusCode(500).
                when().
                put(URL);
    }


    private static void testDeleteSingleUser() {
        logger.info("testDeleteSingleUser");

        given().parameters("name", "Billy Bob Rest Test", "age", "43").
                expect().
                statusCode(500).
                when().
                delete(URL);
    }

    @Override
    public void urlTest(String URLparam) {
        URL = URLparam + "/4";
        LearnCodePutDeleteTest.testPutSingleUser();
        LearnCodePutDeleteTest.testDeleteSingleUser();


        if(successor != null){
            successor.urlTest(URLparam);
        }
    }
}
