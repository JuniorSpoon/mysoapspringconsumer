package com.artemas.mysoapspringconsumer.controller;

import com.artemas.mysoapspringconsumer.car.GetCarRequest;
import com.artemas.mysoapspringconsumer.car.GetCarResponse;
import com.artemas.mysoapspringconsumer.client.SoapClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CarController {
    private final SoapClient client;

    @PostMapping("/getCar")
    public GetCarResponse invokeSoapClientToGetLoanStatus(@RequestBody GetCarRequest carRequest){
        return client.getCar(carRequest);
    }
}
