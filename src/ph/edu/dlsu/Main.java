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