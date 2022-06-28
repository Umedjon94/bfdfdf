package uz.Gita;

import java.util.Scanner;

/*
*@created: Umarov Umedjon
*Bugungi kun: 16.06.2022   Xozirgi vaqt: 23:52
*@company: Gita IT Academy
@pacege Name: TanlanganMasalalarniQayta ishlash
*/
public class Exam1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        System.out.print("A: "); a = in.nextInt();
        System.out.print("B: "); b = in.nextInt();
        System.out.print("C: "); c = in.nextInt();
        int min;
        if (a <= b){
            min = a;
        }else {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        int min2 = a <= b ? a : b;
        min2 = min2 >= c ? c : min2;
        System.out.println(min2);

    }
}
