package com.harshan92;

public class Demo {
    private static AbstractLogger getChainOfLogger(){
        AbstractLogger errorLogger=new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger=new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger=new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
    public static void main(String[] args) {
        AbstractLogger loggerChain=getChainOfLogger();
        loggerChain.logMessage(AbstractLogger.INFO, "This is an information");
        System.out.println("=======================");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information");
        System.out.println("=======================");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an  error information");
    }
}