class RegistrationGenerator {
    private static final String ALPHABETS = "abcdefghijklmnopqrstuvwxyz";
    private static final int ALPHABET_SIZE = ALPHABETS.length();

    private static char Char() {
        return ALPHABETS.charAt((int)(System.currentTimeMillis() % ALPHABET_SIZE));
    }

    private static long Digits(int numDigits) {
        return System.currentTimeMillis()% (long) Math.pow(10, numDigits);
    }

    private static String generateRegistrationNumber() {
        StringBuilder registrationNumber = new StringBuilder();

        // Generate initial 4-digit year
        registrationNumber.append(Digits(4));

        // Generate 3 small letters
        for (int i = 0; i < 3; i++) {
            registrationNumber.append(Char());
        }

        // Generate last 3 digits
        registrationNumber.append(Digits(3));

        return registrationNumber.toString();
    }

    public static void main(String[] args) {
        int[] arrays = {1000, 5000, 20000, 50000};

        for (int size : arrays) {
            String[] registrations = new String[size];

            long startTime = System.currentTimeMillis();

            // Generate registration numbers
            for (int i = 0; i < size; i++) {
                registrations[i] = generateRegistrationNumber();
            }

            long elapsed = System.currentTimeMillis() - startTime;

            System.out.println("Time taken " + elapsed + " milliseconds.");
        }
    }
}
