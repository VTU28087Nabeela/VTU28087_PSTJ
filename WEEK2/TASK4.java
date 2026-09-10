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
import java.time.*;


class Result {

    public static String findDay(int month, int day, int year){
        
        
        LocalDate date = LocalDate.of(year , month , day);
        return date.getDayOfWeek().toString();
    }
}
