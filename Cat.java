public class Cat extends Animal{

    public Cat(String animalName){
        super(animalName);

    }

    public void talk(){
        System.out.println(animalName+ " mewosao");
        for(int i = 0;i < 5; i++){
            breathe();
        }
    }
}
