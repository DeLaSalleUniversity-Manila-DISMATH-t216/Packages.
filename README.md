# Packages.

![jcinsanity](Screenshot 001.PNG)
![jcinsanity](Screenshot 002.PNG)
![jcinsanity](Screenshot 003.PNG)




~~~
package ph.edu.dlsu;

import ph.edu.dlsu.Helper.InputHelper;
import ph.edu.dlsu.Helper.LogicHelper;

public class Main {

    public static void main(String[] args)  {

        String j = InputHelper.getInput("Input X (true or false): ");
        String c = InputHelper.getInput("Input Y (true or false): ");

        if (j.equals("0"))
            c = "false";

        if (j.equals("1"))
            c = "true";

        if (j.equals("1"))
            c = "true";

        if (j.equals("0"))
            c = "false";

        boolean X = Boolean.parseBoolean(j);
        boolean Y = Boolean.parseBoolean(c);

        System.out.println("Choose: 1. AND, 2. OR, 3. XOR, 4. NAND, 5. NOR, 6. XNOR 7.IMPLICATION, 8. EXIT ");
        String strOption = InputHelper.getInput("Choose from 1-8 =  ");

        int intOption = Integer.parseInt(strOption);

        switch(intOption){
            case 1:
                LogicHelper.andTable(X, Y);
                break;
            case 2:
                LogicHelper.orTable(X, Y);
                break;
            case 3:
                LogicHelper.xorTable(X, Y);
                break;
            case 4:
                LogicHelper.nandTable(X, Y);
                break;
            case 5:
                LogicHelper.norTable(X, Y);
                break;
            case 6:
                LogicHelper.xnorTable(X, Y);
                break;
            case 7:
                LogicHelper.impliTable(X, Y);
                break;
            default:
                System.out.println("I'm sorry");
                break;

        }
    }



}
~~~

~~~
package ph.edu.dlsu.Helper;

public class LogicHelper {
    public static void andTable(boolean x, boolean y) {
        System.out.println("|\t" +x+ "\t|\t" +y+ "\t|\t" +(x && y)+ "\t|");
    }

    public static void orTable(boolean x, boolean y) {

        System.out.println("|\t" +x+ "\t|\t" +y + "\t|\t" +(x || y)+ "\t|");
    }

    public static void xorTable(boolean x, boolean y) {
        System.out.println("|\t" +x+ "\t|\t" +y+ "\t|\t" +(x ^ y)+ "\t|");
    }

    public static void nandTable(boolean x, boolean y) {
        System.out.println("|\t" +x+ "\t|\t" +y+ "\t|\t" +!(x && y)+ "\t|");
    }

    public static void norTable(boolean x, boolean y) {
        System.out.println("|\t" +x+ "\t|\t" +y+ "\t|\t" +!(x || y)+ "\t|");
    }

    public static void xnorTable(boolean x, boolean y) {
        System.out.println("|\t" +x+ "\t|\t" +y+ "\t|\t" +!(x == y)+ "\t|");

    }

    public static void impliTable(boolean x, boolean y) {
        System.out.println("|\t" + x + "\t|\t" + y + "\t|\t" + (!x || y) + "\t|");
    }
}

~~~

~~~
package ph.edu.dlsu.Helper;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputHelper {
    public static String getInput(String prompt) {
        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print(prompt);
        System.out.flush();

        try {
            return stdin.readLine();
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}

~~~
