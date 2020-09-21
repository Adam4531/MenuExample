import java.util.Scanner;

public class Menu {
String[] options = {"View database","Add new item","Delete item","Quit program"};
Scanner scanner = new Scanner(System.in);

    void display(){
        for(int i=0;i< options.length;i++){
            System.out.printf("%d. %s\n", i+1,options[i]);
        }
        System.out.print("> ");
        boolean running = true;
        do{

            int input = scanner.nextInt();
            if(input == 1){
                for(int i=0;i<options.length;i++)
                    System.out.printf("%d. %s\n", i+1,options[i]);
            }
            else if(input == 2){
                System.out.println("Type a command to add it: ");
                System.out.print("> ");
                System.out.println();
                System.out.println("Something is wrong I canl feel it");
            }
            else if(input == 3){
                System.out.println("Which one do you want to delete? ");
                System.out.print("> ");
                System.out.println();
                System.out.println("Something is wrong I canl feel it");

            }
            else if(input == 4){
                System.out.println("Quiting program...");
                running=false;
            }

        }while(running);
    }

}
