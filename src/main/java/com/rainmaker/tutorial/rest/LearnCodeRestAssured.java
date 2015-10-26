package com.rainmaker.tutorial.rest;



import static com.jayway.restassured.RestAssured.expect;
import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LearnCodeRestAssured {

    public static void testGetSingleUser() {
        expect().
                statusCode(200).
                body(
                        "[4].name", equalTo("Will Smith"),
                        "[4].age", equalTo("47"),
                        "[4].id", equalTo("562ce124d1c3d2010001da0f")).
                when().
                get("http://rest.learncode.academy/api/johnbob/friends");
    }


    public static void testPostSingleUser() {
        given().parameters("name", "Billy Bob Rest Test", "age", "37").
        expect().
                statusCode(200).
                body(
                        "name", equalTo("Billy Bob Rest Test"),
                        "age", equalTo("37")).
                when().
                post("http://rest.learncode.academy/api/johnbob/friends");
    }


    public static void testPutSingleUser() {
        given().parameters("name", "Billy Bob Rest Test", "age", "43").
                expect().
                statusCode(500).
                when().
                put("http://rest.learncode.academy/api/johnbob/friends/4");
    }


    public static void testDeleteSingleUser() {
        given().parameters("name", "Billy Bob Rest Test", "age", "43").
                expect().
                statusCode(500).
                when().
                delete("http://rest.learncode.academy/api/johnbob/friends/4");
    }
}
