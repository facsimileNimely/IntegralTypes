package primitives;

public class IntegerClasses {
    public static void main(String[] args) {
        assignBinary();
    }

    public static void assignBinary(){
        // integral types
        // a bit holds 8 bits
        byte byteOne = 0b0101_1111;
        System.out.println(byteOne);

        // 16 bits in a short
        short shortOne = 0b0111_0000_1010;
        System.out.println(shortOne);

        // 32 bits in an int
        int intOne = 0b0101;
        System.out.println(intOne);

        // 64 bit in a long
        long longOne = 50_000_000_000L;
        System.out.println(longOne);

        // how many bits in a long?
        System.out.println("Number of bits in a long " + Long.SIZE);
        System.out.println("Min: " + Long.MIN_VALUE);
        System.out.println("Max: " + Long.MAX_VALUE);

        System.out.println(decimalToBinary(25));
    }

    public static void assignHex(){
        // integral types
        // a bit holds 8 bits
        byte byteOne = 0x2A;
        System.out.println("Decimal value: " + byteOne);

        // int. long has a toBinaryString() static method in their classes
        // delcare a short and assign a hex value to it
        short num = 0x2FFF;


        // print out the decimal value
        System.out.println("Decimal Value: " + num);

        // 32 bits every 4 bits represents one hex digit (0 - F)
        int num2 = 0x206A_FFFF;
        System.out.println("Binary value: " + Integer.toBinaryString(num2));
        System.out.println("Decimal value: " + num2);
    }

    public static String decimalToBinary(int decimal){
        String toReturn = "";
        while (decimal > 0){
            toReturn =  decimal % 2 + toReturn;
            decimal = decimal / 2;
        }
        return toReturn;
    }
}
