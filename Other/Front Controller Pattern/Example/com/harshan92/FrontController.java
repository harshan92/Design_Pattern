package com.harshan92;

public class FrontController {
    private Dispatcher dispatcher;

    public FrontController(){
        dispatcher=new Dispatcher();
    }

    private boolean isAuthenticatedUser(){
        System.out.println("User is authenticated successfully");
        return true;
    }

    private void trackRequest(String request){
        System.out.println("Page requested: "+request);
    }

    public void dispatchRequest(String request){
        trackRequest(request);

        if(isAuthenticatedUser()){
            dispatcher.dispatch(request);
        }
    }
}