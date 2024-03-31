//  Write a java program to demonstrate various:
//  (a) Operators 
//  (b) control statements. 

package JavaPracticals;
public class Prac02 {
	public static void main(String[] args) {
	// Arithmetic operators
        int a = 10;
        int b = 5;
        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        int quot = a / b;
        int mod = a % b;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);        
        System.out.println("sum = " + sum);
        System.out.println("diff = " + diff);
        System.out.println("prod = " + prod);
        System.out.println("quot = " + quot);
        System.out.println("mod = " + mod);

        // Relational operators
        boolean result;
        result = a > b;
        System.out.println("a > b: " + result);        
        result = a < b;
        System.out.println("a < b: " + result);
        result = a >= b;
        System.out.println("a >= b: " + result);
        result = a <= b; 
        System.out.println("a <= b: " + result);
        result = a == b;
        System.out.println("a == b: " + result);
        result = a != b;
        System.out.println("a != b: " + result);

        // Logical operators
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!(x && y): " + !(x && y));

        // Increment and decrement operators
        int i = 5;
        System.out.println("i++: " + i++); // Postfix increment
        System.out.println("++i: " + ++i); // Prefix increment        
        System.out.println("i--: " + i--); // Postfix decrement
        System.out.println("--i: " + --i); // Prefix decrement

        // Control statements
        
        // if-else
        int j = 15;
        if(j > 10) {
            System.out.println("j is greater than 10");
        } else {
            System.out.println("j is less than or equal to 10"); 
        }

        // switch
        int k = 2;
        switch(k) {
            case 1: 
                System.out.println("Value is 1");
                break;
            case 2: 
                System.out.println("Value is 2");
                break;
            default: 
                System.out.println("Value is neither 1 nor 2");
        }

        // for loop
        for(int index = 0; index < 5; index++) {
            System.out.println("Index: " + index);
        }
        
        // while loop
        int count = 0;
        while(count < 3) {
            System.out.println("Count: " + count);
            count++;
        }

        // do-while loop
        int num = 10;
        do {
            System.out.println("Number: " + num);
            num++; 
        } while(num < 15);

	}
}
