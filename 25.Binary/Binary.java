public class Binary{
    static String decimalToBinary(int decimal) {
        if (decimal == 0) return "0";
        
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal /= 2;
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        int decimalNumber = 13; // Example decimal number
        String binaryString = decimalToBinary(decimalNumber);
        System.out.println("Decimal: " + decimalNumber + " -> Binary: " + binaryString);
    }
}