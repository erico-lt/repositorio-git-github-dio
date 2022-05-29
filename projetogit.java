public class projetogit {
    public static void main(String[] args){
        int fatorial = 7;
        for(int cont = fatorial - 1; cont > 1; cont--){
            fatorial *= cont;
        }
        System.out.println(fatorial);
    }
}
