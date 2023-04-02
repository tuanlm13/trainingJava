public class toanTuBaNgoi {
    public static void main(String[] args) {
        int a=4;
        int b=5;
//        <biểu thức điều kiện> ? <giá trị nếu true> : <giá trị nếu false>

        Boolean result=(a>b)? true : false;
        System.out.println(result);
        int dayOfWeek = 78;
        String dayName;

        switch (dayOfWeek) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            case 77:
                dayName = "7777777";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("Today is " + dayName);

    }
}
