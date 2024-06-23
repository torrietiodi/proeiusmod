public class TimeUnitNode {
    private List<TimeUnitNode> children;

    // Other fields and methods

    public void merge(TimeUnitNode other) {
        if (other.getChildren() != null) {
            if (this.children == null) {
                this.children = new ArrayList<>();
            }
            this.children.addAll(other.getChildren());
        }
    }

    // Other methods
}
