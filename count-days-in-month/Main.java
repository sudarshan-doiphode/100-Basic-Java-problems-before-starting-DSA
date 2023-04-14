public class Main {

    static int numberOfDays(int year, int month) {
        int days = 0;
        int result = 0;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            days = 29;
        else
            days = 28;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = 31;
                break;

            case 2:
                result = days;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                days = 31;
                break;
            default:
                System.out.println("Entered Wrong Month");
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Days In Month are :"+numberOfDays(2012, 13));
    }

}
