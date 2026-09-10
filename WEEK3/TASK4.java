import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {


    public static List<Integer> maxSubarray(List<Integer> arr) {
    // Write your code here
    int current = arr.get(0);
    int maxSubarray=arr.get(0);
    
    int maxSubsequence =0;
    int largest = arr.get(0);
    
    for(int i =0;i<arr.size();i++){
        if(i>0){
            current = Math.max(arr.get(i), current+arr.get(i));
            maxSubarray = Math.max(maxSubarray,current);
        }
        
        if(arr.get(i)>0){
            maxSubsequence +=arr.get(i);
        }
        
        largest =Math.max(largest,arr.get(i));
    }
    if(maxSubsequence==0){
        maxSubsequence=largest;
    }
    List<Integer> result = new ArrayList<>();
    result.add(maxSubarray);
    result.add(maxSubsequence);
    
    return result;
    

    }

}
