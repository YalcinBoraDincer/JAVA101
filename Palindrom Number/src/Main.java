public class Main {

    static boolean isPalindrom(int num) {

        int temp = num, lasTnumber, reversenumber = 0;

        while (temp != 0) {
            lasTnumber = temp % 10;

            reversenumber = (reversenumber * 10) + lasTnumber;

            temp /= 10;
        }
        if (num==reversenumber) {
            return true;

        } else {
            return false;
        }


    }


    public static void main(String[] args) {
        System.out.println(isPalindrom(2323));


    }
}
