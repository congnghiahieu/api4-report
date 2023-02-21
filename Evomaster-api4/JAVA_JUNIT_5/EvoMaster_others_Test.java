import  org.junit.jupiter.api.AfterAll;
import  org.junit.jupiter.api.BeforeAll;
import  org.junit.jupiter.api.BeforeEach;
import  org.junit.jupiter.api.Test;
import  org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import  java.util.Map;
import  java.util.List;
import static org.evomaster.client.java.controller.api.EMTestUtils.*;
import  org.evomaster.client.java.controller.SutHandler;
import  io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import  io.restassured.response.ValidatableResponse;
import static org.hamcrest.Matchers.*;
import  io.restassured.config.JsonConfig;
import  io.restassured.path.json.config.JsonPathConfig;
import static io.restassured.config.RedirectConfig.redirectConfig;
import static org.evomaster.client.java.controller.contentMatchers.NumberMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.StringMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.SubStringMatcher.*;
import static org.evomaster.client.java.controller.expect.ExpectationHandler.expectationHandler;
import  org.evomaster.client.java.controller.expect.ExpectationHandler;
import  io.restassured.path.json.JsonPath;
import  java.util.Arrays;




/**
 * This file was automatically generated by EvoMaster on 2023-02-21T09:32:33.742078900+07:00[Asia/Bangkok]
 * <br>
 * The generated test suite contains 12 tests
 * <br>
 * Covered targets: 17
 * <br>
 * Used time: 0h 15m 3s
 * <br>
 * Needed budget for current results: 88%
 * <br>
 * This file contains test cases that represent failed calls, but not indicative of faults.
 */
public class EvoMaster_others_Test {

    
    private static String baseUrlOfSut = "https://6-dot-authentiqio.appspot.com";
    /** [ems] - expectations master switch - is the variable that activates/deactivates expectations individual test cases
    * by default, expectations are turned off. The variable needs to be set to [true] to enable expectations
    */
    private static boolean ems = false;
    /**
    * rso - response structure oracle - checking that the response objects match the responses defined in the schema
    */
    private static boolean rso = false;
    
    
    @BeforeAll
    public static void initClass() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.urlEncodingEnabled = false;
        RestAssured.config = RestAssured.config()
            .jsonConfig(JsonConfig.jsonConfig().numberReturnType(JsonPathConfig.NumberReturnType.DOUBLE))
            .redirect(redirectConfig().followRedirects(false));
    }
    
    
    
    
    
    
    
    
    @Test @Timeout(60)
    public void test_0() throws Exception {
        
        given().accept("*/*")
                .contentType("application/json")
                .body(" { " + 
                    " \"phone\": \"AqNk5\", " + 
                    " \"scope\": \"768\", " + 
                    " \"sub\": \"xrGN2iSUn5Cpjm\" " + 
                    " } ")
                .post(baseUrlOfSut + "/scope?test=768")
                .then()
                .statusCode(400)
                .assertThat()
                .contentType("application/problem+json")
                .body("'status'", numberMatches(400.0))
                .body("'doc'", containsString("Incorrect value / format for parameter"))
                .body("'type'", containsString("https://6-dot-authentiqio.appspot.com/error/value-error"))
                .body("'detail'", containsString("Job id format error"))
                .body("'title'", containsString("ScopeHandler.ValueError: Bad Request"));
        
    }
    
    
    @Test @Timeout(60)
    public void test_1() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        given().accept("*/*")
                .delete(baseUrlOfSut + "/key?" + 
                    "email=DC87k&" + 
                    "phone=1U&" + 
                    "code=K")
                .then()
                .statusCode(400)
                .assertThat()
                .contentType("application/problem+json")
                .body("'status'", numberMatches(400.0))
                .body("'doc'", containsString("Incorrect value / format for parameter"))
                .body("'type'", containsString("https://6-dot-authentiqio.appspot.com/error/value-error"))
                .body("'detail'", containsString("Email format error"))
                .body("'title'", containsString("KeyHandler.ValueError: Bad Request"));
        
        
        ValidatableResponse res_1 = given().accept("*/*")
                .get(baseUrlOfSut + "/key/ZzyO")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/problem+json")
                .body("'status'", numberMatches(404.0))
                .body("'doc'", containsString("Key not registered to a device / key not found"))
                .body("'type'", containsString("https://6-dot-authentiqio.appspot.com/error/unknown-key"))
                .body("'detail'", containsString(""))
                .body("'title'", containsString("KeyHandler.HttpError: Not Found"));
        
        expectationHandler.expect(ems);
    }
    
    
    @Test @Timeout(60)
    public void test_2() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        given().accept("*/*")
                .delete(baseUrlOfSut + "/scope/aIVAKB_S")
                .then()
                .statusCode(405)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("405 Method Not Allowed\n\nThe method DELETE is not allowed for this resource. \n\n "));
        
        
        ValidatableResponse res_1 = given().accept("*/*")
                .head(baseUrlOfSut + "/key/yMup1fHUG_q5m_X0")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
        
        expectationHandler.expect(ems);
        
        given().accept("*/*")
                .delete(baseUrlOfSut + "/key?" + 
                    "email=DLDeJbLufVMk5G&" + 
                    "phone=l7PPbgE34MCmJ7")
                .then()
                .statusCode(400)
                .assertThat()
                .contentType("application/problem+json")
                .body("'status'", numberMatches(400.0))
                .body("'doc'", containsString("Incorrect value / format for parameter"))
                .body("'type'", containsString("https://6-dot-authentiqio.appspot.com/error/value-error"))
                .body("'detail'", containsString("Email format error"))
                .body("'title'", containsString("KeyHandler.ValueError: Bad Request"));
        
        
        ValidatableResponse res_3 = given().accept("*/*")
                .post(baseUrlOfSut + "/scope/gBt9YU2D")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/problem+json")
                .body("'status'", numberMatches(404.0))
                .body("'doc'", containsString("Not found"))
                .body("'type'", containsString("https://6-dot-authentiqio.appspot.com/error/not-found"))
                .body("'detail'", containsString("Path not defined"))
                .body("'title'", containsString("CatchAll.HttpError: Not Found"));
        
        expectationHandler.expect(ems);
        
        given().accept("*/*")
                .put(baseUrlOfSut + "/scope/Za")
                .then()
                .statusCode(405)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("405 Method Not Allowed\n\nThe method PUT is not allowed for this resource. \n\n "));
        
        
        given().accept("*/*")
                .delete(baseUrlOfSut + "/key/5FfNhq?secret=")
                .then()
                .statusCode(400)
                .assertThat()
                .contentType("application/problem+json")
                .body("'status'", numberMatches(400.0))
                .body("'doc'", containsString("Incorrect value / format for parameter"))
                .body("'type'", containsString("https://6-dot-authentiqio.appspot.com/error/value-error"))
                .body("'detail'", containsString("revoke key needs authorization parameter"))
                .body("'title'", containsString("KeyHandler.ValueError: Bad Request"));
        
        
        ValidatableResponse res_6 = given().accept("*/*")
                .delete(baseUrlOfSut + "/key/597neRLgBLwJE?secret=RHDVdOmt")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/problem+json")
                .body("'status'", numberMatches(404.0))
                .body("'doc'", containsString("Key not registered to a device / key not found"))
                .body("'type'", containsString("https://6-dot-authentiqio.appspot.com/error/unknown-key"))
                .body("'detail'", containsString(""))
                .body("'title'", containsString("KeyHandler.HttpError: Not Found"));
        
        expectationHandler.expect(ems);
        
        given().accept("*/*")
                .put(baseUrlOfSut + "/scope/b")
                .then()
                .statusCode(405)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("405 Method Not Allowed\n\nThe method PUT is not allowed for this resource. \n\n "));
        
    }
    
    
    @Test @Timeout(60)
    public void test_3() throws Exception {
        
        given().accept("*/*")
                .contentType("application/json")
                .body(" { " + 
                    " \"aud\": \"NGgCb\", " + 
                    " \"iss\": \"hRhLwU\", " + 
                    " \"nbf\": 692, " + 
                    " \"sub\": \"p5phN69ZUnY\" " + 
                    " } ")
                .post(baseUrlOfSut + "/login?callback=ywKvorxzp18y")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/problem+json")
                .body("'status'", numberMatches(404.0))
                .body("'doc'", containsString("Not found"))
                .body("'type'", containsString("https://6-dot-authentiqio.appspot.com/error/not-found"))
                .body("'detail'", containsString("Path not defined"))
                .body("'title'", containsString("CatchAll.HttpError: Not Found"));
        
    }
    
    
    @Test @Timeout(60)
    public void test_4() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("*/*")
                .get(baseUrlOfSut + "/key/NiNg")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/problem+json")
                .body("'status'", numberMatches(404.0))
                .body("'doc'", containsString("Key not registered to a device / key not found"))
                .body("'type'", containsString("https://6-dot-authentiqio.appspot.com/error/unknown-key"))
                .body("'detail'", containsString(""))
                .body("'title'", containsString("KeyHandler.HttpError: Not Found"));
        
        expectationHandler.expect(ems);
    }
    
    
    @Test @Timeout(60)
    public void test_5() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("*/*")
                .post(baseUrlOfSut + "/scope/Pav")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/problem+json")
                .body("'status'", numberMatches(404.0))
                .body("'doc'", containsString("Not found"))
                .body("'type'", containsString("https://6-dot-authentiqio.appspot.com/error/not-found"))
                .body("'detail'", containsString("Path not defined"))
                .body("'title'", containsString("CatchAll.HttpError: Not Found"));
        
        expectationHandler.expect(ems);
    }
    
    
    @Test @Timeout(60)
    public void test_6() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("*/*")
                .delete(baseUrlOfSut + "/key/CZr_KlUTKcloF?secret=zOqWrZpSTLr6Nr")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/problem+json")
                .body("'status'", numberMatches(404.0))
                .body("'doc'", containsString("Key not registered to a device / key not found"))
                .body("'type'", containsString("https://6-dot-authentiqio.appspot.com/error/unknown-key"))
                .body("'detail'", containsString(""))
                .body("'title'", containsString("KeyHandler.HttpError: Not Found"));
        
        expectationHandler.expect(ems);
    }
    
    
    @Test @Timeout(60)
    public void test_7() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        given().accept("*/*")
                .contentType("application/json")
                .body(" { " + 
                    " \"aud\": \"XWnVyXoV\", " + 
                    " \"iss\": \"OY9L\", " + 
                    " \"nbf\": 879, " + 
                    " \"sub\": \"wQi2LrA2qR2RE8WX\" " + 
                    " } ")
                .post(baseUrlOfSut + "/login?callback=9kGZU")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/problem+json")
                .body("'status'", numberMatches(404.0))
                .body("'doc'", containsString("Not found"))
                .body("'type'", containsString("https://6-dot-authentiqio.appspot.com/error/not-found"))
                .body("'detail'", containsString("Path not defined"))
                .body("'title'", containsString("CatchAll.HttpError: Not Found"));
        
        
        ValidatableResponse res_1 = given().accept("*/*")
                .get(baseUrlOfSut + "/scope/Aq")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/problem+json")
                .body("'status'", numberMatches(404.0))
                .body("'doc'", containsString("Not found"))
                .body("'type'", containsString("https://6-dot-authentiqio.appspot.com/error/not-found"))
                .body("'detail'", containsString("Path not defined"))
                .body("'title'", containsString("CatchAll.HttpError: Not Found"));
        
        expectationHandler.expect(ems);
    }
    
    
    @Test @Timeout(60)
    public void test_8() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("*/*")
                .delete(baseUrlOfSut + "/key/Mr398?secret=zod2BnzP8G4AJDX")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/problem+json")
                .body("'status'", numberMatches(404.0))
                .body("'doc'", containsString("Key not registered to a device / key not found"))
                .body("'type'", containsString("https://6-dot-authentiqio.appspot.com/error/unknown-key"))
                .body("'detail'", containsString(""))
                .body("'title'", containsString("KeyHandler.HttpError: Not Found"));
        
        expectationHandler.expect(ems);
        
        ValidatableResponse res_1 = given().accept("*/*")
                .head(baseUrlOfSut + "/key/VzixDK")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
        
        expectationHandler.expect(ems);
    }
    
    
    @Test @Timeout(60)
    public void test_9() throws Exception {
        
        given().accept("*/*")
                .delete(baseUrlOfSut + "/scope/GghL")
                .then()
                .statusCode(405)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("405 Method Not Allowed\n\nThe method DELETE is not allowed for this resource. \n\n "));
        
    }
    
    
    @Test @Timeout(60)
    public void test_10() throws Exception {
        
        given().accept("*/*")
                .put(baseUrlOfSut + "/scope/5aFooH8PlsLQbq")
                .then()
                .statusCode(405)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("405 Method Not Allowed\n\nThe method PUT is not allowed for this resource. \n\n "));
        
    }
    
    
    @Test @Timeout(60)
    public void test_11() throws Exception {
        
        given().accept("*/*")
                .head(baseUrlOfSut + "/scope/LBtKG1_zu6P")
                .then()
                .statusCode(405)
                .assertThat()
                .body(isEmptyOrNullString());
        
    }


}
