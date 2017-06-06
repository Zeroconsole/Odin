package com.Zerostudios;


import java.util.Scanner;
/**
 * Created by zero on 6/5/17.
 *  This class is to setup the environment for ODIN.
 *
 */
public class Introduction {






    private void check(){
        System.out.print("Who are you? Odin or Raven? If you need help, type --help.");
        Scanner scanit = new Scanner(System.in);
        String whoru = scanit.nextLine();

        if(whoru == "Odin"){
            System.out.println("Welcome home Odin! please wait as we prepare your throne. . .");
            //call the method to call on the bash scripts for Odin
        }
        if(whoru == "Raven"){

        }
        if(whoru == "--help") {


        }










    }









}




