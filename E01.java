class E01{
    public static void main(String[] args){
        int x[] = {2,3,5};
        int y = 2;
        findLast(x,y);
    }

    public static int findLast(int[] x, int y){
        for(int i=x.length-1; i>0; i--){
            System.out.println("x["+i+"]");
            if(x[i] == y){       
                System.out.println("return i="+i);
                return i;
            }
        }
        System.out.println("return -1");
        return -1;
    }
}