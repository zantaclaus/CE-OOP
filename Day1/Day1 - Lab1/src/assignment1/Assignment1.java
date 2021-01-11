
package assignment1;

public class Assignment1 {

    public static void main(String[] args) {
        final int DAY = 365;
        final int HOUR = 24;
        final int MIN = 60;
        final int SEC = 60;
        final int time = DAY * HOUR * MIN * SEC;
        
        int population = 312_032_486;
        int birth = time / 7;
        int death = time / 13;
        int immigrant = time / 45;
        
        for(int Year = 1; Year <= 5; Year++)
        {   
            population = population + birth - death + immigrant;
            System.out.println("Population in year " + Year + " : " + population );
        }
    }
    
}
