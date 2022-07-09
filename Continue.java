public class Continue {
    public static void main(String args[]){
        for(int i=0; i<=2; i++){
            for(int j=0; j<=6; j++){
                if(j==5){
                    continue;
                }
                System.out.println(j);
            }
        }
    }
}
