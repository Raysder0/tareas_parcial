package TAREA3.COMPOSITE.Yout;

public class TreeNumbersLeaf implements TreeNumbers{

    private int number;

    public TreeNumbersLeaf(int number) {
        this.number = number;
    }

    @Override
    public void add(TreeNumbers treeNumbers) {
        throw new UnsupportedOperationException("afdghbnm");
    }

    @Override
    public void remove(TreeNumbers treeNumbers) {

    }

    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public int numberOfNodes() {
        return 1;
    }

    @Override
    public int Sum() {
        return this.number;
    }

    @Override
    public int higher() {
        return this.number;
    }

    @Override
    public String toString() {
        return "TreeNumbersLeaf{" +
                "number=" + number +
                '}';
    }
}
