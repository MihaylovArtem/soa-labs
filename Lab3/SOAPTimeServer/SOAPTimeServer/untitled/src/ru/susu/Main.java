package ru.susu;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class lol{
    static int idx = 0;
    public int curr;
    public lol(){
        idx++;
        curr = idx;
    }
}
public class Main {

    public static void main(String[] args) {
        List<lol> lst = Stream.generate(lol::new)
                .limit(10).collect(Collectors.toList());
        lst.forEach((x)-> {
            System.out.println(x.curr);
        });
    }
}
