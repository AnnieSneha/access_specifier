package com.assignment.protectedaccess;

public class SubProtectedClass extends ProtectedClass {
    public void callProtectedMethod() {
        protectedMethod(); 
    }
}