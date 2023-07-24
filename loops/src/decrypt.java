public class decrypt {
    public static int[] decrypt(int[] code, int k) {
        int[] decrypted = new int[code.length];
        for (int i = 0; i < code.length; i++) {
            int sum = 0;
            int position = k > 0 ? i + 1 : i - 1;
            for (int j = 0; j < Math.abs(k); j++) {
                position = (position + code.length) % code.length; // Wrap around for circular array
                sum += code[position];
                if (k < 0) {
                    position--;
                } else {
                    position++;
                }
            }
            decrypted[i] = sum;
        }
        return decrypted;
    }
}

