import java.util.Random;

class Main
{
    public static int generateRandomAge(int n)
    {
        if (n < 0) {
            throw new IllegalArgumentException("Можно идти гулять");
        }

        return new Random().nextInt(n + 25);
    }

    public static void main(String[] args)
    {
        int n = 5;
        System.out.println(generateRandomAge(n));
    }
}
