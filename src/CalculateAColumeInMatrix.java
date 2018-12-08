import java.util.Scanner;

public class CalculateAColumeInMatrix {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Độ rộng của ma trận là:");
    int height = scanner.nextInt();
    System.out.println("Độ dài của ma trận là:");
    int width = scanner.nextInt();
    int[][] twoDimensionalArrays = new int[height][width];

    System.out.println("Nhập mảng:");
    for (int i = 0; i < twoDimensionalArrays.length; i++)
      for (int j = 0; j < twoDimensionalArrays[0].length; j++) {
        System.out.print("Nhập giá trị phần tử có chỉ số [" + i + "][" + j + "]");
        twoDimensionalArrays[i][j] = scanner.nextInt();
      }

    System.out.println("Mảng vừa nhập là:");
    for (int i = 0; i < twoDimensionalArrays.length; i++) {
      for (int j = 0; j < twoDimensionalArrays[0].length; j++) {
        System.out.print(twoDimensionalArrays[i][j]+"\t");
      }
      System.out.print("\n");
    }

    try {
      System.out.println("Bạn muốn tính tổng cột: ");
      int columeWantToCalculate = scanner.nextInt();
      int sumOfChoicedColume = 0;

      for (int[] row : twoDimensionalArrays) {
        sumOfChoicedColume += row[columeWantToCalculate - 1];
      }
      System.out.printf("Tổng cột vừa chọn là %d", sumOfChoicedColume);
    } catch (ArrayIndexOutOfBoundsException ex) {
      System.out.println("Số cột hoặc hàng bạn nhập không tồn tại!");
    }
  }
}
