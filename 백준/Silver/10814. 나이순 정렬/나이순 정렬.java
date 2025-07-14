import java.util.*;

public class Main{
    
    static class Member{
        int age;
        String name;
        int idx;
        
        public Member(int age, String name, int idx){
            this.age = age;
            this.name = name;
            this.idx = idx;
        }
    }
    
    public static void main(String[] args){
        List<Member> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < n;i++){
            String[] str = sc.nextLine().split(" ");
            list.add(new Member(Integer.parseInt(str[0]), str[1], i));
        }
        
        list.sort((l1,l2) -> {
            if(l1.age == l2.age){
                return l1.idx - l2.idx;
            }
            return l1.age - l2.age;
        });
        
        for(Member m : list){
            System.out.println(m.age + " " + m.name);
        }
        
        
    }
}