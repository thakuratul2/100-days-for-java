package Strings;

class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        //setChar At
        sb.setCharAt(2, 'H'); 
        System.out.println(sb);
        //insert
        sb.insert(3,'j');
        System.out.println(sb);
        //delete
        sb.delete(2,3);
        System.out.println(sb);
        //reverse
        sb.reverse();
        System.out.println(sb);
        //append
        sb.append(" World");
        System.out.println(sb);
        //replace
        sb.replace(0,5,"Atul");
        System.out.println(sb);
        
    }
}
