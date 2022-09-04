import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);
    String s= sc.nextLine();
    char p1= s.charAt(0);
    char p2=s.charAt(2);

if(p1=='R' || p2=='R'){
    System.out.println("R");
}
else if(p1=='J' || p2=='J'){
    if(p1=='J'){
        System.out.println(p2);
    }
    else if(p2=='J'){
        System.out.println(p1);
    }
}
else{
    System.out.println("D");
}
    }
}