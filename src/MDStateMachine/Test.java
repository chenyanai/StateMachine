package MDStateMachine;

public class Test {
    public static void main(String[] args){
        Context context = new Context();
        context.turnOn();
        context.internetOn();
        context.internetOff();
        context.internetOn();
        context.internetOff();
        context.internetOn();
        context.turnOff();
        context.internetOff();
        context.internetOn();
        context.turnOn();
        context.internetOn();
        context.internetOff();
        context.internetOn();
    }
}
