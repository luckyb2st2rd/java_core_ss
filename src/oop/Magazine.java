package oop;

public class Magazine extends Publication {
    public int issueNumber;

    public Magazine(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public String getType() {
        return "Журнал";
    }

    @Override
    public String toString() {
        String result = "Вы выбрали журнал ";
        return issueNumber;
    }

    @Override
    public boolean equals(Object obj) {
        Object o = new Object();
        super.equals(o);
        return true;
    }

    public int hashCode() {
        super.hashCode();
        return 1;
    }
}
