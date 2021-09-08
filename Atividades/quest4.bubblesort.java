public class bubblesort {
    public static void main(String[] args) {

        int vet[] = {5,8,32,67,99,15,12,9,1,99};

        for(int i = 0; i<vet.length;i++) {
            for(int j = 0; j<vet.length-1;j++){
                int aux = 0;
                if(vet[j] > vet[j + 1]){
                    aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
            }
        }

        for(int j = 0; j<vet.length;j++){
            System.out.println(vet[j]);
        }
    }
}
