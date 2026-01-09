package Actividad1;

public class UsoWrapper {
    public static int charToInt(char caracter){
        switch (caracter){
            case '0': return 0;
            case '1': return 1;
            case '2': return 2;
            case '3': return 3;
            case '4': return 4;
            case '5': return 5;
            case '6': return 6;
            case '7': return 7;
            case '8': return 8;
            case '9': return 9;
            default: return -1;
        }
    }

    public static int toInt(String num) {
        int currentNum = 0;
        int cifra = 0;
        for (int i = 0; i < num.length(); i++) {
            if (charToInt(num.charAt(i)) != -1) {
                cifra = charToInt(num.charAt(i));
                currentNum = cifra + (currentNum * 10);
            }
        }
        return currentNum;
    }
}
