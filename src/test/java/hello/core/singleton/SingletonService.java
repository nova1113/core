package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

//    Singleton객체를 받을 때 .getInstance()로 받아 올 수 있기 때문에 구체 클래스에 의존하게 된다.
    public static SingletonService getInstance(){
        return instance;
    }

    private SingletonService(){
    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }

}