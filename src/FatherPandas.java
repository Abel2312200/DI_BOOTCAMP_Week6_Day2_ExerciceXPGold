public class FatherPandas {

    // Class attributes
    public boolean isPredator;
    protected int  weight = 0;
    private int age;

    // Class Methods
    public void eat(){
        weight += 1;
        System.out.println("Weight : "+weight);
        System.out.println("Age : "+age);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
