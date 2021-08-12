import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();



        int count = 0;
        String results = "";

        for(int i=0;i<input.length();){
            char begin = input.charAt(i);
            //System.out.println("begin is: "+begin);

            for(int j=i+1; j<input.length();j++){
                char next = input.charAt(j);
                //System.out.println("next is: "+next);

                if(begin == next){
                    count++;
                }
                else{
                    break;
                }
            }
            i+= count+1;
            if(count>0){
                String add = begin + "";
                int tempcount = count +1;

                results+= add + tempcount;

            }
            else{
                String add = begin + "";
                int tempcount = count +1;

                results+= add + tempcount;
            }

            count=0;

        }
        System.out.println(results);
    }
}