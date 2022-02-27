import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class BackJoon2750 {

    public static void main(String args[]) throws Exception{

        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> tree = new TreeSet<Integer>();
        int count = scanner.nextInt();

        for(int i = 0; i < count ; i++) {
            tree.add(scanner.nextInt());
        }

        Iterator<Integer> test = tree.iterator();
        for(int j = 0 ; j < tree.size() ; j++ ){
            System.out.println(test.next());
        }


        scanner.close();
    }

}
