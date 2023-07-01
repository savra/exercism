package com.hvdbs.savra.exercism.java.reversestring;

class ReverseString {

    String reverse(String inputString) {
        StringBuilder sb = new StringBuilder(inputString);

        return sb.reverse().toString();
    }
  
}
