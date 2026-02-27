package Exercise_7;

public class MathDemo {

    // If the methods were static, there would not be a need to create an instance to use the methods.
    // MathDemo.max() and other methods could be called from class itself.

    int min(int a, int b){
        return Math.min(a,b);
    }

    int max(int a, int b){
        return Math.max(a,b);
    }

    int sum(int[] args){
        int sum = 0;
        for(int a : args){
            sum += a;
        }
        return sum;
    }

    float mean(int[] args){
        int sum = sum(args);
        return (float) sum/args.length;
    }

    int factorial(int n){
        if(n == 0) return 1;
        int h = 1;
        for(int i = 1; i <= n; i++){
            h *= i;
        }
        return h;
    }

}

