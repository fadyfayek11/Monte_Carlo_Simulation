package monte_carlo_simulation;

import java.util.Random;

public class Monte_Carlo_Simulation {

    public static void main(String[] args) {
        int [] rand;
        rand=getRandomNumbers(10);
        for(int i=0;i<rand.length;i++){
            System.out.println(rand[i]);
        }
        
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
    static int [] getSimulatedDailyDemand(int [] dailyDemand,double[]Frequency,int numberOfDaysYouWantToSimulate){
        
        
        return null;
       
    }
}

