package mentoring.Practice14_ProgramPrinciples.homework.Task_6.before;

public class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Пингвины не летают");
    }
}