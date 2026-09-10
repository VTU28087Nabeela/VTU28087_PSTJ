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


    public static int birthday(List<Integer> s, int d, int m) {
    int count = 0;
    for(int i =0; i<= s.size()-m;i++ ){
        int sum = 0;
        for(int j =i;j<i+m;j++){
            sum+= s.get(j);
        }
        if(sum==d){
            count++;
        }
    }
    return count;

    }

}
