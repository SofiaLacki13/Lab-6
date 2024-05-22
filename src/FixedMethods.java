public class FixedMethods {

    //Mystery method uses b as a counter for how many times it 
    //will add the original value of a to itself. a is what is being added,
    //while b it how many of a is in the final value. Essentially, the program is b * a
    public int mystery(int a, int b) {
        if (b == 1) {
            return a;
        }
        else {
            return a + mystery(a, b - 1);
        }
    }

    //In the sum method, the issue was that n was not changing. So
    //if n was not 0, the program would cause an infinite loop.
    public int sum(int n) { 
        if (n == 0) {            
            return 0;          
        }         
        else {    
            return n + sum(n - 1);   
        }   
    }
}
