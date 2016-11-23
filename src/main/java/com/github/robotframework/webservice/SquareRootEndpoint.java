package com.github.robotframework.webservice;

import com.github.robotframework.utils.SquareRootCalcer;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class SquareRootEndpoint {
    private static final String NAMESPACE_URI = "http://github.com/robotframework/webservice";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "squareRootRequest")
    @ResponsePayload
    public SquareRootResponse squareRoot(@RequestPayload SquareRootRequest request) {
        SquareRootResponse response = new SquareRootResponse();
        response.setOutput(SquareRootCalcer.calc(request.getInput()));
        return response;
    }


}
