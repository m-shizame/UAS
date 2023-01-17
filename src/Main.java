import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
int jumlah=4;
UASID myMessage = new UASID();
        Scanner sc = new Scanner(System.in);
        myMessage.setMessageID(sc.nextLine());
        myMessage.setMessageName(sc.nextLine());
        ArrayList<String> context = new ArrayList<>();
        for(int index=0; index<jumlah;index++){
          context.add(sc.nextLine());
        }
        myMessage.setcontext(context);
        System.out.println("kata yang dicari :");
        String cari = sc.nextLine();
        System.out.println(myMessage.FindWords(context,cari));
    }
}