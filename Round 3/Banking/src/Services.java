import java.util.ArrayList;
import java.util.List;

public class Services {

    public static User creatuser(int id,float bal,String name){
        User user = new User();
        user.setId(id);
        user.setBal(bal);
        user.setName(name);
        return user;
    }

    public static void Send(int send,int reciver,List<User> userList,float money){

        boolean pro = false;
        if(userList.isEmpty() || userList == null) System.out.println("No Data Found");
        for(User user : userList) {
            if (user.getId() == send) {

                if (user.getBal() >= money) {
                    pro = true;
                    user.setBal(user.getBal() - money);
                } else System.out.println("Invaild Traction");
            } else System.out.println("No Sender Data");
        }
        if(pro){

            for(User user : userList){
                if(user.getId() == reciver){
                   user.setBal(user.getBal()+money);
                    System.out.println("Completed");
                }
                else System.out.println("No reciver Data");
            }
        }


    }
    public static void Windro(int windro,List<User> userList,float money){
        for(User user : userList){
            if(user.getId() == windro){
                user.setBal(user.getBal() - money);
            }
            else System.out.println("No Sender Data");
        }
    }
    public static void Show(int id,List<User> userList){

        for(User user : userList){
            if(user.getId() == id) {
                System.out.println("The Use Bal :" + user.getBal());

            }
            else System.out.printf("No Sender Data");

        }

    }
}
