/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unit_testing_exercise;

/**
 *
 * @author braed
 */
public class Message {
public String stringMessage(){
    return"Hello";
}

public boolean validNumber(int x){
    if (x >= 4){
        return true;
    }else{
        return false;
    }
}
public boolean checkpassword(String password){
    if(password.matches(".*[A-Z].*")&&password.matches(".*[A-Z].*")&&password.matches(".*[a-z].*")&&password.matches(".*[0-9]*.")){
    return true;
}else{
    return false;
}
}
public boolean checkUsername(String username){
if(username.contains("a")){
 return true;   
}else{    
return false;    
}    
}






    
}
