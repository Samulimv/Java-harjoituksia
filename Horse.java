public class Horse extends Animal {

    public Horse(String animalName){
        super(animalName);
    }

    public void talk(){
        System.out.println(animalName+ " powwwww");
        for(int i = 0; i < 5; i++){
            breathe();
        }
        
    }


}
