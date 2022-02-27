import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.TreeSet;

public class BackJoon2751 {

    public static void main(String args[]) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        TreeSet<Integer> tree = new TreeSet<Integer>();
        int count = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < count ; i++) {
            tree.add(Integer.parseInt(br.readLine()));
        }

        Iterator<Integer> test = tree.iterator();
        for(int j = 0 ; j < tree.size() ; j++ ){
            sb.append(test.next() + "\n");
        }
        System.out.println(sb.toString());

        br.close();
    }

}
