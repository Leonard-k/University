package Prog1.chapter8;

public class EvenNumber {
    private int n;

    public EvenNumber(int n) throws NotEvenException {
        if (n % 2 != 0)
            throw new NotEvenException(n);
        else
            this.n = n;
    }

    public EvenNumber add(EvenNumber number, EvenNumber... numbers) {
        int sum = n + number.getInt();
        for (EvenNumber e : numbers) {
            sum += e.getInt();
        }
        try {
            return new EvenNumber(sum);
        } catch (NotEvenException e) {
            // can't really happen cause input numbers are always even
            return null;
        }
    }

    public EvenNumber multiplyWith(EvenNumber number, EvenNumber... numbers) {
        int sum = n * number.getInt();
        for (EvenNumber e : numbers) {
            sum *= e.getInt();
        }
        try {
            return new EvenNumber(sum);
        } catch (NotEvenException e) {
            // can't really happen cause input numbers are always even
            return null;
        }
    }

    @Override
    public String toString() {
        return this.getInt() + "";
    }

    public int getInt() {
        return n;
    }
}
