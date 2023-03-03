package group1.Chapter12.TypeAnno;

public class TypeAnnoDemo<@What(description = "use annotation in constructor") T> {
    public @Unique TypeAnnoDemo() {
    }

    @TypeAnno String str;
    @EmptyOk
    String test;

    public int f(@TypeAnno TypeAnnoDemo<T>this, int x) {
        return 10;
    }

    public @TypeAnno Integer f2(int j, int k) {
        return j + k;
    }

    public void f4() throws @TypeAnno NullPointerException {

    }

    String @MaxLen(10) [] @NotZeroLen [] w;
    @TypeAnno Integer[] vec;

    public static void myMeth(int i) {
        myMeth(10);
    }

    class SomeClass extends @TypeAnno TypeAnnoDemo<Boolean> {
    }

    public @TypeAnno Integer f3(int j, int k) {
        return j + k;
    }
}
