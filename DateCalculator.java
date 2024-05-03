public class DateCalculator {

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
    }

    public static int daysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                throw new IllegalArgumentException("Tháng không hợp lệ: " + month);
        }
    }

    public static int[] nextDay(int day, int month, int year) {
        int daysInMonth = daysInMonth(month, year);
        if (day < 1 || day > daysInMonth) {
            throw new IllegalArgumentException("Ngày không hợp lệ: " + day);
        }
        
        if (day == daysInMonth) {
            if (month == 12) {
                day = 1;
                month = 1;
                year += 1;
            } else {
                day = 1;
                month += 1;
            }
        } else {
            day += 1;
        }

        return new int[] {day, month, year};
    }

    public static void main(String[] args) {
        // Thay đổi các giá trị d, m, y để kiểm tra với các ngày khác nhau
        int d = 31;
        int m = 12;
        int y = 2020;
        int[] nextDay = nextDay(d, m, y);
        System.out.printf("Ngày tiếp theo là: %d/%d/%d\n", nextDay[0], nextDay[1], nextDay[2]);
    }
}
