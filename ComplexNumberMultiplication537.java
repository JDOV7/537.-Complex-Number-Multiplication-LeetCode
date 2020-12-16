package leetcode;

public class ComplexNumberMultiplication537 {

    public void ComplexNumberMultiplication537() {
        String a = "1+-1i", b = "1+-1i";
        int iFirstBeginElement = Integer.parseInt(a.substring(0, a.indexOf("+")));
        int iFirstSecondElement = Integer.parseInt(b.substring(0, b.indexOf("+")));
        int iSecondBeginElement = Integer.parseInt(a.substring(a.indexOf("+") + 1, a.indexOf("i")));
        int iSecondSecondElement = Integer.parseInt(b.substring(b.indexOf("+") + 1, b.indexOf("i")));
        System.out.println(((iFirstBeginElement * iFirstSecondElement) + (iSecondBeginElement * iSecondSecondElement * -1))
                + "+" + (((iFirstBeginElement * iSecondSecondElement)) + (iSecondBeginElement * iFirstSecondElement)) + "i");

    }
}
