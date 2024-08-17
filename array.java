package core.java;

/**
 *
 * @author rajes
 */
public class array {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 5;
        a[1] = 15;
        a[2] = 7;
        a[3] = 4;

        System.out.println(a[0]);
        System.out.println(a[0] + a[3]);

        String[] city = {"Rajnagar", "Suri", "Asansol", "Durgapur", "Kolkata", "Delhi"};

//        int size = city.length;
//        for (int i = 0; i < size; i++) {
//            System.out.println(city[i]);
//        }

// this is for each loop
        for (String r : city) {
            System.out.println(r);
        }

        
        int[] m={5,2,5,25,2};
        
        int total=0;
        int size=m.length;
        for(int j=0;j<size;j++){
            total +=m[j];
        }
        System.out.println(total);
        
        for(int k:m){
        total+=k;
        }
        System.out.println(total);
        
      
        
        }
    

    
    
       
    }
