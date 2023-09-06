 class Lion extends Animal {
    public Lion(String animalName) {
        super(animalName);

    }
     @Override
     public void animalSound() {
         System.out.println(super.animalName + " roars like a lion");
     }

 }