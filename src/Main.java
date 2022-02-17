import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>();
        int[] list = {3, 3,3,5, 2, 5, 2, 6, 2,0 ,0};
        System.out.println(Arrays.toString(list));
        for (int i = 0; i < list.length; i++) {
            if(i==0){
                numbers.add(list[i]);
                int freq=getFrequency(list,list[i]);
                System.out.println(list[i]+ " sayısı " + freq + " kere tekrar etti.");
            }
            else {
                boolean is=false;
                for (int j = 0; j < numbers.size(); j++) {
                    if(list[i]==numbers.get(j)){
                        is=true;
                    }
                }
                if(!is){
                    numbers.add(list[i]);
                    int freq=getFrequency(list,list[i]);
                    System.out.println(list[i]+ " sayısı " + freq + " kere tekrar etti.");
                }
            }

        }
    }
    public static int getFrequency(int[] array,int number){
        int count=0;
        for (int x:array){
            if(x==number){
                count++;
            }
        }
        return count;
    }
}
