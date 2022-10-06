package interfacedeneme;

public class interfaceDeneme {
    public void start(){
        Worker person=new Worker();
        person.work();
        person.eat();

        OutsourceWorker worker2=new OutsourceWorker();
        worker2.work();
        // no eat to able

    }


}
