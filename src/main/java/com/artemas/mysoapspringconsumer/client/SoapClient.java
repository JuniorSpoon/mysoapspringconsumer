package com.artemas.mysoapspringconsumer.client;

import com.artemas.mysoapspringconsumer.car.Car;
import com.artemas.mysoapspringconsumer.car.GetCarRequest;
import com.artemas.mysoapspringconsumer.car.GetCarResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
@RequiredArgsConstructor
public class SoapClient {

    private final Jaxb2Marshaller marshaller;

    private WebServiceTemplate template;

    public GetCarResponse getCar(GetCarRequest request) {
        template = new WebServiceTemplate(marshaller);
        return (GetCarResponse) template.marshalSendAndReceive("http://localhost:8080/ws", request);
    }
}
