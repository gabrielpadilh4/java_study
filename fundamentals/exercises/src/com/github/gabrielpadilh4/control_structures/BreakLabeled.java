package com.github.gabrielpadilh4.control_structures;

public class BreakLabeled {

    public static void main(String[] args) {

        external: for(int i = 0; i<3;i++) {
            internal: for (int j = 0; j < 3; j++) {
                if(i == 1){
                    // break; exit of what is in the scope
                    break external; // exits the external labeled for
                }

                System.out.printf("%d %d", i, j);
            }

            System.out.println();
        }
    }
}
