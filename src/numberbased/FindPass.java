package numberbased;

import java.util.*;
public class FindPass {
   public static int generatePassword(){
        int input1 =12,input2 = 1313,input3 = 122,input4 = 678,input5 = 898;
        int[] arr = {input1, input2, input3, input4, input5};
        int scount =0;
        int unscount =0;
        for(int num : arr){
            if(isStable(num)){
                scount++;
            }
            else{
                unscount++;
            }
        }
        return (unscount*10)+scount;
    }
    public static boolean isStable(int num){
       String Snum = String.valueOf(num);
       Map<Character,Integer> map = new HashMap<>();
       for(char ch : Snum.toCharArray()){
           map.put(ch,map.getOrDefault(ch,0)+1);
       }
       Set<Integer> set = new HashSet<>(map.values());
       return set.size() == 1;
    }
    public static void main(String args[]){
        int result = generatePassword();
        System.out.println(result);
    }
}
