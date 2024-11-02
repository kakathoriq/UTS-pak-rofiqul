package BMI;

import java.util.Scanner;


public class BMICalculator {
 
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
    float berat, tinggi, bmi, meter;
    
        System.out.println("SILAHKAN MASUKKAN BERAT BADAN & TINGGI BADAN ANDA");
        System.out.println("masukkan berat badan: ");
        berat = masukan.nextFloat();
        System.out.println("masukkan tinggi badan: ");
        tinggi = masukan.nextFloat();
        
        meter=tinggi/100;
        bmi=(berat/(meter*meter));
        
        System.out.println("______________________");
        System.out.println("BMI : "+bmi+" ");
        
    if (bmi <18.5){
    System.out.println("KURUS");    
}
    else if (bmi <=22.9){
    System.out.println("NORMAL");
}
    else if (bmi <24.9){
    System.out.println("GEMUK");
}
    else{
    System.out.println("OBESITAS");
}
    }
}

   

