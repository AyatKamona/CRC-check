import java.util.Random;

public class CRCErrorsExperiment {

    public static void main(String[] args) {
        int totalExperiments = 50;
        String crcGenerator = "00000100110000010001110110110111";
        String specificMessage = "0101101000001011111001000010100000001111110111000101000000100110111110100111010111001101111010001111000000000000111101100011011011111101000101110010110100001010011010001001110000011110111110011100001110000101101101101010011111001100111010111110010110010100100111000000001001010110010100101110100000100111001000101001001100010001111111100001010111110011110001010100001100110110100101001001000101111011011110000000100000110000101010111001111110000110110000111010110001111111110100001010101001000111010011011011100000000100000000100101010101011100101101110001111110100110110011111101011111011101010110010001100100101000100111101010000011100011010100111001011101010010000001100111001110011110111010001100001100000011010011110010110100101101011011110111100011111110001011000000111111000101001111101111011010100101100101011000101000110010101110011010100010100101001001000110110001011100001010111001011110101111000000000010111001101110010100100011000101010110100010110101101101000010101110100011100101000010101000010101011101110101010110001010000001000011000111000100001101101010100000010100000111010011101000100110110010000010111011011011010101100000011111001110101100110010000010110111101110001110111100101000111011010110000010111100001010011011110111001000000011001010001000111111101011010000110000101000101000001101111000101010111110100010110011101110001000101011100100100010110100110100010001110000111110001100100000100101110011111011001110000001100100110100101001111100110101000011001100001111110001111010110011000010000110100001100001111001001101010011000011010010111010011100001101001100111011001011001101110111111110011011101010011011010100100110011010101101101011101110010111001001011100101110111001001000010001101000011101010100101000011100000111110010110000101111100000111011000101011110010010110000011011111010001101001000101010011111001110010100101101011111111001010010111111010110001010010001100101100000001110110011101010000100011010011111001110001101011100111111000010101111001001111101111100011100000111100111001010101000010111110011101000110011110101011101010100011010100110110111100010111011000011110000010011010001001101100001101100000100100001101000111011010010010100011100110001000010000000101100000010011010101011000000100101110101011011000111100000001101100101110010100011001000001010011101110110000011011000011100000011110100110110100101110011011111001111000010100001011100101001100001001110111001111101110000101111100101011100111010111101100111001110110110101101100100101101101100000001101100111010011001000111111101101100011101101100010001001110010000000011101001111111011000100100011001100100111110101110000001101100010011100101111011110011010100110110110101000111000011110101111101111001100101111001010010100111100010011110110001010000001010101001010110111000100010011101101011011101111111011110000001000100010011011110011100010111011110110111010101100100011001001111010110100000010110011111111111011001000101101111001110111000001001010111001111011101100010010011111010110001010111001111010110010101011101010101101011011001101000101010110110001111010010111010000000001111010001100100100111011011111000000001101110111110110010100101000000001100010111111011001101001100011011101110111100011011101011010111011111001001011101011111001111100000101110111000100111011001110110010110010100101000010110110110101100100100100001000111110100111111100000100000011011010001111011110110101011001010110001000000000100111101110001000010110100011011111110110010011110000110101110100001001111000010010100101010000010001011111010011110011010110101001101111001111010101000110001000000101011010010101011101000010001010111100011010100011110010011011101011000111010010111101110010010011010101010000000110111000110101000000001011110001100110000111100101111000100011001001011111100000001110101000110110110010000011111100100010000010100010000101010001101000001110001111110011000110001101110011001011010101000111111010010111101001110110100110000001011100100111111111111111111101011101010101000100110010100000111010000101110001010000100000010110111010011110000000111100101010000110110011000110101001011000011000010011010100110100011101100111110101011110100110001011011000111001110001110110111011010011000010111010100010111011101111000000011001110110000110011011001011011101111000101100110001100111100010110100111100100110110001011000011110110101000111100110011000100100100000100001010100101011110010111010100011011001000001100110101110111111000001111001101101100010100100110100110001110110011011101000000000011001111010110011011110010010100000101011101111100011111001110110101101100110000011110110000101101010111000110011000101011100100000100110100000100111110100011010111011110110111101010010010001110001000100010101010100110001011010000110100001000101111101100001000100010000111001000100111111010000110000000101010010010101000011110010010001000010100001010111001000001111101010100100100111000010101010001101110110100011101010100000111010001011011111100101100010110100100111101000111010001101100111110111100111111001110001001110111011100101101001000000000110110000110000110110111101010011001011101001110100110101011110110100001000111010110011100101110111111010101011000101110011101001100111111110100101010101000000101101110111011000111001111111010011110101101101001100001001101111101000010000001110000010101010110110101000111010000101001001001110101001011011101011110011110000101010001010011000111010110101101011000111110100101001110101011011010100100101101110110000111111101101000011111011101110001101000001100001110110110001110100011101101000001101000000110010010110111000011001011110000000001110010000101000101101000010100111110001101010001000101100011000110110010001111011100011100001101101001010000101111011010011101101110110000010000110011010110110000101011001000110101101100101100111000000011101110010000011101111011000111000000111101101000011000010101101110100010001111111011111010001011111011111110111011100000001111110100001011101000001101110011110001011110001100100000000110100010010110110101100001110100001011001001101100111100111111101001101100100101000001101101000000111110000101010001000001110110001111110001110110001100111000010010011011001100000100001100011111010001000100111011000000011010011111001001110000000011010101001100011001001010010100101001011100001001100101000000111111001000100100111110011111010010001101001010101000011111101100011110011110011110011001001101111111011000001001001000001001100011011111001110010011100000110101010001010111010001110100111111101110011010000010011001011100111000100000100011111111000001100110010110010000001110100011000111110101111101111001001101101001000011010000000110001001000101001101011001010110011001111111111100011110100101110100001110001001010111110110110011101010100111001010000110011110100110011001011010011011010010001011001010010110111101001000001100100111010111100101100000100000111101110111111000011011011010101101000010010100110100101110001010011110000101111000000000011100000100111010110101100111011101011111001101101110010011111001011111101101010110001111000101111100100001010000100000011001110110000010010111110101000011111111101110100101110011100010101011111010111110101111011111100000000111001111001100101101001000101000101010100011001011110101011111011011001110110110100000001011010010000100101100111000010101010100110010001101111000100101001101101100111010000011010110001110011101011111101000111110000101010111000100101110000011101000100001110010111101100011011010001011101101000100110100101101100110010100100111110110000000111100001011100100110111000010011101100110010010010110101010010110010011110011000110001111110001100000100010011011010000010100010001111110010100111100100010101011110000110110001101001000010111010101110110101111000100011011010111010001110001111001111000011001111101100001100000110011101110100111100110011100110001001011000001001011110101111000011011100010101011011010001100000101001011010110000011010010001100111011101111110010111001111010100110001110100101000111100100001011101111110000011010011010011010011100010111110001000001110100000000001001100101000101100000110110001011101111100100110000111101000111101011010000111001111111001110011001010111000100010000101101010000100111010101000001111110110111110110111001111111001110000101000011101101001101100010100011101000110000011000111011101011001001110011100011111110110010100010000111010000111011010111101001001001100010011011111010011000011011111000110110001101011011000111010111010110111011000000010010000101110111001111110001001010101001100011001000010010101000000010100111010101110011011000001000000100010100011100101011011101110110011001110110111101110110011111000000011111011001110111000010001100111011010101111101111110100110110001010011011100100001000101010010001001111100000000101111110001011111010011001001000001101010011111001101000110000111110001101000011100111101010010010111011110001111110101110001011010010000011000000111011100000111001100111000111111010101001101101100111010000001011111101000011100101100000011110011000000011011111011011100001100000111101010101110111101110011010001000010001000011011101010101011000001101001001110100011011100011011000011000010000010001110110011110110111101101010011001100100011000010011100101001000000100000011010101101011011010001001101011011010000000001100010001101001000101001001101111000101010010011110111111000111001111111011110010110001111101111000110111000010110110101001111110001110111110000011111101110011110110001000000011101001111110110000100111011010001100010000101000101011110101101010010010000011111110100001001000110001100001010000011100100111000111011111010010110100010001000111110110010011011101000101000000110101100110010111001100001011000110111000111001000111100110100011000010000010011100010111101001001011000000000101000001010111000110010111100010011110010000110101100110011001101101101001100101110111101111001111010100000110100000010000100000001001010001110010110010010010101000110000111100011110010001000010100111010001000111010111111111110101100101100111001110111100111110101111000100011000001100101011100001000010101000110000011110001001000010000110111100010000110100010011011010101010111000000101101000011000010010001100000101110101000010010010011100001100101011000110001010011101100011111000001110010010100001111010011010111011001000001111101101010101100011001000100000110100000110101001101111011111011100001001001001000110100011000101001100110110101110101101001110000000110001001001011111110000010010101111100101010110011000000110100010000110101110111000011001111110000101110010110010110010010111100010110111101111111001101110001011010011011100000111011100001110100111011001011110111111010110111101110011101101000110001111000001011000011000010110100001010110111100101001111001011110111110000010110001011111001100100001000001100000010001010101000111111110001001101010101000011111011001110000100000001111000010100100001110100010101111010000100010111111000001010100010111011100001011010111001110011110101001000100010011111101101111101101001001101011011111111000001000100010001100011111011011001001110101011111111011101001111001000100100110110100100000001111111100101011110010001000101011010011101111010000111010001111101010000100001010101111110100001100111011110010010011110000111101111111110010001110101011000101100111001110110111000001101000101001110110111000111000000110101001001100101110100000011111101100010101110000010111111001000000110011011000010001001001100011110011111000101111001000100001000010011111001011110000101101001001011011011011010110100011110011001000001110100010110110000100001001000001010010000110100101000110100100011110100011110011110010010110010111101101000000000010100111111110111111010111101011101000110010010110010111110011001100100000001100110101001100001010011110110100000100101110011100001000001111100110011100110001010111011001100100101111100000100010001101010010001111110111011100101011101101011001100100011101010101001010001001100111100101010100110010101100000111000101111010111111100010110010101011101101011011110110100000100111101010000101101011101111000001100011010010100011010100001110001011001110010010100010111001110110001011001000101000011111111100100001010110010011000100111010110101011011110010";

        System.out.println("Experiment No. | Burst Error Length | Error Detected?");
        System.out.println("-------------------------------------------------");

        CRC crc = new CRC();

        for (int experiment = 1; experiment <= totalExperiments; experiment++) {
            // Generate a random error length between 32 and 100 bits
            int errorLength = generateRandomErrorLength(32, 100);
            String receivedMessage = generateMessageWithBurstError(specificMessage, errorLength);

            // Check for errors in the received message using Assgn2 methods
            boolean errorDetected = !crc.checkCRC(receivedMessage, crcGenerator); // Invert the result
            String errorStatus;
            if (errorDetected) {
                errorStatus = "Yes";
            } else {
                errorStatus = "No";
            }
            System.out.printf("     %2d       |         %2d           |      %s      %n",
                    experiment, errorLength, errorStatus);
        }
    }

    public static int generateRandomErrorLength(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static String generateMessageWithBurstError(String message, int errorLength) {
        Random random = new Random();
        int startIndex = random.nextInt(message.length() - errorLength + 1);
        StringBuilder errorMessage = new StringBuilder(message);
        for (int i = 0; i < errorLength; i++) {
            errorMessage.setCharAt(startIndex + i, errorMessage.charAt(startIndex + i) == '0' ? '1' : '0');
        }

        return errorMessage.toString();
    }
}