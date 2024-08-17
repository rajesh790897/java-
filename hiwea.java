/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rajesh.gaming;

import java.util.Scanner;

public class ArrayEqualization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        int target = -1;
        int totalSteps = 0;
        boolean possible = true;

        for (int i = 0; i < n; i++) {
            if (a[i] < b[i]) { // Impossible to make all equal
                possible = false;
                break; // Exit loop early if impossible
            }

            int diff = a[i] - b[i];

            if (target == -1) { // Set the first valid target value
                target = diff;
            } else if (diff != target) { // Check if target is consistent
                possible = false;
                break; // Exit loop early if impossible
            }

            totalSteps += b[i];
        }

        if (possible) {
            System.out.println(totalSteps);
        } else {
            System.out.println(-1);
        }
    }
}
