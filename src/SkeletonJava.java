import javax.swing.*;
import java.util.Scanner;

/**
 * Created by icondor on 26/03/16.
 */
public class SkeletonJava {

    /* utility methods for INPUT/OUTPUT using a GUI or Console, please leave them as they are */

    // GUI
    public static int readIntGUI(String label) {
        String input = JOptionPane.showInputDialog(null,
                label);
        int returnValue = Integer.parseInt(input);
        return returnValue;
    }

    public static double readDoubleGUI(String label) {
        String input = JOptionPane.showInputDialog(null,
                label);
        double returnValue = Double.parseDouble(input);
        return returnValue;
    }

    public static String readStringGUI(String label) {
        String input = JOptionPane.showInputDialog(null,
                label);
        return input;
    }

    public static void printGUI(String text) {
        JOptionPane.showMessageDialog(null, text);
    }

    public static void printGUI(int text) {
        JOptionPane.showMessageDialog(null, text);
    }

    public static void printGUI(double text) {
        JOptionPane.showMessageDialog(null, text);
    }
    // CONSOLE
    public static String readStringConsole(String label) {
        System.out.print(label);
        String input = new Scanner(System.in).nextLine();
        return input;
    }

    public static int readIntConsole(String label) {
        System.out.print(label);
        int input = new Scanner(System.in).nextInt();
        return input;
    }

    public static double readDoubleConsole(String label) {
        System.out.print(label);
        double input = new Scanner(System.in).nextDouble();
        return input;
    }

    public static void printConsole(String text) {
        System.out.println(text);
    }

    public static void printConsole(int text) {
        System.out.println(text);
    }

    public static void printConsole(double text) {
        System.out.println(text);
    }
    /* end of utility methods*/


    /* here starts the main class */
    public static void main(String[] args) {
        //int nr1 = readIntGUI("Nr1:");
        //int nr2 = readIntGUI("Nr2:");

        //int media = (nr1 + nr2) / 2;

        //printGUI(media);

  /*      if (media <5)
        printGUI("Corijent");

        else
            if(media==5)
                printGUI("Ai trecut la limita!");

            else
                if(media==6)
                    printGUI("Ai trecut clasa!");

        else

        printGUI("Ai trecut cu brio!"); */

/*        //switch
        switch(media) {

            case 4 : printGUI("ai picat");break;
            case 5 : printGUI("Esti ok");break;
            case 6 : printGUI("Poti mai bine");break;
            case 8 : printGUI("Bravo!");


        }
        }

        }

*/
/*       int nr1;
        int dublura;
        do {
            nr1=readIntGUI("Mai incearca");
            dublura= 2*nr1;
        printGUI(dublura);
        }

        while(dublura<=100);
   */



  /*      int[] noteMate={2,5,7,9};

        int suma=0;
                for(int i=0;i<noteMate.length;i++){

            suma=suma+noteMate[i];

                  System.out.println("pas:"+i+"suma"+suma);}

                 */

   /*     int []note=new int[3];
        int suma=0;

        for (int i=0;i<note.length;i++){

            note[i]=readIntGUI("introduceti nota!");
            suma+=note[i];}
        int media=suma/note.length;
            System.out.println("media e:"+media);

        int max=note[0];

        for(int i=1; i<note.length; i++){

            if (note[i]>max)

                max=note[i];
        }

        System.out.println("nota maxima e:"+ max);
*/
        int nr1;
        int i=0;
        int suma=0;
        int media=0;

        do{
            nr1=readIntGUI("introdu numar");
            suma= suma+nr1;
            i++;
        }

        while(nr1 !=0);
        media=suma/(i-1);

        System.out.println("suma este:"+suma);
        System.out.println("media este:" +media);
        }


              }


        //end of main method

// end of class
