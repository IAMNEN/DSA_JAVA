abstract class animal {
    public abstract void sayhello();

    public abstract void saybye();
}

class dog extends animal {
    public void sayhello() {
        System.out.println("Wow Wow");
    }

    public void saybye() {
        System.out.println("Wow");
    }
}

class cat extends animal {
    public void sayhello() {
        System.out.println("Meow");
    }

    public void saybye() {
        System.out.println("Meow Meow");
    }
}

public class abstraction {
    public static void main(String[] args) {
        dog a = new dog();
        cat c = new cat();
        c.saybye();
        c.sayhello();
        a.saybye();
        a.sayhello();
    }
}
