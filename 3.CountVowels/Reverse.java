class Reverse{
    public static void main(String args[]){
        String input="input";
        input=input.toLowerCase();
        int count=0,cons=0;
        for(char ch: input.toCharArray()){
            if("aeiou".indexOf(ch)!=-1) count++;
            else if (ch>='a' && ch<='z') cons++;
        }
        System.out.println(count+" "+cons);
    }
}