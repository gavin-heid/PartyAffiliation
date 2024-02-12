import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String affiliationChoice = "";
        String menu = "D - democrat, R - republican, I - independent"; //DRI
        //display the menu
        //input affiliationChoice
        affiliationChoice = " ";
        System.out.println("What is your party affiliation?");
        if (in.hasNext())
        {
            affiliationChoice = in.next();
                    switch (affiliationChoice)
                    {
                        case "D":
                        case "d":
                            System.out.println("You get a democratic donkey");
                            break;
                        case "R":
                        case "r":
                            System.out.println("You get a republican elephant");
                            break;
                        case "I":
                        case "i":
                            System.out.println("You are independent");
                            break;
                        default:
                            System.out.println("You chose a party other than democrat, republican, or independent!");
                    }
        }


    }
}