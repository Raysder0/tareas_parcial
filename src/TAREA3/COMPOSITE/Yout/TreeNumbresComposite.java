package TAREA3.COMPOSITE.Yout;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class TreeNumbresComposite implements TreeNumbers{

    private String name;
    private ArrayList<TreeNumbers> treeNumbersList;

    public TreeNumbresComposite(String name) {
        this.name = name;
        this.treeNumbersList = new ArrayList<>();
    }

    @Override
    public void add(TreeNumbers treeNumbers) {
        this.treeNumbersList.add(treeNumbers);
    }

    @Override
    public void remove(TreeNumbers treeNumbers) {
        this.treeNumbersList.remove(treeNumbers);
    }

    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public int numberOfNodes() {
        return this.treeNumbersList.size();
    }

    @Override
    public int Sum() {
        return this.treeNumbersList.stream().mapToInt(TreeNumbers::Sum).sum();
    }

    @Override
    public int higher() {
        return this.treeNumbersList.stream().mapToInt(TreeNumbers::higher).max().orElseThrow(NoSuchElementException::new);
    }

    @Override
    public String toString() {
        return "TreeNumbresComposite{" +
                "name='" + name + '\'' +
                '}';
    }
}
