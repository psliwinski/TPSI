/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Arrays;

/**
 *
 * @author Student
 */
enum GatunekPiwa {
    LAGER, PILZNER, PORTER, STOUT, PIWO_Z_BIEDRONKI
}

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Zadanie 1");
        int liczbyC[] = new int[6];
        for (int i = 0; i < 6; i++) {
            liczbyC[i] = (int) (Math.floor(Math.random() * 49 + 1));
        }
        Arrays.sort(liczbyC);
        String sC = Arrays.toString(liczbyC);
        System.out.println(sC);
        System.out.println("\nZadanie 2");
        Integer duzyInt[] = new Integer[6];
        for (int i = 0; i < 6; i++) {
            duzyInt[i] = (int) (Math.floor(Math.random() * 49 + 1));
        }
        Arrays.sort(duzyInt);
        String sduzyInt = Arrays.toString(duzyInt);
        System.out.println(sduzyInt);
        System.out.println("\nZadanie 3");
        int losowe[] = new int[3];
        for (int i = 0; i < 3; i++) {
            losowe[i] = (int) (Math.floor(Math.random() * 5));
        }
        GatunekPiwa[] gatunki = GatunekPiwa.values();

        for (int i = 0; i < 3; i++) {
            System.out.println(gatunki[losowe[i]]);
            switch (gatunki[losowe[i]]) {
                case LAGER:
                case PILZNER:
                    System.out.println("- piwo jasne");
                    break;
                case PORTER:
                case STOUT:
                    System.out.println("- piwo ciemne");
                    break;
                case PIWO_Z_BIEDRONKI:
                    System.out.println("- piwo tanie");
                    break;
            }
        }
    }
}
