import java.util.Scanner;

public class CRC {
    // CRC Encoder
    public static String encodeCRC(String message, String generator) {
        int generatorLength = generator.length();
        StringBuilder transmittedMessage = new StringBuilder(message);

        for (int i = 0; i < generatorLength - 1; i++) {
            transmittedMessage.append('0');
        }

        for (int i = 0; i < message.length(); i++) {
            if (transmittedMessage.charAt(i) == '1') {
                for (int j = 0; j < generatorLength; j++) {
                    transmittedMessage.setCharAt(i + j,
                            (transmittedMessage.charAt(i + j) == generator.charAt(j)) ? '0' : '1');
                }
            }
        }

        // Append the CRC remainder to the original message
        String crcRemainder = transmittedMessage.substring(message.length());
        return message + crcRemainder;
    }

    // CRC Decoder (Error Checking)
    public static boolean checkCRC(String receivedMessage, String generator) {
        int generatorLength = generator.length();

        // Extract the original message part from the received message
        String originalMessage = receivedMessage.substring(0, receivedMessage.length() - (generatorLength - 1));

        // Calculate the CRC remainder for the received message
        String calculatedCRC = encodeCRC(originalMessage, generator).substring(originalMessage.length());

        // Compare the calculated CRC with the remainder part of the received message
        String receivedCRC = receivedMessage.substring(originalMessage.length());

        // If the two remainders match, there are no errors
        return calculatedCRC.equals(receivedCRC);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the message (in binary): ");
        String message = scanner.nextLine();
        System.out.print("Enter the generator polynomial (in binary): ");
        String generator = scanner.nextLine();

        // Make sure the message is at least as long as the generator
        if (message.length() < generator.length() - 1) {
            System.out.println("The message should be longer or equal to the generator length.");
            scanner.close();
            return;
        }

        String transmittedMessage = encodeCRC(message, generator);
        System.out.println("Transmitted Message: " + transmittedMessage);

        System.out.print("Enter the received message (in binary, without CRC remainder): ");
        String receivedMessage = scanner.nextLine();

        // To check for errors, we will re-add the CRC remainder to the received message
        receivedMessage = receivedMessage + transmittedMessage.substring(receivedMessage.length());

        if (checkCRC(receivedMessage, generator)) {
            System.out.println("No errors in the received message.");
        } else {
            System.out.println("Error detected in the received message.");
        }

        scanner.close();
    }
}