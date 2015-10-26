package com.rainmaker.tutorial.rest.chain;



import java.util.logging.Logger;

import static com.jayway.restassured.RestAssured.expect;
import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LearnCodeGetPostTest extends RestTester{
    private static String URL;
    private static Logger logger = Logger.getLogger(LearnCodeGetPostTest.class.getName());

    private static void testGetSingleUser() {
        logger.info("testGetSingleUser");

        expect().
                statusCode(200).
                body(
                        "[4].name", equalTo("Will Smith"),
                        "[4].age", equalTo("47"),
                        "[4].id", equalTo("562ce124d1c3d2010001da0f")).
                when().
                get(URL);
    }


    private static void testPostSingleUser() {
        logger.info("testPostSingleUser");

        given().parameters("name", "Billy Bob Rest Test", "age", "37").
        expect().
                statusCode(200).
                body(
                        "name", equalTo("Billy Bob Rest Test"),
                        "age", equalTo("37")).
                when().
                post(URL);
    }




    @Override
    public void urlTest(String URLparam) {
        URL = URLparam;
        LearnCodeGetPostTest.testGetSingleUser();
        LearnCodeGetPostTest.testPostSingleUser();


        if(successor != null){
            successor.urlTest(URLparam);
        }
    }
}
