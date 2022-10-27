package Hash;

public class HashFunction1 {
    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % 90;

    }
    public static void main(String[] args) {
        HashFunction1 hf = new HashFunction1();
        System.out.println(hf.hash("kyeongrok"));


    }
}

