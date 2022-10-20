import java.util.*;

public class RemoveDuplicateWord {
    public static void main(String[] args){
//        String str= "I am am Shubham Bharti ";
//        String[] inputStr= str.split(" ");
//        Set<String> listStr= new LinkedHashSet<String>();
//       for(String x: inputStr){
//           listStr.add(x);
//       }
//        Iterator itr = listStr.iterator();
//       while(itr.hasNext()){
//           System.out.print(itr.next() + " ");
//       }
        String str ="Hello Shubham Shubham ";
        Set<String> list = new HashSet<String>();
        list.addAll(Arrays.asList(str.split(" ")));
        System.out.print(list);

    }
}
