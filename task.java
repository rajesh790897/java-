
package core.java;

/**
 *
 * @author rajes
 */
public class task {
    public static void main(String[] args) {
        int[] sum = {5, 6, 28, 96, 1};
int su;

int len = sum.length;
int total = 0;

for (su = 0; su < len; su++) {
    total += sum[su];
}
        System.out.println(total);
        
        int[] onum={1,2,3,4,5,6,7,8,9};
        
        
        
       for (int raje = 1; raje <onum.length; raje++) {
            if (raje % 2 == 0) {
                continue;
            }
            System.out.println(onum[raje]);   
        }
       
       
              int[] myArray = {1, 5, 9, 4, 3};

        int p = 1;
       
        int summ = 0;
        for (int i = 0; i < myArray.length; i++) {
            summ += myArray[i]*2;
        }

        System.out.println(+ p);
        System.out.println(+ summ);
    }
}

       
       
    
