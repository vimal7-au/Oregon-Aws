package com.nike.aws.lambda.core;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class EventHandler implements RequestHandler<Object, Object> {

    @Override
    public String handleRequest(Object input, Context context) {
        System.out.println("Handle request invokedddd");
        return "Received message: " + input;
    }

}
