public class App {
    public static void duplicadosNao(String[] lista1, String[] lista2){
        for ( int i = 0; i < lista1.length; i++){
            for ( int j = 0; j < lista2.length; j++){
                if(lista1[i]==lista2[j]){
                    System.out.println(lista1[i]);
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        String[] lista1 = new String[]{"morango", "manga", "banana"};
        String[] lista2 = new String[]{"kiwi","abacaxi","morango"};
        
        duplicadosNao(lista1, lista2);
    }
}
