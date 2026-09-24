import java.util.List;

public class Prepare_chart {

    public static void Print(List<Passager> passagerList,String Type){
        System.out.println("....Prepare Chart " + Type + "....");
        System.out.println("ID      Name        Seat No");
        for (Passager passager : passagerList){
            System.out.println(passager.getId()+"       "+passager.getName()+"      "+passager.getSeat_No());
        }
    }


}
