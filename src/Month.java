import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int NumberOfDaysInMonth=0;
        String MonthName="unknown";
        System.out.println("Input a month number:");
        int month=sc.nextInt();
        System.out.println("Input a year:");
        int year=sc.nextInt();
        switch (month){
            case 1:
            MonthName="january";
            NumberOfDaysInMonth=31;
            break;
            case 2:
                MonthName="february";
                if ((year%400==0)||((year%4==0)&&(year%100!=0))) {
                    NumberOfDaysInMonth = 29;
                }else {
                    NumberOfDaysInMonth = 28;
                }
                    break;
            case 3:
                MonthName="march";
                NumberOfDaysInMonth=31;
                break;
            case 4:
                MonthName="april";
                NumberOfDaysInMonth=30;
                break;
            case 5:
                MonthName="may";
                NumberOfDaysInMonth=31;
                break;
            case 6:
                MonthName="june";
                NumberOfDaysInMonth=30;
                break;
            case 7:
                MonthName="july";
                NumberOfDaysInMonth=31;
                break;
            case 8:
                MonthName="august";
                NumberOfDaysInMonth=31;
                break;
            case 9:
                MonthName="september";
                NumberOfDaysInMonth=30;
                break;
            case 10:
                MonthName="october";
                NumberOfDaysInMonth=31;
                break;
            case 11:
                MonthName="november";
                NumberOfDaysInMonth=30;
                break;
            case 12:
                MonthName="december";
                NumberOfDaysInMonth=31;
        }
        System.out.print(MonthName+""+year+"has"+NumberOfDaysInMonth+"days");
        }
    }

