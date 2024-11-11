package it.viligiardi;

public class Operation {

    public String trasMaiuscolo(String s) {
        return s.toUpperCase();
    }

    public String trasMinuscolo(String s) {
        return s.toLowerCase();
    }

    public String ribalta(String s) {
        String reversedStr = "";

        for (int i = 0; i < s.length(); i++) {
            reversedStr = s.charAt(i) + reversedStr;
        }
        return reversedStr;
    }

    public int contaCaratteri(String s) {
        return s.length();
    }

    public String scelta(int i, String s) {
        switch (i) {
            case 1:
                String out1 = trasMaiuscolo(s);
                System.out.println("La Stringa da inviare è: " + out1);
                return out1;

            case 2:
                String out2 = trasMinuscolo(s);
                System.out.println("La Stringa da inviare è: " + out2);
                return out2;

            case 3:
                String out3 = ribalta(s);
                System.out.println("La Stringa da inviare è: " + out3);
                return out3;

            case 4:
                int out4 = contaCaratteri(s);
                System.out.println("Il numero da inviare è: " + out4);
                return String.valueOf(out4);

            default:
                return "";  
        }
    }
}