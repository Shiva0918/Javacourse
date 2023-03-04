import org.testng.annotations.Test;

@Test
public class Bird{
    public void sing() {
        System.out.println("The bird is singing");
    }
}

class swift extends Bird{
    public void sing(){
        System.out.println("The swift goes usshhhhhh");
    }
}


class kingfisher extends Bird{
    public void sing(){
        System.out.println("The Kingfisher says euuuuuuu");
    }
}

