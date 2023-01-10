import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
      //Crie utilizando tudo que aprendeu até o momento, uma pirâmide de números, onde você deve imprimir em cada linha separada a quantidade de números que está sendo iterado no momento!
      //Exemplo:
      //1
      //22
      //333
      //4444

      Scanner sc = new Scanner(System.in);
      System.out.println("Digite um número: ");
      int número = sc.nextInt();

      for (int i = 1; i <= número; i++) {
        for (int j = 1; j <= i; j++) {
          System.out.print(i);
        }
        System.out.println();
      }
      sc.close();
    }
}
