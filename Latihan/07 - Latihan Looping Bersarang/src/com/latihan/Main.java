package com.latihan;

public class Main {
    public static void main(String[] args) {
        // Latihan looping bersarang

//        for(int i = 0; i < 5; i++){
//            for(int j = 0; j < 5; j++){
//                System.out.print("X ");
//            }
//            System.out.print("\n");
//        }

//        System.out.print("\n");
//        for(int i = 0; i < 5; i++){
//            for(int j = 0; j < 5; j++){
//                System.out.print("X ");
//                if(i==j){
//                    break;
//                }
//            }
//            System.out.print("\n");
//        }

//        System.out.print("\n");
//        for(int i = 0; i < 5; i++){
//            for(int j = 0; j < 5; j++){
//                System.out.print("X ");
//                if((i+j)==4){
//                    break;
//                }
//            }
//            System.out.print("\n");
//        }

//        System.out.print("\n");
//        for(int i = 0; i < 9; i++){
//            for(int j = 0; j < 9; j++){
//                System.out.print("X ");
//                if(i==j){
//                    break;
//                } else if((i+j)==8){
//                    break;
//                }
//            }
//            System.out.print("\n");
//        }

        System.out.print("\n");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("X ");
                if(i==j){
                    for(int k = 5; k > 5; k--){
                        System.out.print("O ");
                }
            }
            System.out.print("\n");
        }

    }
}