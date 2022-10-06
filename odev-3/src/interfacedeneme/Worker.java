package interfacedeneme;

public class Worker implements IWorkable, IEatable{
    @Override
    public void work() {
        System.out.println("able to work");
    }

    @Override
    public void eat() {
        System.out.println("able to eat");
    }
}
