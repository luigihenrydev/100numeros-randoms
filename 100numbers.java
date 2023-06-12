import java.util.Random;
class Main {
    public static void main(String[] args) {
      Random gerador = new Random();
      int menor = Integer.MAX_VALUE;
      int maior = Integer.MIN_VALUE;
      for (int N1 = 1; N1 <= 100; N1++){
      System.out.println(gerador.nextInt());
        int N2 = gerador.nextInt();
        if (N2 < menor){
          menor = N2;
        }
        if (N2 > maior){
          maior = N2;
        }
    }
      System.out.println("O menor número é " + menor);
      System.out.println("O maior número é " + maior);
  }
}