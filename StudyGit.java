
public class StudyGit {
    public static void main (String[] args) {
        int year = 2008;
        System.out.println(year(year));

    }
    public static String year (int year) {
        if (year % 400 == 0 || year % 4 == 0) {
            return "Год високосный";
        } else if (year % 100 == 0) {
            return "Год невисокосный";
        }
        return "Год невисокосный";
    }
}

