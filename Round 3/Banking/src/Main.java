import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<User> userList = new ArrayList<>();
        userList.add(new User(1, "Elango", 10000.0f));
        userList.add(new User(2, "Arun", 15000.0f));
        userList.add(new User(3, "Karthik", 20000.0f));

        boolean run = true;

        while (run){

            System.out.println("---------------------------");
            System.out.println("Banking System....!");
            System.out.println("1.Creat a User");
            System.out.println("2.Show Balance");
            System.out.println("3.Windrow");
            System.out.println("4.Send Money");
            System.out.println("5.Exit");

            int ch;
            System.out.println("Enter Your Option");
            ch = sc.nextInt();

            switch (ch){
                case 1:{
                    System.out.println("Enter Id :");
                    int id = sc.nextInt();
                    System.out.println("Enter Name :");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Enter Bal");
                    float bal = sc.nextFloat();
                    userList.add( Services.creatuser(id, bal, name));
                    break;
                }

                case 2:{
                    System.out.println("Enter Id :");
                    int id = sc.nextInt();
                    Services.Show(id,userList);
                    break;
                }

                case 3:{
                    System.out.println("Enter Id :");
                    int id = sc.nextInt();
                    System.out.println("Enter Money :");
                    int money = sc.nextInt();
                    Services.Windro(id, userList, money);
                    break;
                }

                case 4:
                {
                    System.out.println("Give Send Id :");
                    int send = sc.nextInt();
                    System.out.println("Give Reciver Id");
                    sc.nextLine();
                    int rec = sc.nextInt();
                    System.out.println("Give Money :");
                    float money = sc.nextFloat();
                    Services.Send(send,rec,userList,money);
                    break;
                }
                case 5:
                {
                    run = false;
                    break;
                }
            }

        }
//        for(User user : userList){
//            System.out.println("User Id: "+user.getId());
//            System.out.println("User Balsn " + user.getBal());
//            System.out.println("User Name : " +user.getName());
//        }
    }

}