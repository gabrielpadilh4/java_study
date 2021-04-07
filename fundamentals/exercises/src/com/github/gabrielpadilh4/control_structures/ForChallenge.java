package com.github.gabrielpadilh4.control_structures;

public class ForChallenge {

    // Print the result below using FOR without numeric values
    /*
    #
    ##
    ###
    ####
    #####
     */

    public static void main(String[] args) {

        for (String v = "#"; !v.equals("#####"); v += "#") {
            System.out.println(v);
        }

    }
}
