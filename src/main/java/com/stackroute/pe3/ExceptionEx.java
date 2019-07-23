package com.stackroute.pe3;

public class ExceptionEx {
    String message;

    public ExceptionEx(String message){

        System.out.println(this.message = message);

    }

    public static void main(String[] args) throws Exception {

        ExceptionEx exceptionExample = new ExceptionEx("Throwing exception in try block");

        try{
            throw  new Exception(exceptionExample.message);
        }
        catch (Exception exp){
            System.out.println(exp.getMessage());
        }

        finally {
            System.out.println("I was there");
        }

    }
}
