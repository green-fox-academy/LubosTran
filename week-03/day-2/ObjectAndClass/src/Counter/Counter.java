package Counter;

public class Counter {
    int value;

    public Counter(){

    }
    public Counter (int value){
        this.value = value;
    }

    public void add(int number){
         this.value = value+number;
    }
    public void add(){
        this.value += 1;
    }
    public int get(){
        return this.value;
    }
    public void reset(){
        this.value = 0;
    }
}
