/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class tarea1 {

static Scanner leer = new Scanner (System.in);


public static void main (String[] args ){

int opci;

      do{
          System.out.println("\nMENU DE OPCIONES");
          System.out.println("1. SUMA");
          System.out.println("2. ARREGLO");
          System.out.println("3. MULTIPLICACION");
          System.out.println("4. DIVISION");
          System.out.println("5. RESTA");
          System.out.println("6. USO DE FOR");
          System.out.println("7. RENAP");
          System.out.println("8. SALIR ");
           System.out.println("Ingrese la opcion");

             opci=leer.nextInt();
          

           switch(opci){
            
             case 1: 
                   int resultado;
                   int no1,no2;
                   System.out.println("CAlculadora SUMA");
 
                   System.out.println("Ingrese el primer numero");
                   no1=leer.nextInt();

                   System.out.println("Ingrese el segundo numero");
                   no2=leer.nextInt();

                   resultado=suma(no1,no2);
                   System.out.println("El resultado de la suma es: "+resultado+"\n");

                   break;

            case 2:
                   System.out.println("\nArreglo");
                   arreglo();
                   System.out.println("\n");
                   break;

              case 3:

                  int result;
                   int num1,num2;
                   System.out.println("CAlculadora Multiplicacion");
 
                   System.out.println("Ingrese el primer numero");
                   no1=leer.nextInt();

                   System.out.println("Ingrese el segundo numero");
                   no2=leer.nextInt();

                   result=multi(no1,no2);
                   System.out.println("El resultado de la Multiplicacion es: "+result+"\n");
                   break;


             case 4:
                   divi();

             break;


             case 5:
                   resta();

             break;


             case 6:
                   usofor();

             break;

             case 7:
                    registro();

             break;

             case 8:
                    System.out.println("SALIR");

             break;

               default:
               System.out.println("DATO INVALIDO");
          
               }

             }while(opci!=8);



}

    
public static int suma(int num1,int num2){

int sumas;
sumas=num1+num2;
return sumas;
}


public static void arreglo(){

 int num = 7;
  int x = 0;
  int numeros[] = new int[num];

  for(int i=1;i < num+1;i++){
      
      numeros[x]= i;
      x++;
  }
   for(int i:numeros){
       System.out.print(i + " ");

}
}


public static int multi(int num1,int num2){

int multi;
multi=num1*num2;
return multi;

}

public static void divi(){

float div;
float nu1,nu2;

System.out.println("Calcular Divisiones");
System.out.println("Ingrese el primer numero");
nu1=leer.nextFloat();
System.out.println("Ingrese el segundo numero");
nu2=leer.nextFloat();

div=nu1/nu2;
System.out.println("El resultado de la Multiplicacion es: "+div+"\n");
}

public static void resta(){

int rest;
int nu1,nu2;

System.out.println("Calcular Resta");
System.out.println("Ingrese el primer numero");
nu1=leer.nextInt();
System.out.println("Ingrese el segundo numero");
nu2=leer.nextInt();

rest=nu1-nu2;
System.out.println("El resultado de la Multiplicacion es: "+rest+"\n");
}

public static void usofor(){

System.out.println("\nRepresentacion de ciclo for");
int nu1,nu2;

System.out.println("Ingrese el numero de inicio");
nu1=leer.nextInt();
System.out.println("Ingrese el numero de finalizacion");
nu2=leer.nextInt();
System.out.println("\nResultado");
for(int i=nu1;i<=nu2;i++){
System.out.println(i);
}


}


public static void registro(){


String  dato1;
String dato2;

System.out.println("REGISTRARCE PORQUE SI NO ME PIERDO");

dato1=leer.nextLine();

System.out.println("Ingrese su nombre");
dato1=leer.nextLine();

System.out.println("Ingrese su apellido");
dato2=leer.nextLine();

System.out.println("Tu registo es: "+dato1+" "+dato2);
}

}