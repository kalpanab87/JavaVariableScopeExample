package learnProgramming;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

public class VariableScope {
    static int myGlobalint = 5;
//    static int myMainLocalint = 0;

    public static void main(String[] args) {

//        System.out.println(my);;

        int myMainLocalint = 10;



        System.out.println(myMainLocalint);
        System.out.println(myGlobalint);
        AnotherVariableScopeClass avsc = new AnotherVariableScopeClass();




        AnotherVariableScopeClass abc = new AnotherVariableScopeClass();
        abc.myStaticGlobalint=0;

        avsc.myStaticGlobalint = 10;

        abc.anotherMethod();



        System.out.println(+abc.myStaticGlobalint);

        {
            int myCodeblockInt = 100;

            System.out.println(myCodeblockInt);
        }
//        System.out.println(m);
//        System.out.println(myCodeblockInt);

        VariableScope vs = new VariableScope();
        vs.myMethod();

    }

    void myMethod(){
        int myLocalInt = 10;



//        System.out.println(myMainLocalint );

        System.out.println(myLocalInt);
        System.out.println(myGlobalint);
    }
}

class AnotherVariableScopeClass{

    public int myStaticGlobalint = 15;
   // System.out.println(myStaticGlobalint);
    public void anotherMethod(){

    }
    }
