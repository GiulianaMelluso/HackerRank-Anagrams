package solution;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
        
public class Solution {
    
    public String[]aryA ;
    public String[]aryB ;

public static boolean isAnagram(String a, String b) {
        
        String aLowerCase = a.toLowerCase();
        String bLowerCase = b.toLowerCase();
     
        String[]aryA = aLowerCase.split("");
        String[]aryB = bLowerCase.split("");

        Map<String, Integer> anagramA = new HashMap<>();
        Map<String, Integer> anagramB = new HashMap<>();

        
        boolean ret = false;
        
        
        if(aryA.length==aryB.length){
           
            for (int i=0; i<=aryA.length-1; i++){
                
                String Letter;
                Letter = aryA[i];
                
                if (anagramA.containsKey(Letter)) {
                    int countA = anagramA.get(Letter);
                    anagramA.put(Letter, ++countA);
                    
                }
                else{
                    
                    anagramA.put(Letter, 1);
                    
                }
            }
                for (int j=0; j<=aryA.length-1; j++){
                
                String Letter;
                Letter = aryB[j];
                
                if (anagramB.containsKey(Letter)) {
                    int countB = anagramB.get(Letter);
                    anagramB.put(Letter, ++countB);
               
                }
                else{
                    anagramB.put(Letter, 1);
                }
            
            }
            for (int i=0; i<=aryB.length-1; i++){
                String Letter;
                Letter = aryB[i];
                
                if(Objects.equals(anagramA.get(Letter), anagramB.get(Letter))){
                    
                    ret = true;
                    
                }
                else{
                    ret = false;
                    break;
                }    
            }    
        }
        else{
            ret = false;
        }
       
        return ret;
    }
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    
    
}
