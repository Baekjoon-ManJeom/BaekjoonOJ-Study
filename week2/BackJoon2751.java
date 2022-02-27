import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.TreeSet;

public class BackJoon2751 {

    public static void main(String args[]) throws  Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        int number = 0;


        TreeSet<Integer> tree1 = new TreeSet<Integer>();
        TreeSet<Integer> tree2 = new TreeSet<Integer>();
        TreeSet<Integer> tree3 = new TreeSet<Integer>();
        TreeSet<Integer> tree4 = new TreeSet<Integer>();
        TreeSet<Integer> tree5 = new TreeSet<Integer>();

        for(int i = 0 ; i<count ; i++){
            number = Integer.parseInt(br.readLine());
            if(number <= 200000){
                tree1.add(number);
            }else if ( 200000 < number && number <= 400000 ){
                tree2.add(number);
            }else if ( 400000 < number && number <= 600000 ){
                tree3.add(number);
            }else if ( 600000 < number && number <= 800000 ){
                tree4.add(number);
            }else if ( 800000 < number && number <= 1000000 ){
                tree5.add(number);
            }

            Iterator<Integer> it1 = tree1.iterator();
            Iterator<Integer> it2 = tree1.iterator();
            Iterator<Integer> it3 = tree1.iterator();
            Iterator<Integer> it4 = tree1.iterator();
            Iterator<Integer> it5 = tree1.iterator();

            while (it1.hasNext()){
                System.out.println(it1.next());
            }
            while (it2.hasNext()){
                System.out.println(it2.next());
            }
            while (it3.hasNext()){
                System.out.println(it3.next());
            }
            while (it4.hasNext()){
                System.out.println(it4.next());
            }
            while (it5.hasNext()){
                System.out.println(it5.next());
            }

        }


    }
}
