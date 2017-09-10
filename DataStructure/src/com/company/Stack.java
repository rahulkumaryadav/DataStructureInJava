package com.company;

import java.util.Scanner;

/**
 * Created by DELL on 9/9/17.
 */
public class Stack {
    static int[] arr=new int[7];
    static int top=-1;

    public static void main(String[] args){
        System.out.println("enter 1 for push operation");
        System.out.println("enter 2 for Exit");

        Scanner sc=new Scanner(System.in);
        int number =sc.nextInt();


        switch (number){
            case 1:
                System.out.println("Please enter number of element You Want to push");

                int number1=sc.nextInt();
                int[] arr=new int[number1];

                for(int i=0;i<number1;i++){
                    arr[i]=sc.nextInt();
                    push(arr[i]);
                }
                display();
                pop();

                break;

            case 2:
                break;

                 default:
                System.out.println("Please enter correct number");





        }
    }

    static void push(int value){
          top=top+1;
         arr[top]=value;

    }

    static void pop(){
        System.out.println("Do you want to perform pop operation ? ");
        System.out.println("If yes press 1 else 2 ");
        Scanner sc =new Scanner(System.in);
        int number=sc.nextInt();
         switch (number){
             case 1:
                 System.out.println("this is the pop operation");
                 System.out.println("this is the pop operation"+top);

                 display();
             case 2:
                 break;
         }

        display();


    }


    static void display(){
        for(int i=top; top>=0;top--){
            System.out.println("At index---"+top+" "+"value is :"+arr[top]);

        }
    }
}
