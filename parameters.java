
package Linkedin;


public class parameters {
    
    public static void calculater(double book,double tipsRate,double taxsRate){
        double tip= tipsRate * book;
        double tax = taxsRate * book;
        double res=book+ tip+tax;
        System.out.println("your Book Price is" + res);
        
        
    }
    
    
   
    public static double calculateTotal(double carPrice, double carTipRate, double carTaxRate) {
        double carTip = carTipRate * carPrice;
        double carTax = carTaxRate * carPrice; 
        double result = carPrice + carTip + carTax;
        return result;
    
    }
    public static void main(String[] args) {
        
        calculater(100,.0,.18);
        System.out.println(calculateTotal(55.55,8.2,89.2));
        
        }   
    }
