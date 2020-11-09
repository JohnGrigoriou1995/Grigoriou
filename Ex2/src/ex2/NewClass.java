package ex2;

import java.util.Scanner;
import java.util.ArrayList;

public class NewClass {
    public void runP(){
        Scanner sc = new Scanner(System.in);
        String answer;
        Pet pet1 = new Pet();
        ArrayList<Person> people = new ArrayList();
        for(int i=0; i<3; i++){
            Person person = new Person();
            System.out.println("enter persons name");
            person.name = sc.nextLine();
            System.out.println("enter age");
            person.age = Integer.parseInt(sc.nextLine());
            answer = yesOrNo();
            if(answer.equals("yes")){
                pet1.type = chooseType();
                System.out.println("enter name pet");
                pet1.nickname = sc.nextLine();
                person.pets.add(pet1);
            }
            people.add(person);
        }
        print(people);
    }
    
    
    public String chooseType(){
       Scanner sc = new Scanner(System.in);
       String type;
       ArrayList<String> animals = new ArrayList<String>();
       animals.add("dog");
       animals.add("cat");
       animals.add("fish");
       animals.add("rabbit");
       do{
           System.out.println("Enter pets type");
           type = sc.nextLine();   
       }while(!(animals.contains(type)));
       return type;
    }
//    public String chooseName(){
//       Scanner sc = new Scanner(System.in);
//       System.out.println("Enter pets name");
//       String nickname = sc.nextLine();
//       return nickname;
    public String yesOrNo(){
        String answer;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("do u have a pet?");
            answer = sc.nextLine().toLowerCase();       
        }while(!"yes".equals(answer) && !"no".equals(answer));
        return answer;
        }
    public void print(ArrayList<Person> people){
        for (int i=0; i<people.size(); i++){
            System.out.println("name: " + people.get(i).name + "\n age: " + people.get(i).age);
            if (!(people.get(i).pets.isEmpty())){
                for (int j = 0; j<people.get(i).pets.size(); j++){
                    System.out.println("pet: " + people.get(i).pets.get(j).nickname);  
                    System.out.println("type: " + people.get(i).pets.get(j).type);
                }
            }    
        }    
    }
}




       
    
