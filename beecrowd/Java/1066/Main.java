
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countPar = 0, countImpar = 0, countP = 0, countN = 0, num = 0;

        for(int i = 0; i < 5; i++){
            num = sc.nextInt();

            if(num%2==0){
                countPar += 1;
            } else {
                countImpar += 1;
            }

            if(num>0){
                countP += 1;
            } else if(num < 0){
                countN += 1;
            }
        }

        System.out.println(countPar+" valor(es) par(es)");
        System.out.println(countImpar+" valor(es) impar(es)");
        System.out.println(countP+" valor(es) positivo(s)");
        System.out.println(countN+" valor(es) negativo(s)");

        sc.close();
    }
}
