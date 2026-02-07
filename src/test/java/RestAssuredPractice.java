import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.stubbing.StubImport;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import RestAssured.BodyObject;
import RestAssured.InternalBodyObject;
import RestAssured.ResponceObject;
import org.hamcrest.Matchers;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class RestAssuredPractice {

    WireMockServer wireMockServer = new WireMockServer(1080);


    @BeforeClass
    public void setUpWireMockServer() {
        wireMockServer.start();
    }

    @AfterClass
    private void tearDownWireMockServer() {
        wireMockServer.stop();
    }

    @Test
    public void wireMockTest() throws JsonProcessingException {
        WireMock wireMock = new WireMock("localhost", 1080);

        BodyObject bodyObject = new BodyObject();
        bodyObject.setTestKeyBody("someKeyForJacksonTest");

        InternalBodyObject internalBodyObject1 = new InternalBodyObject();
        internalBodyObject1.setInternalObjectKey("someKeyForJacksonTestInternal1");
        InternalBodyObject internalBodyObject2 = new InternalBodyObject();
        internalBodyObject2.setInternalObjectKey("someKeyForJacksonTestInternal2");

        List<InternalBodyObject> internalBodyObjects = new ArrayList<>();
        internalBodyObjects.add(internalBodyObject1);
        internalBodyObjects.add(internalBodyObject2);

        bodyObject.setMultipleObjectKey(internalBodyObjects);

        System.out.println(bodyObject.toString());

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(bodyObject);

        wireMock.importStubMappings(
                StubImport.stubImport()
                        .stub(
                                WireMock.post(WireMock.urlPathTemplate("/someUrl/{some_pathParam}"))
                                        .withPathParam("some_pathParam", WireMock.equalTo("pathParamValue"))
                                        .withHeader("HeaderKey", WireMock.equalTo("HeaderValue"))
                                        .withHeader("Content-Type", WireMock.equalTo("application/json"))
                                        .withRequestBody(WireMock.equalToJson(jsonString))
                                        .willReturn(WireMock.aResponse()
                                                .withStatus(201)
                                                .withHeader("Content-Type", "application/json")
                                                .withBody("""
                                                        {
                                                        "First_Key": "someKeyForJecksonTestFirst",
                                                        "Second_Key": "someKeyForJecksonTestSecond"
                                                        },
                                                        """))

                        )
                        .build()

        );

        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 1080;

        Response response = RestAssured.given()
                .contentType("application/json")
                .header(new Header("HeaderKey", "HeaderValue"))
                .pathParam("some_pathParam", "pathParamValue")
                .body(jsonString)
                .when()
                .post("/someUrl/{some_pathParam}");


        //System.out.println(response.asPrettyString());
        //System.out.println(response.statusCode());

        response.then().body("First_Key", Matchers.equalTo("someKeyForJecksonTestFirst"));
        response.then().body("Second_Key", Matchers.equalTo("someKeyForJecksonTestSecond"));

        ResponceObject responceObject = objectMapper.readValue(response.asString(), ResponceObject.class);

        System.out.println(responceObject);
        System.out.println(responceObject.getClass());

        assertEquals(responceObject.getKey1(), "someKeyForJecksonTestFirst");
        assertEquals(responceObject.getKey2(), "someKeyForJecksonTestSecond");

        /*wireMock.getServeEvents()
                .stream()
                .map(se -> se.getRequest().getBodyAsString())
                .forEach(System.out::println);

        wireMock.findNearMissesForAllUnmatchedRequests().forEach(System.out::println);

        System.out.println(wireMock.getServeEvents().get(0).getRequest().containsHeader("HeaderKey"));
         */

        /*
        wireMock.importStubMappings(
                StubImport.stubImport()
                        .stub(
                                WireMock.post(WireMock.urlPathTemplate("/someUrl/{some_pathParam}"))
                                        .withPathParam("some_pathParam", WireMock.equalTo("pathParamValue"))
                                        .withHeader("HeaderKey", WireMock.equalTo("HeaderValue"))
                                        .withHeader("Content-Type", WireMock.equalTo("application/json"))
                                        .withRequestBody(WireMock.equalToJson("""
                                                {"testKeyBody": "testValueInBody"}
                                                """))
                                        .willReturn(WireMock.aResponse()
                                                .withStatus(201)
                                                .withBody("""
                                                        {"keyValueInResponce": "testValueInResponce"}
                                                        """))

                        )
                        .build()

        );

        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 1080;

        Response response = RestAssured.given()
                .contentType("application/json")
                .header(new Header("HeaderKey", "HeaderValue"))
                .pathParam("some_pathParam", "pathParamValue")
                .body("""
                          {
                          "testKeyBody": "testValueInBody",
                          "multipleObjectKey": [
                          {"internalObjectKey" : "internalObjectValue"},
                          {
                          "internalObjectKey" : "internalObjectValue2"                                                                                                                       }
                          ]
                        }
                        """)
                .when()
                .post("/someUrl/{some_pathParam}");

        //System.out.println(response.asPrettyString());
        //System.out.println(response.statusCode());

        wireMock.getServeEvents()
                .stream()
                .map(se -> se.getRequest().getBodyAsString())
                .forEach(System.out::println);

        wireMock.findNearMissesForAllUnmatchedRequests().forEach(System.out::println);

        System.out.println(wireMock.getServeEvents().get(0).getRequest().containsHeader("HeaderKey"));

         */
    }


    @Test
    public void testRestAssured() {
        RestAssured.baseURI = "https://v2.jokeapi.dev/joke";

        RequestSpecification requestSpecification = RestAssured.given()
                .queryParam("blacklistFlags", "nsfw,religious,political,racist,sexist,explicit")
                .queryParam("type", "single")
                .queryParam("amount", "3");

        Response response = requestSpecification.when().get("/Programming");

        ValidatableResponse validatableResponse = response.then();
        validatableResponse
                .statusCode(200)
                .and()
                .body("jokes", Matchers.hasSize(3))
                .and()
                .body("amount", Matchers.equalTo(3))
                .and()
                .body("jokes[0].category", Matchers.equalTo("Programming"));

        System.out.println(response.getBody().prettyPrint());
    }
}