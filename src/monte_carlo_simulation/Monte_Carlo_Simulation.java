package monte_carlo_simulation;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Monte_Carlo_Simulation {

    public static void main(String[] args) {
       /* int [] rand;
        rand=getRandomNumbers(10);
        for(int i=0;i<rand.length;i++){
            System.out.println(rand[i]);
        }*/
       MonteGui face=new MonteGui();
       face.setVisible(true);
       face.setResizable(false);
       
       face.setDefaultCloseOperation(EXIT_ON_CLOSE); 
       face.setLocationRelativeTo(null);
       /*
       int Frequency[]={10,20,40,60,40,30};
       int dailyD[]={0,1,2,3,4,5};
       int numberofdayes=10;
        ArrayList<Integer>inv=getSimulatedDailyDemand(dailyD,Frequency,numberofdayes);
        System.out.println("Interval"+inv);
        System.out.println("avg:"+avrge(inv));
        System.out.println("expected:"+EXpected(dailyD,Frequency));
        */
    }
    static double[] getProbability(int Frequency[]){
        double sum=0.0 ;
        double [] probability=new double[Frequency.length];
        for(int i=0;i<Frequency.length;i++){
            sum+=Frequency[i] ;
        }
        for(int i=0;i<Frequency.length;i++){
            probability[i]=(Frequency[i]/sum) ;
        }
        return probability;
    }
    static double[] getCumulative(int Frequency[]){
        double sum=0.0 ;
        double [] prob=getProbability(Frequency) ;
        double [] cum=new double[prob.length];
        for(int i=0;i<prob.length;i++){
            sum+=prob[i];
            cum[i]=sum;
        }
        return cum;
    }
    static int [] getRandomNumbers(int numberOfDaysYouWantToSimulate){
        int []rand=new int [numberOfDaysYouWantToSimulate];
        Random r=new Random() ;
        for(int i=0;i<rand.length;i++){
            rand[i]=(r.nextInt(99))+1;
        }
        return rand ;
    }
    static ArrayList<Integer> getSimulatedDailyDemand(int [] dailyDemand,int[]Frequency,int numberOfDaysYouWantToSimulate){
        ArrayList<Integer> Interval = new ArrayList<Integer>();
        double Freq[]=getCumulative(Frequency);
        //int[]RN=getRandomNumbers(numberOfDaysYouWantToSimulate);
        int []RN=getRandomNumbers(numberOfDaysYouWantToSimulate);
       
         for (int i = 0; i < RN.length; i++) {
             int number1=RN[i];
             for (int j = 0; j < Freq.length; j++) {
                 if(1<=number1&&number1<=(int)(100*Freq[0]))
                 {
                     int interval=dailyDemand[0];
                     Interval.add(interval);
                     break;
                 }
                 else if ((int)(100*Freq[j])<=number1&&number1<=(int)(100*Freq[j+1]))
                 {
                     int interval=dailyDemand[j+1];
                     Interval.add(interval);

                 }
             }
         }
         return Interval;
    }
    static double avrge(ArrayList<Integer> interval)
    {
        double avg=0.0;
        double sum=0.0;
        for(int i=0;i<interval.size();i++)
        {
            sum+=interval.get(i);
        }
        avg=sum/interval.size();
        return avg;
    }
    static double EXpected(int []da,int []freq)
    {
        double Freq[]=getProbability(freq);
        double sum=0.0;
        for (int i = 0; i < Freq.length; i++) {
            sum+=Freq[i]*da[i];
        }
    
    return sum;
    }
    public static int[] convertIntegers(ArrayList<Integer> integers)
{
    int[] ret = new int[integers.size()];
    for (int i=0; i < ret.length; i++)
    {
        ret[i] = integers.get(i).intValue();
    }
    return ret;
}
}

