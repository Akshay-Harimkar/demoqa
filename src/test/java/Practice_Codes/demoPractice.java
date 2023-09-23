package Practice_Codes;


// class myClass{
//     private int number;

//     public myClass(int number){
//         this.number = number;
//     }


// }




public class demoPractice {
    public static void main(String[] args) {
        int [] num ={1,2,3,4,5};
        
        
        for(int i=0; i<num.length;i++){
            if (num[i] % 2 == 0){
            for (int j =0 ;j<num.length;j++){
                num[j] -= num[i];
                System.out.println("here :- "+num[j]+" - "+num[i]);
            }
           
        }
        }
        // for(int numbers : num){
        //     System.out.println(numbers);
        // }

      
    }
    
}
