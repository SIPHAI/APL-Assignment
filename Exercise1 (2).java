import java.util.Random;

class Exercise1 {

  public static void main(String[] args) {
    char[][] array = new char[10][10];
    Random random = new Random();
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        array[i][j] = (char) (random.nextInt(26) + 'A');
      }
    }
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }
}