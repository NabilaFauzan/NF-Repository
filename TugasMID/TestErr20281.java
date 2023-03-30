//Nabila Fauzan 13020210281
public class TestErr20281{
    public static void main(String[]args){
        int tot=0;
        for(int i=0; i<10;i++){
            tot +=i;
        }
        int i=5;
        int j=6;
        if(i<j){
            System.out.println(i);
        }
        else{
            System.out.println(j);
        }
        do{
            j++;
        }while(j<10);
        j++;
    }
}
