import java.util.*;
import java.lang.Math;

class PythagoreanTriplet{
    int a, b, c;
    PythagoreanTriplet() { }
    PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean equals(Object obj1) {
        PythagoreanTriplet temp = (PythagoreanTriplet)obj1;
        return (this.a == temp.a && this.b == temp.b && this.c == temp.c);
    }
    
    static PythagoreanTriplet obj = new PythagoreanTriplet();
    static List<PythagoreanTriplet> res;
    
    static PythagoreanTriplet makeTripletsList() {
        res = new ArrayList<PythagoreanTriplet>();
        return obj;
    }

    static PythagoreanTriplet withFactorsLessThanOrEqualTo(int n) {
        int x, y, z;
        for(x = 1; x < n; x++) {
            for(y = x+1; y < n; y++) {
                int cSquare = (x*x) + (y*y);
                z = (int)Math.sqrt(cSquare);
                if(z < n && (Math.sqrt(cSquare) == z)) {
                    res.add(new PythagoreanTriplet(x, y, z));
                    System.out.println(x + " " + y + " " + z + " entered");
                }
            }
        }
        return obj;
    }

    static PythagoreanTriplet thatSumTo(int n) {
        for(int i=0; i<res.size(); ) {
            PythagoreanTriplet temp = res.get(i);
            System.out.println(temp.a + " " + temp.b + " " + temp.c + " fetched");
            int totalVal = temp.a + temp.b + temp.c;
            if(totalVal != n) {
                res.remove(i);
                System.out.println(temp.a + " " + temp.b + " " + temp.c + " removed");
            } 
            else {
                i++;
            }
        }
        return obj;
    }

    static List<PythagoreanTriplet> build() {
        return res;
    }
    
}