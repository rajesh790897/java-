package core.java;

/**
 *
 * @author rajes
 */
public class arraytest {
 
        public static void main(String[] args) {

         
            int[] a= new int[5];
            
            a[0] = 5; 
            a[1] = 35;
            a[2] = 13;
            a[3] = 53;
            a[4] = 59;

            
            System.out.println(a[1]);

            int size=a.length;
           
            int i;
       for(i=0;i<size;i++){
       
           System.out.println(a[i]);
       }
            
   int[] sum={5,6,28,96,1};
        
        int su;
              
        int len=sum.length;
        int total=0;
        
        for(su=0;su<len;su++){
            total +=sum[su];
        }
        
    
    
        }
