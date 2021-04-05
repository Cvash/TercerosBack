package com.tdp.ms.contratosterceros.expose;

import java.util.HashMap;
import java.util.Map;

import com.tdp.genesis.core.constants.HttpHeadersKey;
import com.tdp.ms.contratosterceros.model.ContratostercerosRequest;
import com.tdp.ms.contratosterceros.model.ContratostercerosResponse;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.reactive.function.BodyInserters;

@SpringBootTest
@AutoConfigureWebTestClient(timeout = "20000")
public class ContratostercerosControllerTest {

    private static final String POST = "post";
    private static final String GENESIS = "genesis";
    private static final String UUID = "550e8400-e29b-41d4-a716-446655440000";

    @Autowired
    private WebTestClient webClient;

    private static Map<String, ContratostercerosResponse> contratostercerosResponseMap = new HashMap<>();
    private static Map<String, ContratostercerosRequest> contratostercerosRequestMap = new HashMap<>();

    @BeforeAll
    public static void setUp() {
        contratostercerosResponseMap.put("get", new ContratostercerosResponse("Hello world!"));
        contratostercerosResponseMap.put(POST, new ContratostercerosResponse("User created!"));
        contratostercerosRequestMap.put(POST, new ContratostercerosRequest("User"));
        contratostercerosRequestMap.put("empty", new ContratostercerosRequest(""));
    }

    @Test
    public void indexGetTest() {
        this.webClient.get()
            .uri("/contratosterceros/v1/greeting")
            .accept(MediaType.APPLICATION_JSON)
            .header(HttpHeadersKey.UNICA_SERVICE_ID,UUID)
            .header(HttpHeadersKey.UNICA_APPLICATION,GENESIS)
            .header(HttpHeadersKey.UNICA_PID,UUID)
            .header(HttpHeadersKey.UNICA_USER,GENESIS)
            .header("ClientId","12122322")
            .exchange()
            .expectStatus().isOk()
            .expectBody(ContratostercerosResponse.class)
            .isEqualTo(contratostercerosResponseMap.get("get"));
    }

    @Test
    public void indexPostTest() {
        this.webClient.post()
            .uri("/contratosterceros/v1/greeting")
            .accept(MediaType.APPLICATION_JSON)
            .header(HttpHeadersKey.UNICA_SERVICE_ID,UUID)
            .header(HttpHeadersKey.UNICA_APPLICATION,GENESIS)
            .header(HttpHeadersKey.UNICA_PID,UUID)
            .header(HttpHeadersKey.UNICA_USER,GENESIS)
            .body(BodyInserters.fromValue(contratostercerosRequestMap.get(POST)))
            .exchange()
            .expectStatus().isEqualTo(HttpStatus.CREATED)
            .expectBody(ContratostercerosResponse.class)
            .isEqualTo(contratostercerosResponseMap.get(POST));
    }

}
