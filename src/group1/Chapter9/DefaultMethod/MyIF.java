package group1.Chapter9.DefaultMethod;

public interface MyIF {
    int getNumber();

    default String getString(){
        return "Object Default String";
    }
}
