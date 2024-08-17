package core.java;

public class operator {

    public static void main(String[] args) {
        int a = 15;
        int b = 5;

        System.out.println(a != b && a < b);
        System.out.println(a != b && a < b);
        System.out.println(a != b && a < b);
        System.out.println(a != b && a < b);
        System.out.println(a != b && a < b);

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a % b);
        System.out.println(a / b);

        System.out.println("This is Increment and Desrement");

        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);

        --a;
        System.out.println(a);
        a--;
        System.out.println(a);

        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);

        System.out.println("This is assignment Operator");

        a += 6;
        System.out.println(a);
        a -= 6;
        System.out.println(a);

        int m = 34;

        if (m >= 34) {
            System.out.println("pass");
        } else {
            System.out.println("failed");
        }

        int marks = 100;
        if (marks > 100) {
            System.out.println("Invalid Marks");
        } else if (marks >= 90 && marks <= 100) {
            System.out.println("A+");
        } else if (marks >= 80 && marks <= 90) {
            System.out.println("A");
        } else if (marks >= 34 && marks <= 80) {
            System.out.println("C");
        } else {
            System.out.println("Fail");
        }

        char username = 'a';
        int psd = 1232;

        if (username == 'r') {
            if (psd == 123) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Wrong Password");
            }

        } else {
            System.out.println("Invalid User");
        }

        int case1 = 5;
        int case2 = 10;
        char case3 = '+';
        switch (case3) {
            case '+':
                System.out.println(case1 + case2);
                break;
            case '-':
                System.out.println(case1 - case2);
                break;
            case '*':
                System.out.println(case1 * case2);
                break;

            default:
                System.out.println("Invalid Input");

        }

        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        int j = 10;
        while (j >= 1) {
            System.out.println(j);
            j--;
        }

        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 20);

        for (int ra = 1; ra <= 100; ra++) {
            if (ra <= 20) {
                break;
            }

            System.out.println(ra);
        }

        for (int raj = 1; raj <= 15; raj++) {
            if (raj == 9) {
                continue;
            }
            System.out.println(raj);
        }

        for (int raje = 1; raje <= 20; raje++) {
            if (raje % 2 == 0) {
                continue;
            }
            System.out.println(raje);
        }

        for (int odd = 1; odd <= 20; odd++) {
            if (odd % 2 == 1) {
                continue;
            }
            System.out.println(odd);
        }
    }

}
